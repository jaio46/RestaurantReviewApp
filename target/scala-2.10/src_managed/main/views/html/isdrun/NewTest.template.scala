
package views.html.isdrun

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
object NewTest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
  <title>
      Test Page
  </title>
</head>
<body>
	<script src=""""),_display_(Seq[Any](/*9.16*/routes/*9.22*/.Assets.at("javascripts/jquery-1.11.0.js"))),format.raw/*9.64*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("javascripts/facebookLogin.js"))),format.raw/*10.67*/(""""></script>
    <button onclick="Login()">Submit</button>
    <div id="status">
		Key<br/>
	</div>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 07 13:59:07 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/isdrun/NewTest.scala.html
                    HASH: 4ae3826389c653aa12ba682dd8d55fadb280001c
                    MATRIX: 864->0|996->97|1010->103|1073->145|1139->175|1154->181|1218->223
                    LINES: 29->1|37->9|37->9|37->9|38->10|38->10|38->10
                    -- GENERATED --
                */
            