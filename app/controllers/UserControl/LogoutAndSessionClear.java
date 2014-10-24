package controllers.UserControl;

import play.mvc.Controller;
import play.mvc.Result;

public class LogoutAndSessionClear extends Controller{
	public static Result logout()
	{
		session().remove("connected");
		return redirect("/");
	}
}
