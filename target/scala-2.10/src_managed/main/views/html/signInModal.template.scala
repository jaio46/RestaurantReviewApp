
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
object signInModal extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="modal fade" id="signInModal" tabindex="-1" role="dialog"
	aria-labelledby="signInModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="signInModalLabel">Sign In</h4>
			</div>
			<form class="form-signin" action="/signIn" method="POST">
				<div class="modal-body">

					<p><input type="text" class="form-control" id="visitorID" name="visitorID"
						placeholder="Visitor ID" required autofocus></p> 
					<p><input type="password" class="form-control" id="password" name="password"
						placeholder="Password" required></p> 
					<p><label class="checkbox"> 
						<input type="checkbox" value="remember-me"
							id="remember-me" bame="remember-me"> Remember me
					</label></p>

				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Sign In</button>
				</div>
			</form>
		</div>
	</div>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/signInModal.scala.html
                    HASH: 19b2b59beb37c334b9395e421d6c9cc3dde92889
                    MATRIX: 861->0
                    LINES: 29->1
                    -- GENERATED --
                */
            