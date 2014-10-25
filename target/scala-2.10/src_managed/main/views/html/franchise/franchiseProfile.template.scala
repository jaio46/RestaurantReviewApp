
package views.html.franchise

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
object franchiseProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.Restaurants.Franchise,List[models.Restaurants.Restaurant],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(franchise: models.Restaurants.Franchise, restaurants: List[models.Restaurants.Restaurant]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.93*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*5.6*/common/*5.12*/.head(franchise.franchiseName))),format.raw/*5.42*/("""
</head>
<body>
"""),_display_(Seq[Any](/*8.2*/common/*8.8*/.navbar("Create New Franchise"))),format.raw/*8.39*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-primary">
				Welcome to """),_display_(Seq[Any](/*14.17*/franchise/*14.26*/.franchiseName)),format.raw/*14.40*/("""
			</h3>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							Restaurant
						</th>
						<th>
							Average Rating
						</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(Seq[Any](/*28.7*/for( restaurant<-restaurants ) yield /*28.37*/{_display_(Seq[Any](format.raw/*28.38*/("""
						<tr>
							<th> <h5><a class="btn" href="/restaurant/"""),_display_(Seq[Any](/*30.51*/restaurant/*30.61*/.id)),format.raw/*30.64*/("""">"""),_display_(Seq[Any](/*30.67*/restaurant/*30.77*/.restaurantName)),format.raw/*30.92*/("""</h5></th>
							<th> """),_display_(Seq[Any](/*31.14*/common/*31.20*/.rating("restaurant/"+restaurant.id,restaurant.rating))),format.raw/*31.74*/(""" </th>
						</tr>
					""")))})),format.raw/*33.7*/("""
				</tbody>
			</table> <button type="button" class="btn btn-primary btn-default" onclick="window.location='/createNewRestaurant/"""),_display_(Seq[Any](/*35.119*/franchise/*35.128*/.id)),format.raw/*35.131*/("""'">Add new restaurant</button>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*40.2*/common/*40.8*/.footer())),format.raw/*40.17*/("""

</body>

</html>"""))}
    }
    
    def render(franchise:models.Restaurants.Franchise,restaurants:List[models.Restaurants.Restaurant]): play.api.templates.HtmlFormat.Appendable = apply(franchise,restaurants)
    
    def f:((models.Restaurants.Franchise,List[models.Restaurants.Restaurant]) => play.api.templates.HtmlFormat.Appendable) = (franchise,restaurants) => apply(franchise,restaurants)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 06:45:36 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/franchise/franchiseProfile.scala.html
                    HASH: a54593564e69403807c71828e99f72cb7e3177e6
                    MATRIX: 853->1|1038->92|1108->128|1122->134|1173->164|1224->181|1237->187|1289->218|1457->350|1475->359|1511->373|1757->584|1803->614|1842->615|1940->677|1959->687|1984->690|2023->693|2042->703|2079->718|2139->742|2154->748|2230->802|2286->827|2455->959|2474->968|2500->971|2592->1028|2606->1034|2637->1043
                    LINES: 26->1|29->1|33->5|33->5|33->5|36->8|36->8|36->8|42->14|42->14|42->14|56->28|56->28|56->28|58->30|58->30|58->30|58->30|58->30|58->30|59->31|59->31|59->31|61->33|63->35|63->35|63->35|68->40|68->40|68->40
                    -- GENERATED --
                */
            