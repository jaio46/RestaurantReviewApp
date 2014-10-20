package controllers.isdrun;

/**
 * Created by User on 9/7/14.
 */

import java.util.Map;





import models.User.User;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class test extends Controller{
	
	public static User temp;
	
	public static Form userForm=new Form(User.class);
	
    public static Result index()
    {
        return ok(views.html.isdrun.NewTest.render());
    }

    public static Result objectView()
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
    	/*
    	JsonNode obj=request().body().asJson();
    	if(obj ==null)
    	{
    		return badRequest("Null object");
    	}
    	else
    	{
    		temp=new User();
    		//temp.firstName=obj.findPath("name").textValue();
    		temp.id=Integer.parseInt(obj.findPath("id").textValue());
    		//temp.email=obj.findPath("email").textValue();
    		return ok("/new");
    	}*/
    	return ok("http://localhost:9000/new");
    }
    
    public static Result newUser()
    {	
    	return ok("");
    }
}
