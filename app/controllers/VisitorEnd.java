package controllers;

import java.util.Map;

import models.Visitor;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;


public class VisitorEnd extends Controller{
    static Form<Visitor> signUpForm = Form.form(Visitor.class);
	
    public static Result index() {
        return ok(views.html.index.render(signUpForm));
    }
	
	public static Result signUp(){
		Form<Visitor> signUpFormFilled = signUpForm.bindFromRequest();
		if(signUpFormFilled.hasErrors()){
			return ok(signUpFormFilled.errors().toString());
		}
		
		Visitor newVisitor = signUpFormFilled.get();
		newVisitor.save();
		
		return ok("New Visitor Registered with : " +newVisitor.visitorID+" "+ newVisitor.firstName + " " + newVisitor.lastName + " " + newVisitor.password );
	}
	
	public static Result signIn(){
		Map<String, String[]> args = request().body().asFormUrlEncoded();
		
		String visitorID = args.get("visitorID")[0];
		String password = args.get("password")[0];
		
		try {
			Visitor newVisitor = Visitor.find.where().eq("visitorID", visitorID).findUnique();
			
			if(password.equals(newVisitor.password)){
				session().clear();
				session("visitorID",String.valueOf(newVisitor.visitorID));
				return ok(views.html.showVisitorProfile.render(newVisitor));
				//return redirect("/showRestaurant");
			}
			else 
				throw new IllegalStateException();
		}
		catch (NullPointerException exception){
			return ok("go home, you are drunk, Visitor ID doesn't exixt");
		}
		
		catch (IllegalStateException exception){
			return ok("Wrong Password: go home you are drunk");
		}
	}
	

}
