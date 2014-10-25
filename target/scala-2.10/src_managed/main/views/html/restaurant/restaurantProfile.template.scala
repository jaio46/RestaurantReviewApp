
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
					"""),_display_(Seq[Any](/*30.7*/restaurant/*30.17*/.restaurantAddress)),format.raw/*30.35*/("""
				</dd>
				<dt>
				Email
				</dt>
				<dd>
					"""),_display_(Seq[Any](/*36.7*/restaurant/*36.17*/.restaurantEmail)),format.raw/*36.33*/("""
				</dd>
				<dt>
				Phone
				</dt>
				<dd>
				"""),_display_(Seq[Any](/*42.6*/restaurant/*42.16*/.restaurantPhone)),format.raw/*42.32*/("""
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
				"""),_display_(Seq[Any](/*61.6*/for(food<-foodList) yield /*61.25*/{_display_(Seq[Any](format.raw/*61.26*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*64.9*/food/*64.13*/.itemName)),format.raw/*64.22*/("""
						</td>
						<td>
						"""),_display_(Seq[Any](/*67.8*/common/*67.14*/.rating("food/"+food.id,food.rating))),format.raw/*67.50*/("""
						</td>
					</tr>
				""")))})),format.raw/*70.6*/("""
				</tbody>
			</table>
			<button type="button" id="addfood" class="btn btn-primary" role="button"
			data-toggle="modal" data-target="#AddNewFood">Add New Food</button>
		</div>
	</div>
	"""),_display_(Seq[Any](/*77.3*/views/*77.8*/.html.restaurant.AddNewFood(foodForm))),format.raw/*77.45*/("""
</div>


"""),_display_(Seq[Any](/*81.2*/common/*81.8*/.footer())),format.raw/*81.17*/("""

</body>

</html>"""))}
    }
    
    def render(restaurant:models.Restaurants.Restaurant,foodList:List[models.Foods.FoodItem],foodForm:play.data.Form[models.Foods.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(restaurant,foodList,foodForm)
    
    def f:((models.Restaurants.Restaurant,List[models.Foods.FoodItem],play.data.Form[models.Foods.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (restaurant,foodList,foodForm) => apply(restaurant,foodList,foodForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 06:56:38 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/restaurant/restaurantProfile.scala.html
                    HASH: c0f47681dd0ecd88d9ce0c29952874f16031895b
                    MATRIX: 886->1|1131->133|1158->153|1228->189|1242->195|1308->240|1360->257|1374->263|1414->281|1567->399|1586->409|1623->424|1661->426|1676->432|1752->486|2037->736|2056->746|2096->764|2186->819|2205->829|2243->845|2332->899|2351->909|2389->925|2690->1191|2725->1210|2764->1211|2829->1241|2842->1245|2873->1254|2939->1285|2954->1291|3012->1327|3072->1356|3299->1548|3312->1553|3371->1590|3417->1601|3431->1607|3462->1616
                    LINES: 26->1|30->1|31->3|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|58->30|58->30|58->30|64->36|64->36|64->36|70->42|70->42|70->42|89->61|89->61|89->61|92->64|92->64|92->64|95->67|95->67|95->67|98->70|105->77|105->77|105->77|109->81|109->81|109->81
                    -- GENERATED --
                */
            