
package views.html.food

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
object foodProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.Foods.FoodItem,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(food : models.Foods.FoodItem):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*5.6*/common/*5.12*/.head(food.itemName))),format.raw/*5.32*/("""
</head>

<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("Create New Franchise"))),format.raw/*9.39*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-info">
				"""),_display_(Seq[Any](/*15.6*/food/*15.10*/.itemName)),format.raw/*15.19*/(""" by <a href="/restaurant/"""),_display_(Seq[Any](/*15.45*/food/*15.49*/.restaurant.id)),format.raw/*15.63*/("""">"""),_display_(Seq[Any](/*15.66*/food/*15.70*/.restaurant.getRestaurantName())),format.raw/*15.101*/("""</a>
			</h3>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						"""),_display_(Seq[Any](/*20.8*/food/*20.12*/.itemName)),format.raw/*20.21*/(""" details
					</h3>
				</div>
				<div class="panel-body">
					Category - """),_display_(Seq[Any](/*24.18*/food/*24.22*/.itemCategory)),format.raw/*24.35*/("""
				</div>
				<div class="panel-body">
					Reviewd by """),_display_(Seq[Any](/*27.18*/food/*27.22*/.ratedBy)),format.raw/*27.30*/("""
				</div>
				<div class="panel-body">
					Rating """),_display_(Seq[Any](/*30.14*/common/*30.20*/.rating("food/"+food.id,food.rating))),format.raw/*30.56*/("""
				</div>
			</div>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*37.2*/common/*37.8*/.footer())),format.raw/*37.17*/("""

</body>

</html>"""))}
    }
    
    def render(food:models.Foods.FoodItem): play.api.templates.HtmlFormat.Appendable = apply(food)
    
    def f:((models.Foods.FoodItem) => play.api.templates.HtmlFormat.Appendable) = (food) => apply(food)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 14:18:38 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/food/foodProfile.scala.html
                    HASH: 2d50e229e30cd31b8429b8d3dc7ec5745eb95364
                    MATRIX: 800->1|924->31|994->67|1008->73|1049->93|1101->111|1114->117|1166->148|1319->266|1332->270|1363->279|1425->305|1438->309|1474->323|1513->326|1526->330|1580->361|1735->481|1748->485|1779->494|1892->571|1905->575|1940->588|2034->646|2047->650|2077->658|2167->712|2182->718|2240->754|2323->802|2337->808|2368->817
                    LINES: 26->1|29->1|33->5|33->5|33->5|37->9|37->9|37->9|43->15|43->15|43->15|43->15|43->15|43->15|43->15|43->15|43->15|48->20|48->20|48->20|52->24|52->24|52->24|55->27|55->27|55->27|58->30|58->30|58->30|65->37|65->37|65->37
                    -- GENERATED --
                */
            