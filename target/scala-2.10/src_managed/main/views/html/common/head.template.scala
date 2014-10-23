
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
object head extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<title>"""),_display_(Seq[Any](/*3.9*/title)),format.raw/*3.14*/("""</title>

<!-- <link rel='stylesheet' href='"""),_display_(Seq[Any](/*5.36*/routes/*5.42*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.81*/("""'>  -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<link href='"""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.Assets.at("stylesheets/select2.css"))),format.raw/*7.57*/("""' rel="stylesheet" type="text/css">

<link rel='stylesheet' href='"""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/index.css"))),format.raw/*9.72*/("""'>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*10.38*/routes/*10.44*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*10.83*/("""'></script>

<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("javascripts/typeahead.bundle.js"))),format.raw/*13.66*/(""""></script>
<!-- <link rel='text/javascript' href='"""),_display_(Seq[Any](/*14.41*/routes/*14.47*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*14.85*/("""'> -->

<style type="text/css">
.glyphicon """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
  font-family: 'Glyphicons Halflings';
  src: url("""),_display_(Seq[Any](/*19.13*/routes/*19.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot"))),format.raw/*19.71*/(""");
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
</style>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 23 09:14:27 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/head.scala.html
                    HASH: 6d77f62fc998d526b810f830a60b5b444b4d2918
                    MATRIX: 780->1|889->16|933->26|959->31|1039->76|1053->82|1113->121|1264->237|1278->243|1336->280|1438->347|1452->353|1508->388|1584->428|1599->434|1660->473|1809->586|1824->592|1891->637|1979->689|1994->695|2054->733|2125->776|2154->777|2242->829|2257->835|2331->887|2361->890|2389->891
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|47->19|47->19|47->19|48->20|48->20
                    -- GENERATED --
                */
            