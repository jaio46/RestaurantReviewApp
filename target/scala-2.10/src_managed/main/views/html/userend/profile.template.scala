
package views.html.userend

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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.User.User,List[models.Restaurants.Restaurant],List[models.Foods.FoodItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user : models.User.User, restaurants : List[models.Restaurants.Restaurant], foods: List[models.Foods.FoodItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.114*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head("Profile"))),format.raw/*6.28*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("Profile"))),format.raw/*9.26*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<h3 class="text-info">
						Top Restaurants
					</h3>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>
									Restaurants
								</th>
								<th>
									Rating
								</th>
							</tr>
						</thead>
						<tbody>
							"""),_display_(Seq[Any](/*31.9*/for(restaurant<-restaurants) yield /*31.37*/{_display_(Seq[Any](format.raw/*31.38*/("""
								<tr>
									<td>
									<a href='/restaurant/"""),_display_(Seq[Any](/*34.32*/restaurant/*34.42*/.id)),format.raw/*34.45*/("""'>"""),_display_(Seq[Any](/*34.48*/restaurant/*34.58*/.restaurantName)),format.raw/*34.73*/("""</a>
									</td>
									<td>
									"""),_display_(Seq[Any](/*37.11*/common/*37.17*/.rating("restaurant/"+restaurant.id,restaurant.rating))),format.raw/*37.71*/("""
									</td>
								</tr>
							""")))})),format.raw/*40.9*/("""
						</tbody>
					</table>
				</div>
				<div class="col-md-6 column">
					<h3 class="text-info">
						Top Food Items
					</h3>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>
									Food Item
								</th>
								<th>
									Rating
								</th>
							</tr>
						</thead>
						<tbody>
								"""),_display_(Seq[Any](/*60.10*/for(food<-foods) yield /*60.26*/{_display_(Seq[Any](format.raw/*60.27*/("""
								<tr>
								
									<td>
										<a href='/restaurant/"""),_display_(Seq[Any](/*64.33*/food/*64.37*/.restaurant.id)),format.raw/*64.51*/("""'> """),_display_(Seq[Any](/*64.55*/food/*64.59*/.itemName)),format.raw/*64.68*/(""" from """),_display_(Seq[Any](/*64.75*/food/*64.79*/.restaurant.getRestaurantName())),format.raw/*64.110*/("""</a>
									</td>
									<td>
										"""),_display_(Seq[Any](/*67.12*/common/*67.18*/.rating("food/"+food.id,food.rating))),format.raw/*67.54*/("""
									</td>
									</tr>	
								""")))})),format.raw/*70.10*/("""
								
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*81.2*/common/*81.8*/.footer())),format.raw/*81.17*/("""

</body>

</html>"""))}
    }
    
    def render(user:models.User.User,restaurants:List[models.Restaurants.Restaurant],foods:List[models.Foods.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(user,restaurants,foods)
    
    def f:((models.User.User,List[models.Restaurants.Restaurant],List[models.Foods.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (user,restaurants,foods) => apply(user,restaurants,foods)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 12:03:50 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/userend/profile.scala.html
                    HASH: 6976f9943c75f0cd9afcaa3fc6f389956aa6a369
                    MATRIX: 858->1|1065->113|1136->150|1150->156|1187->172|1238->189|1251->195|1290->213|1745->633|1789->661|1828->662|1923->721|1942->731|1967->734|2006->737|2025->747|2062->762|2142->806|2157->812|2233->866|2302->904|2680->1246|2712->1262|2751->1263|2856->1332|2869->1336|2905->1350|2945->1354|2958->1358|2989->1367|3032->1374|3045->1378|3099->1409|3180->1454|3195->1460|3253->1496|3326->1537|3455->1631|3469->1637|3500->1646
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|59->31|59->31|59->31|62->34|62->34|62->34|62->34|62->34|62->34|65->37|65->37|65->37|68->40|88->60|88->60|88->60|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|98->70|109->81|109->81|109->81
                    -- GENERATED --
                */
            