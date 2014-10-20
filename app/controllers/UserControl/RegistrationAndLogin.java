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
    		temp.firstName=obj.findPath("name").textValue();
    		temp.email=obj.findPath("email").textValue();
    		temp.id=Integer.parseInt(obj.findPath("id").textValue());
    	}
    	//if user exists
    	
    	//if dont exist
    	return ok("http://localhost:9000/new");
    	
	}
	
	public static Result newUser()
	{
		return ok(views.Register.register.render(temp, userForm));
	}
	
}
