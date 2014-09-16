
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(title))),format.raw/*6.24*/("""
</head>
<body>

"""),_display_(Seq[Any](/*10.2*/common/*10.8*/.navbar(title))),format.raw/*10.22*/("""

<div class="container container-body">
    """),_display_(Seq[Any](/*13.6*/content)),format.raw/*13.13*/("""
</div>

"""),_display_(Seq[Any](/*16.2*/common/*16.8*/.footer())),format.raw/*16.17*/("""

</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 16 08:24:17 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/common/main.scala.html
                    HASH: 65ed977c956c075e5f5d431a6cc1cfe0174e3cbb
                    MATRIX: 785->1|909->31|980->68|994->74|1027->86|1080->104|1094->110|1130->124|1211->170|1240->177|1285->187|1299->193|1330->202
                    LINES: 26->1|29->1|34->6|34->6|34->6|38->10|38->10|38->10|41->13|41->13|44->16|44->16|44->16
                    -- GENERATED --
                */
            