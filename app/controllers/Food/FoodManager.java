package controllers.Food;

import models.Foods.FoodItem;
import play.mvc.Controller;
import play.mvc.Result;

public class FoodManager extends Controller{
	
	public static Result profile(int id)
	{
		FoodItem item=FoodItem.find.where().eq("id",id).findUnique();
		return ok(views.html.food.foodProfile.render(item));
	}
	
}
