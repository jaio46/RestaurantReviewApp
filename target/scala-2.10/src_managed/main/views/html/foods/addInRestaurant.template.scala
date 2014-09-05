
package views.html.foods

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object addInRestaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.data.Form[models.RestaurantFood],List[models.FoodItem],Restaurant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(foodForm: play.data.Form[models.RestaurantFood], lst : List[models.FoodItem], restaurant: Restaurant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.main("Add Food In Restaurant")/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
	
	<h2>Restaurant Name: """),_display_(Seq[Any](/*7.24*/restaurant/*7.34*/.name)),format.raw/*7.39*/("""</h2>
	<h2>Franchise: """),_display_(Seq[Any](/*8.18*/restaurant/*8.28*/.franchise.franchiseTitle)),format.raw/*8.53*/("""</h2>
	
	"""),_display_(Seq[Any](/*10.3*/helper/*10.9*/.form(action = controllers.restaurant.routes.RestaurantFoodController.addFoodInRestaurant(restaurant.id))/*10.114*/ {_display_(Seq[Any](format.raw/*10.116*/("""
		<div class="modal-body">
		
			"""),_display_(Seq[Any](/*13.5*/helper/*13.11*/.select(field = foodForm("foodItem"), lst.map {a => a.id.toString -> a.itemTitle}, '_label -> "Choose Food"))),format.raw/*13.119*/("""
			
			"""),_display_(Seq[Any](/*15.5*/helper/*15.11*/.input(foodForm("price"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*17.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*17.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*18.53*/name)),format.raw/*18.57*/("""" id=""""),_display_(Seq[Any](/*18.64*/id)),format.raw/*18.66*/(""""
					placeholder="Price">
			""")))})),format.raw/*20.5*/("""
			
			"""),_display_(Seq[Any](/*22.5*/helper/*22.11*/.input(foodForm("details"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*24.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*25.53*/name)),format.raw/*25.57*/("""" id=""""),_display_(Seq[Any](/*25.64*/id)),format.raw/*25.66*/(""""
					placeholder="Details">
			""")))})),format.raw/*27.5*/("""
		</div>
		
		<div class="col-md-4" id="add-options">
			<div class="row">
				<a class="btn" href=""""),_display_(Seq[Any](/*32.27*/controllers/*32.38*/.foods.routes.FoodController.addNewFood())),format.raw/*32.79*/("""" >Add New Food
  				</a>
			</div>
		</div>
		<br>
		<div class="Submission">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	""")))})),format.raw/*40.3*/("""
""")))})),format.raw/*41.2*/("""
"""))}
    }
    
    def render(foodForm:play.data.Form[models.RestaurantFood],lst:List[models.FoodItem],restaurant:Restaurant): play.api.templates.HtmlFormat.Appendable = apply(foodForm,lst,restaurant)
    
    def f:((play.data.Form[models.RestaurantFood],List[models.FoodItem],Restaurant) => play.api.templates.HtmlFormat.Appendable) = (foodForm,lst,restaurant) => apply(foodForm,lst,restaurant)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/foods/addInRestaurant.scala.html
                    HASH: a81984417fe735e04da1754af328d272f45e3339
                    MATRIX: 854->1|1067->103|1095->122|1131->124|1144->130|1183->161|1222->163|1283->189|1301->199|1327->204|1385->227|1403->237|1449->262|1494->272|1508->278|1623->383|1664->385|1734->420|1749->426|1880->534|1924->543|1939->549|2031->632|2098->661|2187->714|2213->718|2256->725|2280->727|2343->759|2387->768|2402->774|2496->859|2563->888|2652->941|2678->945|2721->952|2745->954|2810->988|2948->1090|2968->1101|3031->1142|3218->1298|3251->1300
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|38->10|41->13|41->13|41->13|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|50->22|50->22|52->24|52->24|53->25|53->25|53->25|53->25|55->27|60->32|60->32|60->32|68->40|69->41
                    -- GENERATED --
                */
            