package controllers.Search;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class AnswerQueryWithJson  extends Controller{
	
	public static Result answer(String x)
	{
		
		return ok("[\"anaconda\",\"anaronda\",\"anaqonda\",\"anazonda\"]");
	}
	
	public static Result preload()
	{
		String res="";
		
		return ok(res);
	}
	
}