
package views.html.restaurant

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
object restaurantProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.Restaurants.Restaurant,List[models.Foods.FoodItem],play.data.Form[models.Foods.FoodItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurant: models.Restaurants.Restaurant, foodList: List[models.Foods.FoodItem], foodForm : play.data.Form[models.Foods.FoodItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import math.round


Seq[Any](format.raw/*1.134*/("""
"""),format.raw/*3.1*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*7.6*/common/*7.12*/.head(restaurant.restaurantName+" - profile"))),format.raw/*7.57*/("""
</head>
<body>
"""),_display_(Seq[Any](/*10.2*/common/*10.8*/.navbar("Profile"))),format.raw/*10.26*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-info">
				"""),_display_(Seq[Any](/*16.6*/restaurant/*16.16*/.restaurantName)),format.raw/*16.31*/(""" """),_display_(Seq[Any](/*16.33*/common/*16.39*/.rating("restaurant/"+restaurant.id,restaurant.rating))),format.raw/*16.93*/("""
			</h3>
			<h5 class="text-info">
				by <a href="/franchise/"""),_display_(Seq[Any](/*19.29*/restaurant/*19.39*/.franchise.id)),format.raw/*19.52*/("""">"""),_display_(Seq[Any](/*19.55*/restaurant/*19.65*/.franchise.getFranchiseName())),format.raw/*19.94*/("""</a>
			</h5>
			
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-6 column">
			<img alt="360x360" src="http://lorempixel.com/300/300/food/" />
		</div>
		<div class="col-md-6 column">
			<dl>
				<dt>
					Address
				</dt>
				<dd>
					"""),_display_(Seq[Any](/*34.7*/restaurant/*34.17*/.restaurantAddress)),format.raw/*34.35*/("""
				</dd>
				<dt>
				Email
				</dt>
				<dd>
					"""),_display_(Seq[Any](/*40.7*/restaurant/*40.17*/.restaurantEmail)),format.raw/*40.33*/("""
				</dd>
				<dt>
				Phone
				</dt>
				<dd>
				"""),_display_(Seq[Any](/*46.6*/restaurant/*46.16*/.restaurantPhone)),format.raw/*46.32*/("""
				</dd>
			</dl>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table">
				<thead>
					<tr>
						<th>
						Food Item Name
						</th>
						<th>
						Rating
						</th>
					</tr>
				</thead>
				<tbody>
				"""),_display_(Seq[Any](/*65.6*/for(food<-foodList) yield /*65.25*/{_display_(Seq[Any](format.raw/*65.26*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*68.9*/food/*68.13*/.itemName)),format.raw/*68.22*/("""
						</td>
						<td>
						"""),_display_(Seq[Any](/*71.8*/common/*71.14*/.rating("food/"+food.id,food.rating))),format.raw/*71.50*/("""
						</td>
					</tr>
				""")))})),format.raw/*74.6*/("""
				</tbody>
			</table>
			<button type="button" id="addfood" class="btn btn-primary" role="button"
			data-toggle="modal" data-target="#AddNewFood">Add New Food</button>
		</div>
	</div>
	"""),_display_(Seq[Any](/*81.3*/views/*81.8*/.html.restaurant.AddNewFood(foodForm))),format.raw/*81.45*/("""
</div>


"""),_display_(Seq[Any](/*85.2*/common/*85.8*/.footer())),format.raw/*85.17*/("""

</body>

</html>"""))}
    }
    
    def render(restaurant:models.Restaurants.Restaurant,foodList:List[models.Foods.FoodItem],foodForm:play.data.Form[models.Foods.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(restaurant,foodList,foodForm)
    
    def f:((models.Restaurants.Restaurant,List[models.Foods.FoodItem],play.data.Form[models.Foods.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (restaurant,foodList,foodForm) => apply(restaurant,foodList,foodForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 13:22:17 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/restaurant/restaurantProfile.scala.html
                    HASH: 07a5b5b656c352a6d89fee7c7a6b9f63b182fbf8
                    MATRIX: 886->1|1131->133|1158->153|1228->189|1242->195|1308->240|1360->257|1374->263|1414->281|1567->399|1586->409|1623->424|1661->426|1676->432|1752->486|1852->550|1871->560|1906->573|1945->576|1964->586|2015->615|2308->873|2327->883|2367->901|2457->956|2476->966|2514->982|2603->1036|2622->1046|2660->1062|2961->1328|2996->1347|3035->1348|3100->1378|3113->1382|3144->1391|3210->1422|3225->1428|3283->1464|3343->1493|3570->1685|3583->1690|3642->1727|3688->1738|3702->1744|3733->1753
                    LINES: 26->1|30->1|31->3|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|47->19|47->19|47->19|62->34|62->34|62->34|68->40|68->40|68->40|74->46|74->46|74->46|93->65|93->65|93->65|96->68|96->68|96->68|99->71|99->71|99->71|102->74|109->81|109->81|109->81|113->85|113->85|113->85
                    -- GENERATED --
                */
            