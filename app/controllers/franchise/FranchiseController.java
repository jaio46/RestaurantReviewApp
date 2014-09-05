package controllers.franchise;


import java.util.Date;
import java.util.List;
import java.util.Map;

import models.*;
import play.data.Form;
import play.mvc.*;
import views.*;


public class FranchiseController extends Controller{
	
	static public Form<Franchise> franchiseForm = Form.form(Franchise.class);
	
	public static Result createFranchise() {
		
		return ok(
				views.html.franchise.crateFranchise.render(franchiseForm)
				);
		
	}
	
	
	public static Result addNewFranhcise(){
		
		Map<String, String[]> params = request().body().asFormUrlEncoded();
    	
		String name= params.get("franchiseTitle")[0];
		String email=params.get("email")[0];
		String phone=params.get("phone")[0];
		String address=params.get("address")[0];
		
		Franchise franchise=new Franchise(name,email,phone,address);
		
		franchise.save();
		
		return ok("Franchise Added!");
	}
	
	
	
}
