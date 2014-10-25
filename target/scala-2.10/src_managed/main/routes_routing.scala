// @SOURCE:/Users/sheikhahmed/Projects/RestaurantApp/conf/routes
// @HASH:12855ac7121808e709fef704c8e84395d578dbda
// @DATE:Sat Oct 25 10:05:30 BDT 2014


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
private[this] lazy val controllers_UserControl_RegistrationAndLogin_verifier6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/JSON/"))))
        

// @LINE:18
private[this] lazy val controllers_UserControl_RegistrationAndLogin_newUser7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new"))))
        

// @LINE:19
private[this] lazy val controllers_UserControl_RegistrationAndLogin_saveUser8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userRegistration"))))
        

// @LINE:20
private[this] lazy val controllers_UserControl_Profile_profileProvider9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Profile/"),DynamicPart("userId", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Franchise_FranchiseManager_createNewFranchise10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewFranchise"))))
        

// @LINE:23
private[this] lazy val controllers_Franchise_FranchiseManager_saveFranchiseAndShowProfile11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveFranchise"))))
        

// @LINE:24
private[this] lazy val controllers_Franchise_FranchiseManager_franchiseProfile12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("franchise/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Franchise_FranchiseManager_showAll13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fr/list"))))
        

// @LINE:27
private[this] lazy val controllers_Search_AnswerQueryWithJson_preload14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("srs/preload"))))
        

// @LINE:28
private[this] lazy val controllers_Search_AnswerQueryWithJson_answer15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search/"),DynamicPart("query", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Search_AnswerQueryWithJson_searchPage16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("answer"))))
        

// @LINE:31
private[this] lazy val controllers_Restaurant_RestaurantManager_createNewRestaurant17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewRestaurant/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Restaurant_RestaurantManager_saveRestaurant18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveRestaurant"))))
        

// @LINE:33
private[this] lazy val controllers_Restaurant_RestaurantManager_restaurantProfile19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restaurant/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:34
private[this] lazy val controllers_Restaurant_RestaurantManager_addFood20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveFood"))))
        

