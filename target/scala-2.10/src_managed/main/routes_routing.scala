// @SOURCE:G:/Play/Restaurant App/conf/routes
// @HASH:33f4e2c2dc7bdef23be21fb94aa4856af1565c50
// @DATE:Fri Sep 05 07:05:47 ALMT 2014


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
private[this] lazy val controllers_VisitorEnd_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:9
private[this] lazy val controllers_WebJarAssets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_restaurant_RestaurantController_createRestaurant3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addnewRestaurant"))))
        

// @LINE:13
private[this] lazy val controllers_restaurant_RestaurantController_addRestaurant4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newRestaurant"))))
        

// @LINE:14
private[this] lazy val controllers_restaurant_RestaurantController_showRestaurantProfile5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showProfile/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_restaurant_RestaurantController_showAllRestaurant6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewRestaurants"))))
        

// @LINE:16
private[this] lazy val controllers_franchise_FranchiseController_createFranchise7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createFranchise"))))
        

// @LINE:17
private[this] lazy val controllers_franchise_FranchiseController_addNewFranhcise8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newFranchise"))))
        

// @LINE:21
private[this] lazy val controllers_restaurant_RestaurantFoodController_addFoodInMenu9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addInMenu/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_restaurant_RestaurantFoodController_addFoodInRestaurant10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addedInMenu/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_foods_FoodController_addNewFood11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addNewItem"))))
        

// @LINE:24
private[this] lazy val controllers_foods_FoodController_saveFood12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addedFood"))))
        

// @LINE:27
private[this] lazy val controllers_VisitorEnd_signUp13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signUp"))))
        

// @LINE:28
private[this] lazy val controllers_VisitorEnd_signIn14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signIn"))))
        

// @LINE:29
private[this] lazy val controllers_VisitorEnd_index15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visitor"))))
        

// @LINE:30
private[this] lazy val controllers_VisitorEnd_index16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showRestaurant"))))
        

// @LINE:34
private[this] lazy val controllers_isdrun_home_index17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:35
private[this] lazy val controllers_isdrun_User_index18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("User/"),DynamicPart("user", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_isdrun_Restaurant_index19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Restaurant/"),DynamicPart("restaurant", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addnewRestaurant""","""controllers.restaurant.RestaurantController.createRestaurant()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newRestaurant""","""controllers.restaurant.RestaurantController.addRestaurant()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showProfile/$id<[^/]+>""","""controllers.restaurant.RestaurantController.showRestaurantProfile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewRestaurants""","""controllers.restaurant.RestaurantController.showAllRestaurant()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createFranchise""","""controllers.franchise.FranchiseController.createFranchise()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newFranchise""","""controllers.franchise.FranchiseController.addNewFranhcise()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addInMenu/$id<[^/]+>""","""controllers.restaurant.RestaurantFoodController.addFoodInMenu(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addedInMenu/$id<[^/]+>""","""controllers.restaurant.RestaurantFoodController.addFoodInRestaurant(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addNewItem""","""controllers.foods.FoodController.addNewFood()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addedFood""","""controllers.foods.FoodController.saveFood()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signUp""","""controllers.VisitorEnd.signUp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signIn""","""controllers.VisitorEnd.signIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visitor""","""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showRestaurant""","""controllers.VisitorEnd.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.isdrun.home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """User/$user<[^/]+>""","""controllers.isdrun.User.index(user:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Restaurant/$restaurant<[^/]+>""","""controllers.isdrun.Restaurant.index(restaurant:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_VisitorEnd_index0(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """"""))
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
        

// @LINE:12
case controllers_restaurant_RestaurantController_createRestaurant3(params) => {
   call { 
        invokeHandler(controllers.restaurant.RestaurantController.createRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "createRestaurant", Nil,"GET", """restaurants""", Routes.prefix + """addnewRestaurant"""))
   }
}
        

// @LINE:13
case controllers_restaurant_RestaurantController_addRestaurant4(params) => {
   call { 
        invokeHandler(controllers.restaurant.RestaurantController.addRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "addRestaurant", Nil,"POST", """""", Routes.prefix + """newRestaurant"""))
   }
}
        

