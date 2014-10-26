// @SOURCE:/Users/sheikhahmed/Projects/RestaurantApp/conf/routes
// @HASH:c08607e69d28c95f7dcfb41a733aa85f2c347926
// @DATE:Sat Oct 25 14:12:56 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise {

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "fr/list")
}
                                                

// @LINE:22
def createNewFranchise(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewFranchise")
}
                                                

// @LINE:24
def franchiseProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "franchise/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:23
def saveFranchiseAndShowProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "saveFranchise")
}
                                                
    
}
                          
}
                  

// @LINE:37
// @LINE:36
package controllers.UserFeed {

// @LINE:37
// @LINE:36
class ReverseUserFeedOnRestaurant {
    

// @LINE:37
def feedOnFood(id:Integer, rating:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "submitRating/food/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("rating", rating))
}
                                                

// @LINE:36
def feedOnRestaurant(id:Integer, rating:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "submitRating/restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("rating", rating))
}
                                                
    
}
                          
}
                  

// @LINE:9
// @LINE:8
package controllers {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun {

// @LINE:13
class ReverseUser {
    

// @LINE:13
def index(user:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "User/" + implicitly[PathBindable[String]].unbind("user", dynamicString(user)))
}
                                                
    
}
                          

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index(restaurant:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Restaurant/" + implicitly[PathBindable[String]].unbind("restaurant", dynamicString(restaurant)))
}
                                                
    
}
                          

// @LINE:5
class Reversehome {
    

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:15
class Reversetest {
    

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          
}
                  

// @LINE:39
package controllers.Food {

// @LINE:39
class ReverseFoodManager {
    

// @LINE:39
def profile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "food/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
package controllers.Restaurant {

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseRestaurantManager {
    

// @LINE:34
def addFood(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "saveFood")
}
                                                

// @LINE:32
def saveRestaurant(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "saveRestaurant")
}
                                                

// @LINE:31
def createNewRestaurant(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewRestaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:33
def restaurantProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:29
// @LINE:28
// @LINE:27
package controllers.Search {

// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "srs/preload")
}
                                                

// @LINE:29
def searchPage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "answer")
}
                                                

// @LINE:28
def answer(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
}
                                                
    
}
                          
}
                  

// @LINE:41
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl {

// @LINE:41
class ReverseLogoutAndSessionClear {
    

// @LINE:41
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userRegistration")
}
                                                

// @LINE:18
def newUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "new")
}
                                                

// @LINE:16
def verifier(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "test/JSON/")
}
                                                
    
}
                          

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise.javascript {

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.showAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fr/list"})
      }
   """
)
                        

// @LINE:22
def createNewFranchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.createNewFranchise",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewFranchise"})
      }
   """
)
                        

// @LINE:24
def franchiseProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.franchiseProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "franchise/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def saveFranchiseAndShowProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveFranchise"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:37
// @LINE:36
package controllers.UserFeed.javascript {

// @LINE:37
// @LINE:36
class ReverseUserFeedOnRestaurant {
    

// @LINE:37
def feedOnFood : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserFeed.UserFeedOnRestaurant.feedOnFood",
   """
      function(id,rating) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitRating/food/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("rating", rating)})
      }
   """
)
                        

// @LINE:36
def feedOnRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserFeed.UserFeedOnRestaurant.feedOnRestaurant",
   """
      function(id,rating) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitRating/restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("rating", rating)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:9
// @LINE:8
package controllers.javascript {

// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun.javascript {

// @LINE:13
class ReverseUser {
    

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.User.index",
   """
      function(user) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "User/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("user", encodeURIComponent(user))})
      }
   """
)
                        
    
}
              

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.Restaurant.index",
   """
      function(restaurant) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Restaurant/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("restaurant", encodeURIComponent(restaurant))})
      }
   """
)
                        
    
}
              

// @LINE:5
class Reversehome {
    

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.home.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:15
class Reversetest {
    

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.isdrun.test.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:39
package controllers.Food.javascript {

// @LINE:39
class ReverseFoodManager {
    

// @LINE:39
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Food.FoodManager.profile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "food/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
package controllers.Restaurant.javascript {

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseRestaurantManager {
    

// @LINE:34
def addFood : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.addFood",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveFood"})
      }
   """
)
                        

// @LINE:32
def saveRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.saveRestaurant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveRestaurant"})
      }
   """
)
                        

// @LINE:31
def createNewRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.createNewRestaurant",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewRestaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def restaurantProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restaurant.RestaurantManager.restaurantProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:29
// @LINE:28
// @LINE:27
package controllers.Search.javascript {

// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.AnswerQueryWithJson.preload",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "srs/preload"})
      }
   """
)
                        

// @LINE:29
def searchPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.AnswerQueryWithJson.searchPage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "answer"})
      }
   """
)
                        

// @LINE:28
def answer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.AnswerQueryWithJson.answer",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:41
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.javascript {

// @LINE:41
class ReverseLogoutAndSessionClear {
    

// @LINE:41
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.LogoutAndSessionClear.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userRegistration"})
      }
   """
)
                        

