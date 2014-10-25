
package views.html.search

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
object searchResultPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[models.Restaurants.Restaurant],List[models.Foods.FoodItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(key: String, restaurants : List[models.Restaurants.Restaurant], foods: List[models.Foods.FoodItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.102*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*5.6*/common/*5.12*/.head("Search for" + key))),format.raw/*5.37*/("""
</head>
<body>
"""),_display_(Seq[Any](/*8.2*/common/*8.8*/.navbar("Create New Franchise"))),format.raw/*8.39*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-info">
			Search for - """),_display_(Seq[Any](/*14.18*/key)),format.raw/*14.21*/("""
			</h3>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			"""),_display_(Seq[Any](/*20.5*/if(restaurants.isEmpty==false)/*20.35*/{_display_(Seq[Any](format.raw/*20.36*/("""
				<div class="list-group">
					 <a class="list-group-item active">Resulets from Restaurant</a>
					"""),_display_(Seq[Any](/*23.7*/for(restaurant<-restaurants) yield /*23.35*/{_display_(Seq[Any](format.raw/*23.36*/("""
						<div class="list-group-item">
							<a href='/restaurant/"""),_display_(Seq[Any](/*25.30*/restaurant/*25.40*/.id)),format.raw/*25.43*/("""'>"""),_display_(Seq[Any](/*25.46*/restaurant/*25.56*/.restaurantName)),format.raw/*25.71*/("""</a>
						</div>
					""")))})),format.raw/*27.7*/("""
					
				</div>
			""")))})),format.raw/*30.5*/("""
			"""),_display_(Seq[Any](/*31.5*/if(foods.isEmpty==false)/*31.29*/{_display_(Seq[Any](format.raw/*31.30*/("""
				<div class="list-group">
					 <a class="list-group-item active">Resulets from Foods</a>
					"""),_display_(Seq[Any](/*34.7*/for(food<-foods) yield /*34.23*/{_display_(Seq[Any](format.raw/*34.24*/("""
						<div class="list-group-item">
							<a href='/restaurant/"""),_display_(Seq[Any](/*36.30*/food/*36.34*/.restaurant.id)),format.raw/*36.48*/("""'>"""),_display_(Seq[Any](/*36.51*/food/*36.55*/.itemName)),format.raw/*36.64*/(""" from """),_display_(Seq[Any](/*36.71*/food/*36.75*/.restaurant.getRestaurantName())),format.raw/*36.106*/("""</a>
						</div>
					""")))})),format.raw/*38.7*/("""
					
				</div>
			""")))})),format.raw/*41.5*/("""
			
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*47.2*/common/*47.8*/.footer())),format.raw/*47.17*/("""

</body>

</html>"""))}
    }
    
    def render(key:String,restaurants:List[models.Restaurants.Restaurant],foods:List[models.Foods.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(key,restaurants,foods)
    
    def f:((String,List[models.Restaurants.Restaurant],List[models.Foods.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (key,restaurants,foods) => apply(key,restaurants,foods)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 13:14:23 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/search/searchResultPage.scala.html
                    HASH: 8c1ca40967caec0fdfe158f040a8e4252e6f18b4
                    MATRIX: 856->1|1051->101|1121->137|1135->143|1181->168|1232->185|1245->191|1297->222|1463->352|1488->355|1615->447|1654->477|1693->478|1833->583|1877->611|1916->612|2018->678|2037->688|2062->691|2101->694|2120->704|2157->719|2212->743|2265->765|2305->770|2338->794|2377->795|2512->895|2544->911|2583->912|2685->978|2698->982|2734->996|2773->999|2786->1003|2817->1012|2860->1019|2873->1023|2927->1054|2982->1078|3035->1100|3101->1131|3115->1137|3146->1146
                    LINES: 26->1|29->1|33->5|33->5|33->5|36->8|36->8|36->8|42->14|42->14|48->20|48->20|48->20|51->23|51->23|51->23|53->25|53->25|53->25|53->25|53->25|53->25|55->27|58->30|59->31|59->31|59->31|62->34|62->34|62->34|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|66->38|69->41|75->47|75->47|75->47
                    -- GENERATED --
                */
            