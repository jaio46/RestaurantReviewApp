
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
object newFranchise extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Restaurants.Franchise],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(franchiseForm : play.data.Form[models.Restaurants.Franchise]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.64*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head("Create Franchise"))),format.raw/*6.37*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("Create New Franchise"))),format.raw/*9.39*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-info">
				Create New Franchise
			</h3>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-8 column">
			"""),_display_(Seq[Any](/*21.5*/helper/*21.11*/.form(action = controllers.Franchise.routes.FranchiseManager.saveFranchiseAndShowProfile())/*21.102*/{_display_(Seq[Any](format.raw/*21.103*/("""
				"""),_display_(Seq[Any](/*22.6*/helper/*22.12*/.input(franchiseForm("Name"),
						 '_showConstraints -> false)/*23.35*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.64*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*24.55*/name)),format.raw/*24.59*/("""" id=""""),_display_(Seq[Any](/*24.66*/id)),format.raw/*24.68*/(""""
							placeholder='Name for your franchise'>
					""")))})),format.raw/*26.7*/("""
				
				"""),_display_(Seq[Any](/*28.6*/helper/*28.12*/.input(franchiseForm("Email"),
							'_showConstraints -> false)/*29.35*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*29.61*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*30.55*/name)),format.raw/*30.59*/("""" id=""""),_display_(Seq[Any](/*30.66*/id)),format.raw/*30.68*/(""""
							placeholder='Email Address'>
					""")))})),format.raw/*32.7*/("""
				"""),_display_(Seq[Any](/*33.6*/helper/*33.12*/.input(franchiseForm("Address"),
							'_showConstraints -> false)/*34.35*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*34.61*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*35.55*/name)),format.raw/*35.59*/("""" id=""""),_display_(Seq[Any](/*35.66*/id)),format.raw/*35.68*/(""""
							placeholder= 'Address'>
					""")))})),format.raw/*37.7*/("""
				"""),_display_(Seq[Any](/*38.6*/helper/*38.12*/.input(franchiseForm("Phone"),
							'_showConstraints -> false)/*39.35*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*39.61*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*40.55*/name)),format.raw/*40.59*/("""" id=""""),_display_(Seq[Any](/*40.66*/id)),format.raw/*40.68*/(""""
							placeholder= 'contact number'>
					""")))})),format.raw/*42.7*/("""
				
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Confirm</button>
				</div>
			""")))})),format.raw/*47.5*/("""

		</div>
		<div class="col-md-4 column">
			<div class="jumbotron">
				<h1>
					Hello!
				</h1>
				<p>
					Please don't create any spam restaurant. Temporary or permanent suspension may occur. 
				</p>
				<p>
					<a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*66.2*/common/*66.8*/.footer())),format.raw/*66.17*/("""

</body>

</html>"""))}
    }
    
    def render(franchiseForm:play.data.Form[models.Restaurants.Franchise]): play.api.templates.HtmlFormat.Appendable = apply(franchiseForm)
    
    def f:((play.data.Form[models.Restaurants.Franchise]) => play.api.templates.HtmlFormat.Appendable) = (franchiseForm) => apply(franchiseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 08:37:00 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/franchise/newFranchise.scala.html
                    HASH: bd5379d2219927e22e44d38e3641830581567805
                    MATRIX: 829->1|985->63|1056->100|1070->106|1116->131|1167->148|1180->154|1232->185|1495->413|1510->419|1611->510|1651->511|1692->517|1707->523|1780->587|1847->616|1938->671|1964->675|2007->682|2031->684|2116->738|2162->749|2177->755|2251->820|2315->846|2406->901|2432->905|2475->912|2499->914|2574->958|2615->964|2630->970|2706->1037|2770->1063|2861->1118|2887->1122|2930->1129|2954->1131|3024->1170|3065->1176|3080->1182|3154->1247|3218->1273|3309->1328|3335->1332|3378->1339|3402->1341|3479->1387|3630->1507|3994->1836|4008->1842|4039->1851
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|49->21|49->21|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|52->24|52->24|54->26|56->28|56->28|57->29|57->29|58->30|58->30|58->30|58->30|60->32|61->33|61->33|62->34|62->34|63->35|63->35|63->35|63->35|65->37|66->38|66->38|67->39|67->39|68->40|68->40|68->40|68->40|70->42|75->47|94->66|94->66|94->66
                    -- GENERATED --
                */
            