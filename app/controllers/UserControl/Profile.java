package controllers.UserControl;

import java.util.List;

import models.Foods.FoodItem;
import models.Restaurants.Restaurant;
import models.User.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class Profile  extends Controller{
	
	public static Result profileProvider()
	{
		String str=session("connected");
		if(str==null)
		{
			return redirect("/");
		}
		Long id=Long.valueOf(str);
		User temp=User.find.where().eq("id",id).findUnique();
		List<Restaurant> restaurantList=Restaurant.find.orderBy("rating desc").setMaxRows(10).findList();
		List<FoodItem> foodList=FoodItem.find.orderBy("rating desc").setMaxRows(10).findList();
		return ok(views.html.userend.profile.render(temp,restaurantList,foodList));
	}
	
}
