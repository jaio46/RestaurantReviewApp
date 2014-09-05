
package views.html

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
object showVisitorProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Visitor,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(visitor: Visitor):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""



"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.head("Profile"))),format.raw/*5.24*/("""

"""),_display_(Seq[Any](/*7.2*/main("Profile")/*7.17*/ {_display_(Seq[Any](format.raw/*7.19*/("""

<div class="col-md-12 col-md-offset-1">
<div class="heading-banner">
	<h3>Welcome! """),_display_(Seq[Any](/*11.16*/visitor/*11.23*/.firstName)),format.raw/*11.33*/(""" """),_display_(Seq[Any](/*11.35*/visitor/*11.42*/.lastName)),format.raw/*11.51*/("""</h3>
</div>
<hr/>
<hr/>
<div class="col-md-3">
	<div><strong>Gender :</strong></div>
	<div><strong>Occupation :</strong></div>
	<div><strong>Address:</strong></div>
	<p></p>
</div>

<div class="col-md-3">
	<div><strong>"""),_display_(Seq[Any](/*23.16*/visitor/*23.23*/.gender)),format.raw/*23.30*/("""</strong></div>
	<div><strong>"""),_display_(Seq[Any](/*24.16*/visitor/*24.23*/.occupation)),format.raw/*24.34*/("""</strong></div>
	<div><strong>"""),_display_(Seq[Any](/*25.16*/visitor/*25.23*/.address)),format.raw/*25.31*/("""</strong></div>
	<p></p>
</div>

<div class="col-md-3" id="add-options">
			<div class="row">
				<a class="btn" href=""""),_display_(Seq[Any](/*31.27*/controllers/*31.38*/.restaurant.routes.RestaurantController.createRestaurant())),format.raw/*31.96*/("""" >Add a restaurant
  				</a>
  				<a class="btn" href=""""),_display_(Seq[Any](/*33.29*/controllers/*33.40*/.franchise.routes.FranchiseController.createFranchise())),format.raw/*33.95*/("""" >Add a Franchise
  				</a>
  				<a class="btn" href=""""),_display_(Seq[Any](/*35.29*/controllers/*35.40*/.restaurant.routes.RestaurantController.showAllRestaurant())),format.raw/*35.99*/("""" >All Restaurants
  				</a>
			</div>
		</div>

""")))})),format.raw/*40.2*/("""

<div class="col-md-12">
<hr/>
<br/>
<br/>
<br/>
</div> 


"""),_display_(Seq[Any](/*50.2*/common/*50.8*/.footer())),format.raw/*50.17*/("""


"""),_display_(Seq[Any](/*53.2*/views/*53.7*/.html.signInModal())),format.raw/*53.26*/("""




"""))}
    }
    
    def render(visitor:Visitor): play.api.templates.HtmlFormat.Appendable = apply(visitor)
    
    def f:((Visitor) => play.api.templates.HtmlFormat.Appendable) = (visitor) => apply(visitor)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/showVisitorProfile.scala.html
                    HASH: 06595f550669a0388a8c249a7f451fd457d1aea1
                    MATRIX: 788->1|900->19|939->24|952->30|989->46|1026->49|1049->64|1088->66|1210->152|1226->159|1258->169|1296->171|1312->178|1343->187|1600->408|1616->415|1645->422|1712->453|1728->460|1761->471|1828->502|1844->509|1874->517|2030->637|2050->648|2130->706|2225->765|2245->776|2322->831|2416->889|2436->900|2517->959|2599->1010|2695->1071|2709->1077|2740->1086|2779->1090|2792->1095|2833->1114
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|39->11|39->11|39->11|39->11|39->11|39->11|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|59->31|59->31|59->31|61->33|61->33|61->33|63->35|63->35|63->35|68->40|78->50|78->50|78->50|81->53|81->53|81->53
                    -- GENERATED --
                */
            