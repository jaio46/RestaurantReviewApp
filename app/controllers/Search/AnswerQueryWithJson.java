package controllers.Search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
		List<Restaurant> restaurantList=Restaurant.find.where().like("restaurantName", "%"+x+"%").orderBy("rating desc").setMaxRows(5).findList();
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
	
	public static Result searchPage()
	{
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		String x=params.get("check")[0];
		int val=x.indexOf("from");
		String src=x;
		if(val!=-1)
		{
			src=x.substring(0, val);
			src=src.trim();
		}
		
		List<Restaurant> restaurantList=Restaurant.find.where().like("restaurantName", "%"+x+"%").orderBy("rating desc").setMaxRows(5).findList();
		List<FoodItem> foodList=FoodItem.find.where().like("itemName", "%"+src+"%").orderBy("rating desc").setMaxRows(5).findList();
		
		return ok(views.html.search.searchResultPage.render(x,restaurantList,foodList));
	}
	
}