package controllers.isdrun;

/**
 * Created by User on 9/7/14.
 */

import java.util.Map;


import com.fasterxml.jackson.databind.JsonNode;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class test extends Controller{
    public static Result index()
    {
        return ok(views.html.isdrun.NewTest.render());
    }

    public static Result objectView()
    {
    	JsonNode obj=request().body().asJson();
    	return ok(views.html.isdrun.test.render());
    }
}