// @LINE:36
private[this] lazy val controllers_UserFeed_UserFeedOnRestaurant_feedOnRestaurant21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submitRating/restaurant/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("rating", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_UserFeed_UserFeedOnRestaurant_feedOnFood22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submitRating/food/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("rating", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_UserControl_LogoutAndSessionClear_logout23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        
def documentation = List(("""GET""", prefix,"""controllers.isdrun.home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """User/$user<[^/]+>""","""controllers.isdrun.User.index(user:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Restaurant/$restaurant<[^/]+>""","""controllers.isdrun.Restaurant.index(restaurant:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.isdrun.test.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/JSON/""","""controllers.UserControl.RegistrationAndLogin.verifier()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new""","""controllers.UserControl.RegistrationAndLogin.newUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userRegistration""","""controllers.UserControl.RegistrationAndLogin.saveUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Profile/$userId<[^/]+>""","""controllers.UserControl.Profile.profileProvider(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewFranchise""","""controllers.Franchise.FranchiseManager.createNewFranchise()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveFranchise""","""controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """franchise/$id<[^/]+>""","""controllers.Franchise.FranchiseManager.franchiseProfile(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fr/list""","""controllers.Franchise.FranchiseManager.showAll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """srs/preload""","""controllers.Search.AnswerQueryWithJson.preload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/$query<[^/]+>""","""controllers.Search.AnswerQueryWithJson.answer(query:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """answer""","""controllers.Search.AnswerQueryWithJson.searchPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewRestaurant/$id<[^/]+>""","""controllers.Restaurant.RestaurantManager.createNewRestaurant(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveRestaurant""","""controllers.Restaurant.RestaurantManager.saveRestaurant()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restaurant/$id<[^/]+>""","""controllers.Restaurant.RestaurantManager.restaurantProfile(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveFood""","""controllers.Restaurant.RestaurantManager.addFood()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submitRating/restaurant/$id<[^/]+>/$rating<[^/]+>""","""controllers.UserFeed.UserFeedOnRestaurant.feedOnRestaurant(id:Integer, rating:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submitRating/food/$id<[^/]+>/$rating<[^/]+>""","""controllers.UserFeed.UserFeedOnRestaurant.feedOnFood(id:Integer, rating:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.UserControl.LogoutAndSessionClear.logout()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_UserControl_RegistrationAndLogin_verifier6(params) => {
   call { 
        invokeHandler(controllers.UserControl.RegistrationAndLogin.verifier(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "verifier", Nil,"POST", """""", Routes.prefix + """test/JSON/"""))
   }
}
        

// @LINE:18
case controllers_UserControl_RegistrationAndLogin_newUser7(params) => {
   call { 
        invokeHandler(controllers.UserControl.RegistrationAndLogin.newUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "newUser", Nil,"GET", """""", Routes.prefix + """new"""))
   }
}
        

// @LINE:19
case controllers_UserControl_RegistrationAndLogin_saveUser8(params) => {
   call { 
        invokeHandler(controllers.UserControl.RegistrationAndLogin.saveUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "saveUser", Nil,"POST", """""", Routes.prefix + """userRegistration"""))
   }
}
        

// @LINE:20
case controllers_UserControl_Profile_profileProvider9(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        invokeHandler(controllers.UserControl.Profile.profileProvider(userId), HandlerDef(this, "controllers.UserControl.Profile", "profileProvider", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Profile/$userId<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Franchise_FranchiseManager_createNewFranchise10(params) => {
   call { 
        invokeHandler(controllers.Franchise.FranchiseManager.createNewFranchise(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "createNewFranchise", Nil,"GET", """""", Routes.prefix + """createNewFranchise"""))
   }
}
        

// @LINE:23
case controllers_Franchise_FranchiseManager_saveFranchiseAndShowProfile11(params) => {
   call { 
        invokeHandler(controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "saveFranchiseAndShowProfile", Nil,"POST", """""", Routes.prefix + """saveFranchise"""))
   }
}
        

// @LINE:24
case controllers_Franchise_FranchiseManager_franchiseProfile12(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Franchise.FranchiseManager.franchiseProfile(id), HandlerDef(this, "controllers.Franchise.FranchiseManager", "franchiseProfile", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """franchise/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Franchise_FranchiseManager_showAll13(params) => {
   call { 
        invokeHandler(controllers.Franchise.FranchiseManager.showAll(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "showAll", Nil,"GET", """""", Routes.prefix + """fr/list"""))
   }
}
        

// @LINE:27
case controllers_Search_AnswerQueryWithJson_preload14(params) => {
   call { 
        invokeHandler(controllers.Search.AnswerQueryWithJson.preload(), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "preload", Nil,"GET", """""", Routes.prefix + """srs/preload"""))
   }
}
        

// @LINE:28
case controllers_Search_AnswerQueryWithJson_answer15(params) => {
   call(params.fromPath[String]("query", None)) { (query) =>
        invokeHandler(controllers.Search.AnswerQueryWithJson.answer(query), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "answer", Seq(classOf[String]),"GET", """""", Routes.prefix + """search/$query<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Search_AnswerQueryWithJson_searchPage16(params) => {
   call { 
        invokeHandler(controllers.Search.AnswerQueryWithJson.searchPage(), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "searchPage", Nil,"POST", """""", Routes.prefix + """answer"""))
   }
}
        

// @LINE:31
case controllers_Restaurant_RestaurantManager_createNewRestaurant17(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Restaurant.RestaurantManager.createNewRestaurant(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "createNewRestaurant", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """createNewRestaurant/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Restaurant_RestaurantManager_saveRestaurant18(params) => {
   call { 
        invokeHandler(controllers.Restaurant.RestaurantManager.saveRestaurant(), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "saveRestaurant", Nil,"POST", """""", Routes.prefix + """saveRestaurant"""))
   }
}
        

// @LINE:33
case controllers_Restaurant_RestaurantManager_restaurantProfile19(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Restaurant.RestaurantManager.restaurantProfile(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "restaurantProfile", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """restaurant/$id<[^/]+>"""))
   }
}
        

// @LINE:34
case controllers_Restaurant_RestaurantManager_addFood20(params) => {
   call { 
        invokeHandler(controllers.Restaurant.RestaurantManager.addFood(), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "addFood", Nil,"POST", """""", Routes.prefix + """saveFood"""))
   }
}
        

// @LINE:36
case controllers_UserFeed_UserFeedOnRestaurant_feedOnRestaurant21(params) => {
   call(params.fromPath[Integer]("id", None), params.fromPath[Integer]("rating", None)) { (id, rating) =>
        invokeHandler(controllers.UserFeed.UserFeedOnRestaurant.feedOnRestaurant(id, rating), HandlerDef(this, "controllers.UserFeed.UserFeedOnRestaurant", "feedOnRestaurant", Seq(classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """submitRating/restaurant/$id<[^/]+>/$rating<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_UserFeed_UserFeedOnRestaurant_feedOnFood22(params) => {
   call(params.fromPath[Integer]("id", None), params.fromPath[Integer]("rating", None)) { (id, rating) =>
        invokeHandler(controllers.UserFeed.UserFeedOnRestaurant.feedOnFood(id, rating), HandlerDef(this, "controllers.UserFeed.UserFeedOnRestaurant", "feedOnFood", Seq(classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """submitRating/food/$id<[^/]+>/$rating<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_UserControl_LogoutAndSessionClear_logout23(params) => {
   call { 
        invokeHandler(controllers.UserControl.LogoutAndSessionClear.logout(), HandlerDef(this, "controllers.UserControl.LogoutAndSessionClear", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        
}

}
     