package controllers.UserControl;

import models.User.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;

public class Profile  extends Controller{
	
	public static Result profileProvider(long id)
	{
		User temp=User.find.where().eq("id",id).findUnique();
		return ok(views.html.userend.profile.render(temp));
	}
	
}
