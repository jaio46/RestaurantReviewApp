package controllers.isdrun;

/**
 * Created by User on 8/23/14.
 */

import java.util.Map;

import models.Visitor;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;


public class User extends Controller{
    public static Result index(String name)
    {
        return ok(views.html.isdrun.UserHome.render(name));
    }
}
