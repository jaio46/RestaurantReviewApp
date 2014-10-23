
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
object franchiseList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.Restaurants.Franchise],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(franchises: List[models.Restaurants.Franchise]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.50*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*5.6*/common/*5.12*/.head("Create Franchise"))),format.raw/*5.37*/("""
</head>
<body>
"""),_display_(Seq[Any](/*8.2*/common/*8.8*/.navbar("All franchise"))),format.raw/*8.32*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-primary">
				All franchise has been listed here
			</h3>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							Franchise
						</th>
						<th>
							Email Address
						</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(Seq[Any](/*28.7*/for( franchise<-franchises ) yield /*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""
						<tr>
							<th> <h5><a class="btn" href="#">"""),_display_(Seq[Any](/*30.42*/franchise/*30.51*/.franchiseName)),format.raw/*30.65*/("""</h5></th>
							<th> <h5>"""),_display_(Seq[Any](/*31.18*/franchise/*31.27*/.franchiseEmail)),format.raw/*31.42*/("""</h5></th>
						</tr>
					""")))})),format.raw/*33.7*/("""
				</tbody>
			</table>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*40.2*/common/*40.8*/.footer())),format.raw/*40.17*/("""

</body>

</html>"""))}
    }
    
    def render(franchises:List[models.Restaurants.Franchise]): play.api.templates.HtmlFormat.Appendable = apply(franchises)
    
    def f:((List[models.Restaurants.Franchise]) => play.api.templates.HtmlFormat.Appendable) = (franchises) => apply(franchises)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 11:01:49 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/franchise/franchiseList.scala.html
                    HASH: a0c9e78ea3c33cbe22e1929129cd6df51516a587
                    MATRIX: 820->1|962->49|1032->85|1046->91|1092->116|1143->133|1156->139|1201->163|1599->526|1643->554|1682->555|1771->608|1789->617|1825->631|1889->659|1907->668|1944->683|2004->712|2091->764|2105->770|2136->779
                    LINES: 26->1|29->1|33->5|33->5|33->5|36->8|36->8|36->8|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|61->33|68->40|68->40|68->40
                    -- GENERATED --
                */
            