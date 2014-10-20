// @SOURCE:/Users/sheikhahmed/Projects/RestaurantApp/conf/routes
// @HASH:7a3136345e3da27cfce8f18563be35063a7fc47f
// @DATE:Mon Oct 20 18:19:23 BDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_isdrun_home_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:9
private[this] lazy val controllers_WebJarAssets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_isdrun_User_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("User/"),DynamicPart("user", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_isdrun_Restaurant_index4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Restaurant/"),DynamicPart("restaurant", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_isdrun_test_index5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:16
private[this] lazy val controllers_isdrun_test_objectView6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/JSON/"))))
        

// @LINE:18
private[this] lazy val controllers_isdrun_test_newUser7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new"))))
        
def documentation = List(("""GET""", prefix,"""controllers.isdrun.home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """User/$user<[^/]+>""","""controllers.isdrun.User.index(user:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Restaurant/$restaurant<[^/]+>""","""controllers.isdrun.Restaurant.index(restaurant:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.isdrun.test.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/JSON/""","""controllers.isdrun.test.objectView()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new""","""controllers.isdrun.test.newUser()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_isdrun_home_index0(params) => {
   call { 
        invokeHandler(controllers.isdrun.home.index(), HandlerDef(this, "controllers.isdrun.home", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:9
case controllers_WebJarAssets_at2(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_isdrun_User_index3(params) => {
   call(params.fromPath[String]("user", None)) { (user) =>
        invokeHandler(controllers.isdrun.User.index(user), HandlerDef(this, "controllers.isdrun.User", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """User/$user<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_isdrun_Restaurant_index4(params) => {
   call(params.fromPath[String]("restaurant", None)) { (restaurant) =>
        invokeHandler(controllers.isdrun.Restaurant.index(restaurant), HandlerDef(this, "controllers.isdrun.Restaurant", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """Restaurant/$restaurant<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_isdrun_test_index5(params) => {
   call { 
        invokeHandler(controllers.isdrun.test.index(), HandlerDef(this, "controllers.isdrun.test", "index", Nil,"GET", """""", Routes.prefix + """test"""))
   }
}
        

// @LINE:16
case controllers_isdrun_test_objectView6(params) => {
   call { 
        invokeHandler(controllers.isdrun.test.objectView(), HandlerDef(this, "controllers.isdrun.test", "objectView", Nil,"POST", """""", Routes.prefix + """test/JSON/"""))
   }
}
        

// @LINE:18
case controllers_isdrun_test_newUser7(params) => {
   call { 
        invokeHandler(controllers.isdrun.test.newUser(), HandlerDef(this, "controllers.isdrun.test", "newUser", Nil,"GET", """""", Routes.prefix + """new"""))
   }
}
        
}

}
     