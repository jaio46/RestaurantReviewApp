
package views.html.common

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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="footer" role="contentinfo">
	<div class="container">
		<div class="copyright">&copy; 2014</div>
		<ul class="bs-docs-footer-links muted">
			<li><a href="/about">About Us</a></li>
			<li><a href="/contact">Contact</a></li>
			<li><a href="/terms">Terms and Condition</a></li>
			<li><a href="/privacy">Privacy Policy</a></li>
			<li><a href="/help">Help</a></li>
		</ul>
	</div>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 16 10:26:42 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/common/footer.scala.html
                    HASH: 5d9aabbb4fb10c77bb4520fcedf086486fd0e1c0
                    MATRIX: 863->0
                    LINES: 29->1
                    -- GENERATED --
                */
            