// @LINE:18
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.newUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "new"})
      }
   """
)
                        

// @LINE:16
def verifier : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.RegistrationAndLogin.verifier",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test/JSON/"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserControl.Profile.profileProvider",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
package controllers.Franchise.ref {


// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseFranchiseManager {
    

// @LINE:25
def showAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.showAll(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "showAll", Seq(), "GET", """""", _prefix + """fr/list""")
)
                      

// @LINE:22
def createNewFranchise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.createNewFranchise(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "createNewFranchise", Seq(), "GET", """""", _prefix + """createNewFranchise""")
)
                      

// @LINE:24
def franchiseProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.franchiseProfile(id), HandlerDef(this, "controllers.Franchise.FranchiseManager", "franchiseProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """franchise/$id<[^/]+>""")
)
                      

// @LINE:23
def saveFranchiseAndShowProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Franchise.FranchiseManager.saveFranchiseAndShowProfile(), HandlerDef(this, "controllers.Franchise.FranchiseManager", "saveFranchiseAndShowProfile", Seq(), "POST", """""", _prefix + """saveFranchise""")
)
                      
    
}
                          
}
        

// @LINE:37
// @LINE:36
package controllers.UserFeed.ref {


// @LINE:37
// @LINE:36
class ReverseUserFeedOnRestaurant {
    

// @LINE:37
def feedOnFood(id:Integer, rating:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserFeed.UserFeedOnRestaurant.feedOnFood(id, rating), HandlerDef(this, "controllers.UserFeed.UserFeedOnRestaurant", "feedOnFood", Seq(classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """submitRating/food/$id<[^/]+>/$rating<[^/]+>""")
)
                      

// @LINE:36
def feedOnRestaurant(id:Integer, rating:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserFeed.UserFeedOnRestaurant.feedOnRestaurant(id, rating), HandlerDef(this, "controllers.UserFeed.UserFeedOnRestaurant", "feedOnRestaurant", Seq(classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """submitRating/restaurant/$id<[^/]+>/$rating<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:9
class ReverseWebJarAssets {
    

// @LINE:9
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
class ReverseAssets {
    

// @LINE:8
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:5
package controllers.isdrun.ref {


// @LINE:13
class ReverseUser {
    

// @LINE:13
def index(user:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.User.index(user), HandlerDef(this, "controllers.isdrun.User", "index", Seq(classOf[String]), "GET", """""", _prefix + """User/$user<[^/]+>""")
)
                      
    
}
                          

// @LINE:14
class ReverseRestaurant {
    

// @LINE:14
def index(restaurant:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.Restaurant.index(restaurant), HandlerDef(this, "controllers.isdrun.Restaurant", "index", Seq(classOf[String]), "GET", """""", _prefix + """Restaurant/$restaurant<[^/]+>""")
)
                      
    
}
                          

// @LINE:5
class Reversehome {
    

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.home.index(), HandlerDef(this, "controllers.isdrun.home", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:15
class Reversetest {
    

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.isdrun.test.index(), HandlerDef(this, "controllers.isdrun.test", "index", Seq(), "GET", """""", _prefix + """test""")
)
                      
    
}
                          
}
        

// @LINE:39
package controllers.Food.ref {


// @LINE:39
class ReverseFoodManager {
    

// @LINE:39
def profile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Food.FoodManager.profile(id), HandlerDef(this, "controllers.Food.FoodManager", "profile", Seq(classOf[Integer]), "GET", """""", _prefix + """food/$id<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
package controllers.Restaurant.ref {


// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseRestaurantManager {
    

// @LINE:34
def addFood(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.addFood(), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "addFood", Seq(), "POST", """""", _prefix + """saveFood""")
)
                      

// @LINE:32
def saveRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.saveRestaurant(), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "saveRestaurant", Seq(), "POST", """""", _prefix + """saveRestaurant""")
)
                      

// @LINE:31
def createNewRestaurant(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.createNewRestaurant(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "createNewRestaurant", Seq(classOf[Integer]), "GET", """""", _prefix + """createNewRestaurant/$id<[^/]+>""")
)
                      

// @LINE:33
def restaurantProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restaurant.RestaurantManager.restaurantProfile(id), HandlerDef(this, "controllers.Restaurant.RestaurantManager", "restaurantProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """restaurant/$id<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:29
// @LINE:28
// @LINE:27
package controllers.Search.ref {


// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAnswerQueryWithJson {
    

// @LINE:27
def preload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.AnswerQueryWithJson.preload(), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "preload", Seq(), "GET", """""", _prefix + """srs/preload""")
)
                      

// @LINE:29
def searchPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.AnswerQueryWithJson.searchPage(), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "searchPage", Seq(), "POST", """""", _prefix + """answer""")
)
                      

// @LINE:28
def answer(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.AnswerQueryWithJson.answer(query), HandlerDef(this, "controllers.Search.AnswerQueryWithJson", "answer", Seq(classOf[String]), "GET", """""", _prefix + """search/$query<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:41
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
package controllers.UserControl.ref {


// @LINE:41
class ReverseLogoutAndSessionClear {
    

// @LINE:41
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.LogoutAndSessionClear.logout(), HandlerDef(this, "controllers.UserControl.LogoutAndSessionClear", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:16
class ReverseRegistrationAndLogin {
    

// @LINE:19
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.saveUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "saveUser", Seq(), "POST", """""", _prefix + """userRegistration""")
)
                      

// @LINE:18
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.newUser(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "newUser", Seq(), "GET", """""", _prefix + """new""")
)
                      

// @LINE:16
def verifier(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.RegistrationAndLogin.verifier(), HandlerDef(this, "controllers.UserControl.RegistrationAndLogin", "verifier", Seq(), "POST", """""", _prefix + """test/JSON/""")
)
                      
    
}
                          

// @LINE:20
class ReverseProfile {
    

// @LINE:20
def profileProvider(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserControl.Profile.profileProvider(), HandlerDef(this, "controllers.UserControl.Profile", "profileProvider", Seq(), "GET", """""", _prefix + """profile""")
)
                      
    
}
                          
}
        
    