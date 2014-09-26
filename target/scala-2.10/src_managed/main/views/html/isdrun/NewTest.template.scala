
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
                    DATE: Mon Sep 22 21:49:20 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/isdrun/NewTest.scala.html
                    HASH: 1fecd8e13201a129aaf516ecb6f72f9c23f1bb87
                    MATRIX: 864->0|1001->101|1016->107|1080->149
                    LINES: 29->1|38->10|38->10|38->10
                    -- GENERATED --
                */
            