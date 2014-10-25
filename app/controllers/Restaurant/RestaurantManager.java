package controllers.Restaurant;

import java.util.List;
import java.util.Map;

import com.avaje.ebean.annotation.Where;

import models.Foods.FoodItem;
import models.Restaurants.Franchise;
import models.Restaurants.Restaurant;
import models.User.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class RestaurantManager extends Controller{
	
	public static Franchise franchise;
	public static Form<Restaurant> restaurantForm= new Form(Restaurant.class);
	public static Form<FoodItem> foodForm=new Form(FoodItem.class);
	public static Restaurant temp;
	
	public static Result createNewRestaurant(int id)
	{
		franchise=Franchise.find.where().eq("id", id).findUnique();
		List<Restaurant> list=Restaurant.find.where().eq("franchise", franchise).orderBy("rating desc").setMaxRows(5).findList();
		int cnt=Restaurant.find.where().eq("franchise",franchise).findRowCount();
		return ok(views.html.restaurant.restaurantCreation.render(franchise,restaurantForm,list,cnt));
	}
	
	public static Result saveRestaurant()
	{
		String val=session("connected");
		if(val==null || franchise==null)
		{
			return redirect("/");
		}
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		
		temp= new Restaurant();
		temp.restaurantName=params.get("Name")[0];
		temp.restaurantEmail=params.get("Email")[0];
		temp.restaurantAddress=params.get("Address")[0];
		temp.restaurantPhone=params.get("Phone")[0];
		temp.franchise=franchise;
		temp.save();
		return redirect("/restaurant/"+String.valueOf(temp.id));
	}
	
	public static Result restaurantProfile(int id)
	{
		temp=Restaurant.find.where().eq("id", id).findUnique();
		List< FoodItem > list= FoodItem.find.where().eq("restaurant", temp).findList();
		return ok(views.html.restaurant.restaurantProfile.render(temp,list,foodForm)); 
	}
	
	public static Result addFood()
	{
		String val=session("connected");
		if(val==null || temp==null)
		{
			return ok("noo");
		}
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		
		FoodItem item= new FoodItem();
		
		item.itemName=params.get("Item Title")[0];
		item.itemCategory=params.get("Item Category")[0];
		item.restaurant=temp;
		item.save();
		
		return ok("saved");
	}
	
}
