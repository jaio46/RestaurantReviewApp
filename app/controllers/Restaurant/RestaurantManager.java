package controllers.Restaurant;

import java.util.List;
import java.util.Map;

import models.Restaurants.Franchise;
import models.Restaurants.Restaurant;
import models.User.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class RestaurantManager extends Controller{
	
	public static Franchise franchise;
	public static Form<Restaurant> restaurantForm= new Form(Restaurant.class);
	
	public static Result createNewRestaurant(int id)
	{
		franchise=Franchise.find.where().eq("id", id).findUnique();
		List<Restaurant> list=Restaurant.find.orderBy("rating desc").setMaxRows(5).findList();
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
		Restaurant temp= new Restaurant();
		temp.restaurantName=params.get("Name")[0];
		temp.restaurantEmail=params.get("Email")[0];
		temp.restaurantAddress=params.get("Address")[0];
		temp.restaurantPhone=params.get("Phone")[0];
		temp.franchise=franchise;
		temp.save();
		return redirect("/restaurant/"+temp.id);
	}
	
	public static Result restaurantProfile(int id)
	{
		return ok("");
	}
	
	
	
}
