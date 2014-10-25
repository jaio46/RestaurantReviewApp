package controllers.Search;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import models.Foods.FoodItem;
import models.Restaurants.Restaurant;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class AnswerQueryWithJson  extends Controller{
	
	static Set<String> st;
	
	public static Result answer(String x)
	{
		String res="";
		List<Restaurant> restaurantList=Restaurant.find.where().like("restaurantName", x).orderBy("rating desc").setMaxRows(5).findList();
		List<FoodItem> foodList=FoodItem.find.where().like("itemName", "%"+x+"%").orderBy("rating desc").setMaxRows(5).findList();
		res="[";
		int i;
		boolean f=false;
		for(i=0;i<restaurantList.size();i++)
		{
			if(f)
			{
				res+=",";
			}
			else
			{
				f=true;
			}
			res+="\""+restaurantList.get(i).getRestaurantName()+"\"";
		}
		for(i=0;i<foodList.size();i++)
		{
			if(f)
			{
				res+=",";
			}
			else
			{
				f=true;
			}
			res+="\""+foodList.get(i).getItemName()+" from "+foodList.get(i).getRestaurant().getRestaurantName()+"\"";
		}
		res+="]";
		return ok(res);
	}
	
	public static Result preload()
	{
		String res="";
		List<Restaurant> restaurantList=Restaurant.find.orderBy("rating desc").setMaxRows(5).findList();
		List<FoodItem> foodList=FoodItem.find.orderBy("rating desc").setMaxRows(5).findList();
		res="[";
		int i;
		boolean f=false;
		for(i=0;i<restaurantList.size();i++)
		{
			if(f)
			{
				res+=",";
			}
			else
			{
				f=true;
			}
			st.add(restaurantList.get(i).getRestaurantName());
			res+="\""+restaurantList.get(i).getRestaurantName()+"\"";
		}
		for(i=0;i<foodList.size();i++)
		{
			if(f)
			{
				res+=",";
			}
			else
			{
				f=true;
			}
			st.add(foodList.get(i).getItemName());
			res+="\""+foodList.get(i).getItemName()+" from "+foodList.get(i).getRestaurant().getRestaurantName()+"\"";
		}
		res+="]";
		return ok(res);
	}
	
	public static Result searchPage(String searchKey)
	{
		
		return ok("");
	}
	
}