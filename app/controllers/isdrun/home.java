package controllers.isdrun;


import java.util.Map;

import models.Visitor;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

/**
 * Created by User on 8/23/14.
 */
public class home extends Controller{
    public static Result index()
    {
        return ok(views.html.isdrun.home.render());
    }
}
