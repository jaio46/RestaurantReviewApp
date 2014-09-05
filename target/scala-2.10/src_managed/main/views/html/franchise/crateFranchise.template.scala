
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
object crateFranchise extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Franchise],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(franchiseForm: play.data.Form[models.Franchise]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.main("Add New Franchise")/*5.34*/{_display_(Seq[Any](format.raw/*5.35*/("""
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = controllers.franchise.routes.FranchiseController.addNewFranhcise())/*6.91*/ {_display_(Seq[Any](format.raw/*6.93*/("""
		<div class="modal-body">

			"""),_display_(Seq[Any](/*9.5*/helper/*9.11*/.input(franchiseForm("franchiseTitle"),
				 '_showConstraints -> false, 
				 '_class -> "no-dt")/*11.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*11.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*12.53*/name)),format.raw/*12.57*/("""" id=""""),_display_(Seq[Any](/*12.64*/id)),format.raw/*12.66*/(""""
					placeholder="Name">
			""")))})),format.raw/*14.5*/("""
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.input(franchiseForm("email"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*18.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*18.54*/("""
					<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*19.54*/name)),format.raw/*19.58*/("""" id=""""),_display_(Seq[Any](/*19.65*/id)),format.raw/*19.67*/(""""
					placeholder="Email">
			""")))})),format.raw/*21.5*/("""
			
			"""),_display_(Seq[Any](/*23.5*/helper/*23.11*/.input(franchiseForm("phone"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*25.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.54*/("""
					<input type="tel" class="form-control" name=""""),_display_(Seq[Any](/*26.52*/name)),format.raw/*26.56*/("""" id=""""),_display_(Seq[Any](/*26.63*/id)),format.raw/*26.65*/(""""
					placeholder="Phone">
			""")))})),format.raw/*28.5*/("""
			
			"""),_display_(Seq[Any](/*30.5*/helper/*30.11*/.input(franchiseForm("address"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*32.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*32.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*33.53*/name)),format.raw/*33.57*/("""" id=""""),_display_(Seq[Any](/*33.64*/id)),format.raw/*33.66*/(""""
					placeholder="Address">
			""")))})),format.raw/*35.5*/("""
			
		</div>
		<div class="Submission">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	""")))})),format.raw/*41.3*/("""
""")))})))}
    }
    
    def render(franchiseForm:play.data.Form[models.Franchise]): play.api.templates.HtmlFormat.Appendable = apply(franchiseForm)
    
    def f:((play.data.Form[models.Franchise]) => play.api.templates.HtmlFormat.Appendable) = (franchiseForm) => apply(franchiseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/franchise/crateFranchise.scala.html
                    HASH: 40c446d55fe92b55a8e7f26753c41aa29469533a
                    MATRIX: 819->1|978->50|1006->69|1042->71|1055->77|1089->103|1127->104|1164->107|1177->113|1267->195|1306->197|1373->230|1387->236|1494->334|1561->363|1650->416|1676->420|1719->427|1743->429|1805->460|1849->469|1864->475|1961->563|2028->592|2118->646|2144->650|2187->657|2211->659|2274->691|2318->700|2333->706|2430->794|2497->823|2585->875|2611->879|2654->886|2678->888|2741->920|2785->929|2800->935|2899->1025|2966->1054|3055->1107|3081->1111|3124->1118|3148->1120|3213->1154|3361->1271
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|37->9|37->9|39->11|39->11|40->12|40->12|40->12|40->12|42->14|44->16|44->16|46->18|46->18|47->19|47->19|47->19|47->19|49->21|51->23|51->23|53->25|53->25|54->26|54->26|54->26|54->26|56->28|58->30|58->30|60->32|60->32|61->33|61->33|61->33|61->33|63->35|69->41
                    -- GENERATED --
                */
            