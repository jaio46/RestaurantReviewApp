package controllers.restaurant;


import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;

public class RestaurantFoodController extends Controller{
	
	static public Form<RestaurantFood> foodForm = Form.form(RestaurantFood.class);
	
	
	public static Result addFoodInMenu(Long id) {
		
		Restaurant res=Restaurant.find.where().eq("id",id).findUnique();
		
		List<FoodItem> lst=FoodItem.find.all();
		
		return ok(
				views.html.foods.addInRestaurant.render(foodForm,lst,res)
				);
		
	}
	
	public static Result addFoodInRestaurant(Long id){
		
		Restaurant res=Restaurant.find.where().eq("id",id).findUnique();
		
		Map<String, String[]> params = request().body().asFormUrlEncoded();
    	
		String fid= params.get("foodItem")[0];
		String price=params.get("price")[0];
		String dtls=params.get("details")[0];
		
		Long fr=Long.parseLong(fid);
		int pr=Integer.valueOf(price);
		
		FoodItem f=FoodItem.find.where().eq("id",fr).findUnique();
		
		RestaurantFood x=new RestaurantFood(pr,dtls,f,res);
		
		x.save();
		return ok("Done");
	}
	
}
