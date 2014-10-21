package controllers.Franchise;


import java.util.List;
import java.util.Map;

import models.Restaurants.Franchise;
import models.Restaurants.Restaurant;
import models.User.User;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class FranchiseManager extends Controller{
	
	public static Form<Franchise> form = new Form(Franchise.class);
	
	public static Result createNewFranchise()
	{
		String val=session("connected");
		if(val==null)
		{
			return redirect("/");
		}
		return ok(views.html.franchise.newFranchise.render(form));
	}
	
	public static Result saveFranchiseAndShowProfile()
	{
		String val=session("connected");
		if(val==null)
		{
			return redirect("/");
		}
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		Franchise temp= new Franchise();
		temp.franchiseName=params.get("Name")[0];
		temp.franchiseEmail=params.get("Email")[0];
		temp.franchiseEmail=params.get("Address")[0];
		temp.franchiseEmail=params.get("Phone")[0];
		temp.createdBy=User.find.where().eq("id", Long.parseLong(val)).findUnique();
		temp.save();
		return redirect("/franchise/"+temp.id);
	}
	
	public static Result franchiseProfile(int id)
	{
		Franchise temp=Franchise.find.where().eq("id", id).findUnique();
		List<Restaurant> list = Restaurant.find.where().eq("franchise", temp).findList();
		return ok(views.html.franchise.franchiseProfile.render(temp,list));
	}
	
	public static Result franchiseByMe()
	{
		return ok("");
	}
}
