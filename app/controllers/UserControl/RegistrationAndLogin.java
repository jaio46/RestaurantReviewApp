package controllers.UserControl;

import java.util.Map;

import models.User.User;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class RegistrationAndLogin extends Controller{
	public static User temp;
	static Form<User> userForm=new Form(User.class);
	public static Result verifier()
	{
		JsonNode obj=request().body().asJson();
    	if(obj==null)
    	{
    		return badRequest("Null object");
    	}
    	else
    	{
    		temp=new User();
    		temp.name=obj.findPath("name").textValue();
    		temp.email=obj.findPath("email").textValue();
    		temp.id=Long.parseLong(obj.findPath("id").textValue());
    		saveSession();
    	}
    	//if user exists
    	
    	//if dont exist
    	//if(User)
    	User userWithRequest=User.find.where().eq("id",temp.id).findUnique();
    	if(userWithRequest==null)
    	{
    		return ok("http://localhost:9000/new");
    	}
    	else
    	{
    		saveSession();
    		return ok("http://localhost:9000/Profile/"+String.valueOf(temp.id));
    	}
    	
    	
	}
	
	public static void saveSession()
	{
		session("connected",String.valueOf(temp.id));
	}
	
	public static Result newUser()
	{
		String verifier=session("connected");
		if(temp==null || verifier==null)
		{
			return redirect("/");
			//return ok(views.html.isdrun.home.render());
		}
		else if(User.find.where().eq("id",temp.id).findUnique()!=null)
		{
			return redirect("/Profile/"+String.valueOf(temp.id));
		}
		else
		{
			return ok(views.html.userend.newuser.render(temp,userForm));
		}
	}
	
	public static Result saveUser()
	{
		Map<String, String[]> params = request().body().asFormUrlEncoded();
		User userToAdd=new User();
		userToAdd.name=params.get("Name")[0];
		userToAdd.email=params.get("Email")[0];
		userToAdd.userName=params.get("Username")[0];
		userToAdd.id=temp.id;
		userToAdd.save();
		return redirect("/Profile/"+String.valueOf(userToAdd.id));
	}
}
