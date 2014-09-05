package controllers.foods;

import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;

public class FoodController extends Controller{
	
	static public Form<FoodItem> foodForm = Form.form(FoodItem.class);
	
	public static Result addNewFood(){
		
		return ok(
				views.html.foods.addInFoodDB.render(foodForm)
				);
		
	}
	
	public static Result saveFood(){
		
		Map<String, String[]> params = request().body().asFormUrlEncoded();
    	
		String Title= params.get("itemTitle")[0];
		String Category=params.get("category")[0];
		
		FoodItem x= new FoodItem(Title,Category);
		
		x.save();
		
		return ok("done");
	}
	
}
