
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
    """),_display_(Seq[Any](/*5.6*/common/*5.12*/.head("Create Franchise"))),format.raw/*5.37*/("""
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
							Overall Rating
						</th>
					</tr>
				</thead>
				<tbody>
				
					<tr>
						<th> </th>
					</tr>
				</tbody>
			</table> <button type="button" class="btn btn-primary btn-default" onclick="window.location='/'">Add new restaurant</button>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*38.2*/common/*38.8*/.footer())),format.raw/*38.17*/("""

</body>

</html>"""))}
    }
    
    def render(franchise:models.Restaurants.Franchise,restaurants:List[models.Restaurants.Restaurant]): play.api.templates.HtmlFormat.Appendable = apply(franchise,restaurants)
    
    def f:((models.Restaurants.Franchise,List[models.Restaurants.Restaurant]) => play.api.templates.HtmlFormat.Appendable) = (franchise,restaurants) => apply(franchise,restaurants)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 09:55:30 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/franchise/franchiseProfile.scala.html
                    HASH: 263035fe401f5cdd219dbfa8dcb31afe276709da
                    MATRIX: 853->1|1038->92|1108->128|1122->134|1168->159|1219->176|1232->182|1284->213|1452->345|1470->354|1506->368|1956->783|1970->789|2001->798
                    LINES: 26->1|29->1|33->5|33->5|33->5|36->8|36->8|36->8|42->14|42->14|42->14|66->38|66->38|66->38
                    -- GENERATED --
                */
            