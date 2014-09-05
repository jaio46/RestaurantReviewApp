package controllers.restaurant;

import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;
import static scala.collection.JavaConversions.*;

public class RestaurantController extends Controller{
	
	static public Form<Restaurant> restaurantForm=Form.form(Restaurant.class);
	
	public static Result createRestaurant() {
		
		List<Franchise> franchises= Franchise.find.all();
		
		return ok(
				views.html.restaurant.createRestaurant.render(restaurantForm, asScalaBuffer(franchises))
				);
		
	}
	
	public static Result addRestaurant(){
		
		Map<String, String[]> params = request().body().asFormUrlEncoded();
    	
		String name= params.get("name")[0];
		String email=params.get("email")[0];
		String phone=params.get("phone")[0];
		String address=params.get("address")[0];
		String frid=params.get("franchise")[0];
		
		Long fr=Long.parseLong(frid);
		
		Franchise frnchs=Franchise.find.byId(fr);
		
		Restaurant restaurant = new Restaurant(name,email,phone,address,frnchs);
		/*
		Visitor creator=Visitor.find.byId(Long.parseLong(session("visitorID")));
		restaurant.creator=creator;*/
		restaurant.save();
		
		return ok("Registered");
	}
	
	public static Result showRestaurantProfile(Long id){
		
		Restaurant res=Restaurant.find.where().eq("id",id).findUnique();
		List<RestaurantFood> foods= RestaurantFood.find.where().eq("restaurant",res).findList();
		
		return ok(views.html.restaurant.restaurantProfile.render(res,foods));
		
	}
	
	public static Result showAllRestaurant(){
		
		List< Restaurant > res= Restaurant.find.all();
		
		return ok(views.html.restaurant.showAllRestaurant.render(res));
	}
	
	
}
