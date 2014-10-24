package controllers.UserFeed;

import models.Feeds.FeedOnFoodItem;
import models.Feeds.FeedOnRestaurant;
import models.Foods.FoodItem;
import models.Restaurants.Restaurant;
import models.User.User;
import play.mvc.Controller;
import play.mvc.Result;

public class UserFeedOnRestaurant extends Controller{
	
	public static Result feedOnRestaurant(int restaurantId, int rating)
	{
		String val=session("connected");
		if(val==null)
		{
			return redirect("/");
		}
		User user=User.find.where().eq("id", Integer.parseInt(val)).findUnique();
		Restaurant temp=Restaurant.find.where().eq("id", restaurantId).findUnique();
		int ret=(int)((double)temp.rating*temp.ratedBy);
		FeedOnRestaurant x=FeedOnRestaurant.find.where().eq("feeder", user).eq("restaurnat", temp).findUnique();
		if(x==null)
		{
			//new
			x=new FeedOnRestaurant();
			x.rating=rating;
			x.feeder=user;
			x.restaurnat=temp;
			x.save();
			temp.ratedBy++;
			ret+=x.rating;
			temp.rating=(double)ret/temp.ratedBy;
			temp.update();
		}
		else
		{
			ret-=x.rating;
			x.rating=rating;
			x.update();
			ret+=x.rating;
			temp.rating=(double)ret/temp.ratedBy;
			temp.update();
		}
		
		//update in restauarant
		
		return ok(String.valueOf(temp.rating));
	}
	
	public static Result feedOnFood(int foodId, int rating)
	{
		String val=session("connected");
		if(val==null)
		{
			return redirect("/");
		}
		User user=User.find.where().eq("id", Integer.parseInt(val)).findUnique();
		FoodItem item=FoodItem.find.where().eq("id", foodId).findUnique();
		int ret=(int)((double)item.ratedBy*item.rating);
		FeedOnFoodItem feed=FeedOnFoodItem.find.where().eq("feeder", user).eq("item", item).findUnique();
		if(feed==null)
		{
			
		}
		else
		{
			
		}
		return ok("");
	}
}
