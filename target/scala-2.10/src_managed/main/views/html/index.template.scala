
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Visitor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signUpForm: play.data.Form[models.Visitor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

"""),_display_(Seq[Any](/*3.2*/common/*3.8*/.guest("Restaurant Database System")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
	<div class="container">
		<img id="main" src=""""),_display_(Seq[Any](/*5.24*/routes/*5.30*/.Assets.at("images/restaurant.jpg"))),format.raw/*5.65*/(""""></img>
		<div class="container" id="sign-up-in-container">
			<div class="heading-banner">
				<h4>If you are not registered please sign-up. Otherwise sign-in to rate your favorite restaurant or food item.</h4>
			</div>
			<hr/>
			<div class="row">
				<button type="button" id="sign-up" class="btn btn-primary btn-large btn-block btn-lg" 
					role="button" data-toggle="modal" data-target="#signUpModal">Sign Up</button>
				<p class="or">Or</p>
				<button type="button" id="sign-in" class="btn btn-default btn-large btn-block btn-lg"
					role="button" data-toggle="modal" data-target="#signInModal">Sign In</button>
			</div>
		</div>
	</div>
	"""),_display_(Seq[Any](/*20.3*/views/*20.8*/.html.signInModal())),format.raw/*20.27*/("""
	"""),_display_(Seq[Any](/*21.3*/views/*21.8*/.html.signUpModal(signUpForm))),format.raw/*21.37*/("""
""")))})))}
    }
    
    def render(signUpForm:play.data.Form[models.Visitor]): play.api.templates.HtmlFormat.Appendable = apply(signUpForm)
    
    def f:((play.data.Form[models.Visitor]) => play.api.templates.HtmlFormat.Appendable) = (signUpForm) => apply(signUpForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/index.scala.html
                    HASH: 87afa701d044e8020f7a2c2896f7659f654d27b4
                    MATRIX: 798->1|936->45|973->48|986->54|1030->90|1069->92|1153->141|1167->147|1223->182|1912->836|1925->841|1966->860|2004->863|2017->868|2068->897
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|48->20|48->20|48->20|49->21|49->21|49->21
                    -- GENERATED --
                */
            