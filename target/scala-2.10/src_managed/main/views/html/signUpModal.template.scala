
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
object signUpModal extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Visitor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signUpForm: play.data.Form[models.Visitor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

<div class="modal fade" id="signUpModal" tabindex="-1" role="dialog"
	aria-labelledby="signUpModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="signUpModalLabel">Sign Up</h4>
			</div>
			"""),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = controllers.routes.VisitorEnd.signUp())/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/("""
				<div class="modal-body">

					"""),_display_(Seq[Any](/*15.7*/helper/*15.13*/.input(signUpForm("visitorID"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*17.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*17.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*18.55*/name)),format.raw/*18.59*/("""" id=""""),_display_(Seq[Any](/*18.66*/id)),format.raw/*18.68*/(""""
							placeholder="Visitor ID">
					""")))})),format.raw/*20.7*/("""
					
					
					"""),_display_(Seq[Any](/*23.7*/helper/*23.13*/.input(signUpForm("firstName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*25.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*26.55*/name)),format.raw/*26.59*/("""" id=""""),_display_(Seq[Any](/*26.66*/id)),format.raw/*26.68*/(""""
							placeholder="First Name">
					""")))})),format.raw/*28.7*/("""
					
					"""),_display_(Seq[Any](/*30.7*/helper/*30.13*/.input(signUpForm("lastName"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*32.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*32.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*33.55*/name)),format.raw/*33.59*/("""" id=""""),_display_(Seq[Any](/*33.66*/id)),format.raw/*33.68*/(""""
							placeholder="Last Name">
					""")))})),format.raw/*35.7*/("""
					
					
					"""),_display_(Seq[Any](/*38.7*/helper/*38.13*/.inputRadioGroup(
						signUpForm("gender"),
						options = Seq("Male"->"Male","Female"->"Female","Other"->"Other"),
						'_label -> "Gender",
						'_error -> signUpForm("Gender").error.map(_.withMessage("Please Select Gender"))))),format.raw/*42.88*/("""
				    
					
					"""),_display_(Seq[Any](/*45.7*/helper/*45.13*/.input(signUpForm("address"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*47.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*47.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*48.55*/name)),format.raw/*48.59*/("""" id=""""),_display_(Seq[Any](/*48.66*/id)),format.raw/*48.68*/(""""
							placeholder="Address">
					""")))})),format.raw/*50.7*/("""
					
					"""),_display_(Seq[Any](/*52.7*/helper/*52.13*/.input(signUpForm("occupation"),
						 '_showConstraints -> false, 
						 '_class -> "no-dt")/*54.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*54.56*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*55.55*/name)),format.raw/*55.59*/("""" id=""""),_display_(Seq[Any](/*55.66*/id)),format.raw/*55.68*/(""""
							placeholder="Occupation">
					""")))})),format.raw/*57.7*/("""
					
					<!-- """),_display_(Seq[Any](/*59.12*/helper/*59.18*/.input(signUpForm("email"),
						 '_showConstraints -> false,
						 '_class -> "no-dt")/*61.27*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*61.56*/("""
							<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*62.56*/name)),format.raw/*62.60*/("""" id=""""),_display_(Seq[Any](/*62.67*/id)),format.raw/*62.69*/(""""
							placeholder="Email">
					""")))})),format.raw/*64.7*/(""" -->

					
					<p><input type="password" class="form-control" placeholder="Password"
						id="password" name="password" required></p>
					<!-- <p><button type="button" class="btn btn-default">Select Image</button>
						<b>1005003.jpg</b></p>  --> 

				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign Up</button>
				</div>
			""")))})),format.raw/*76.5*/("""
		</div>
	</div>
</div>"""))}
    }
    
    def render(signUpForm:play.data.Form[models.Visitor]): play.api.templates.HtmlFormat.Appendable = apply(signUpForm)
    
    def f:((play.data.Form[models.Visitor]) => play.api.templates.HtmlFormat.Appendable) = (signUpForm) => apply(signUpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/signUpModal.scala.html
                    HASH: d0b5b7c456157a2b7d4974bbf0e7835a4483257d
                    MATRIX: 804->1|942->45|1371->439|1386->445|1449->499|1489->501|1561->538|1576->544|1679->638|1746->667|1837->722|1863->726|1906->733|1930->735|2002->776|2056->795|2071->801|2174->895|2241->924|2332->979|2358->983|2401->990|2425->992|2497->1033|2545->1046|2560->1052|2662->1145|2729->1174|2820->1229|2846->1233|2889->1240|2913->1242|2984->1282|3038->1301|3053->1307|3308->1540|3365->1562|3380->1568|3481->1660|3548->1689|3639->1744|3665->1748|3708->1755|3732->1757|3801->1795|3849->1808|3864->1814|3968->1909|4035->1938|4126->1993|4152->1997|4195->2004|4219->2006|4291->2047|4345->2065|4360->2071|4458->2160|4525->2189|4617->2245|4643->2249|4686->2256|4710->2258|4777->2294|5187->2673
                    LINES: 26->1|29->1|40->12|40->12|40->12|40->12|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|51->23|51->23|53->25|53->25|54->26|54->26|54->26|54->26|56->28|58->30|58->30|60->32|60->32|61->33|61->33|61->33|61->33|63->35|66->38|66->38|70->42|73->45|73->45|75->47|75->47|76->48|76->48|76->48|76->48|78->50|80->52|80->52|82->54|82->54|83->55|83->55|83->55|83->55|85->57|87->59|87->59|89->61|89->61|90->62|90->62|90->62|90->62|92->64|104->76
                    -- GENERATED --
                */
            