// @LINE:14
case controllers_restaurant_RestaurantController_showRestaurantProfile5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.restaurant.RestaurantController.showRestaurantProfile(id), HandlerDef(this, "controllers.restaurant.RestaurantController", "showRestaurantProfile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """showProfile/$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_restaurant_RestaurantController_showAllRestaurant6(params) => {
   call { 
        invokeHandler(controllers.restaurant.RestaurantController.showAllRestaurant(), HandlerDef(this, "controllers.restaurant.RestaurantController", "showAllRestaurant", Nil,"GET", """""", Routes.prefix + """viewRestaurants"""))
   }
}
        

// @LINE:16
case controllers_franchise_FranchiseController_createFranchise7(params) => {
   call { 
        invokeHandler(controllers.franchise.FranchiseController.createFranchise(), HandlerDef(this, "controllers.franchise.FranchiseController", "createFranchise", Nil,"GET", """""", Routes.prefix + """createFranchise"""))
   }
}
        

// @LINE:17
case controllers_franchise_FranchiseController_addNewFranhcise8(params) => {
   call { 
        invokeHandler(controllers.franchise.FranchiseController.addNewFranhcise(), HandlerDef(this, "controllers.franchise.FranchiseController", "addNewFranhcise", Nil,"POST", """""", Routes.prefix + """newFranchise"""))
   }
}
        

// @LINE:21
case controllers_restaurant_RestaurantFoodController_addFoodInMenu9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.restaurant.RestaurantFoodController.addFoodInMenu(id), HandlerDef(this, "controllers.restaurant.RestaurantFoodController", "addFoodInMenu", Seq(classOf[Long]),"GET", """food""", Routes.prefix + """addInMenu/$id<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_restaurant_RestaurantFoodController_addFoodInRestaurant10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.restaurant.RestaurantFoodController.addFoodInRestaurant(id), HandlerDef(this, "controllers.restaurant.RestaurantFoodController", "addFoodInRestaurant", Seq(classOf[Long]),"POST", """""", Routes.prefix + """addedInMenu/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_foods_FoodController_addNewFood11(params) => {
   call { 
        invokeHandler(controllers.foods.FoodController.addNewFood(), HandlerDef(this, "controllers.foods.FoodController", "addNewFood", Nil,"GET", """""", Routes.prefix + """addNewItem"""))
   }
}
        

// @LINE:24
case controllers_foods_FoodController_saveFood12(params) => {
   call { 
        invokeHandler(controllers.foods.FoodController.saveFood(), HandlerDef(this, "controllers.foods.FoodController", "saveFood", Nil,"POST", """""", Routes.prefix + """addedFood"""))
   }
}
        

// @LINE:27
case controllers_VisitorEnd_signUp13(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signUp(), HandlerDef(this, "controllers.VisitorEnd", "signUp", Nil,"POST", """visitor """, Routes.prefix + """signUp"""))
   }
}
        

// @LINE:28
case controllers_VisitorEnd_signIn14(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.signIn(), HandlerDef(this, "controllers.VisitorEnd", "signIn", Nil,"POST", """""", Routes.prefix + """signIn"""))
   }
}
        

// @LINE:29
case controllers_VisitorEnd_index15(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """visitor"""))
   }
}
        

// @LINE:30
case controllers_VisitorEnd_index16(params) => {
   call { 
        invokeHandler(controllers.VisitorEnd.index(), HandlerDef(this, "controllers.VisitorEnd", "index", Nil,"GET", """""", Routes.prefix + """showRestaurant"""))
   }
}
        

// @LINE:34
case controllers_isdrun_home_index17(params) => {
   call { 
        invokeHandler(controllers.isdrun.home.index(), HandlerDef(this, "controllers.isdrun.home", "index", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:35
case controllers_isdrun_User_index18(params) => {
   call(params.fromPath[String]("user", None)) { (user) =>
        invokeHandler(controllers.isdrun.User.index(user), HandlerDef(this, "controllers.isdrun.User", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """User/$user<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_isdrun_Restaurant_index19(params) => {
   call(params.fromPath[String]("restaurant", None)) { (restaurant) =>
        invokeHandler(controllers.isdrun.Restaurant.index(restaurant), HandlerDef(this, "controllers.isdrun.Restaurant", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """Restaurant/$restaurant<[^/]+>"""))
   }
}
        
}

}
     