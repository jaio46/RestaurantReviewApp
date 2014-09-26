
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
object Restaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(title))),format.raw/*6.24*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar(title))),format.raw/*9.22*/("""

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-3 column">
                    <img alt="200x200" src="http://lorempixel.com/200/200/food">
                </div>
                <div class="col-md-6 column">
                    <h2>
                        Western Grill
                    </h2>
                    <p>
                        A place to enjoy grills
                    </p>
                    <p>
                        <a class="btn" href="#">About »</a>
                    </p>
                </div>
                <div class="col-md-3 column">
                </div>
            </div>
            <h3>
                Menu and Pricing
            </h3>
            <table class="table">
                <thead>
                <tr>
                    <th>
                        #
                    </th>
                    <th>
                        Product
                    </th>
                    <th>
                        Price (+15% vat)
                    </th>
                    <th>
                        Rating
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        1
                    </td>
                    <td>
                        Chicken Cheese Burger
                    </td>
                    <td>
                        100
                    </td>
                    <td>
                        <img src=""""),_display_(Seq[Any](/*64.36*/routes/*64.42*/.Assets.at("images/rating6.png"))),format.raw/*64.74*/(""""></img>
                    </td>
                </tr>
                <tr class="active">
                    <td>
                        2
                    </td>
                    <td>
                        Beef Cheese Burger
                    </td>
                    <td>
                        100
                    </td>
                    <td>
                        <img src=""""),_display_(Seq[Any](/*78.36*/routes/*78.42*/.Assets.at("images/rating6.png"))),format.raw/*78.74*/(""""></img>
                    </td>
                </tr>
                <tr class="success">
                    <td>
                        3
                    </td>
                    <td>
                        Double Beef Cheese Burger (drinks add on)
                    </td>
                    <td>
                        100
                    </td>
                    <td>
                        <img src=""""),_display_(Seq[Any](/*92.36*/routes/*92.42*/.Assets.at("images/rating6.png"))),format.raw/*92.74*/(""""></img>
                    </td>
                </tr>
                <tr class>
                    <td>
                        4
                    </td>
                    <td>
                        Double Beef Cheese Burger with french fry
                    </td>
                    <td>
                        100
                    </td>
                    <td>
                        <img src=""""),_display_(Seq[Any](/*106.36*/routes/*106.42*/.Assets.at("images/rating6.png"))),format.raw/*106.74*/(""""></img>
                    </td>
                </tr>
                <tr class>
                    <td>
                        5
                    </td>
                    <td>
                        Double Beef Cheese Burger with french fry
                    </td>
                    <td>
                        100
                    </td>
                    <td>
                        <img src=""""),_display_(Seq[Any](/*120.36*/routes/*120.42*/.Assets.at("images/rating6.png"))),format.raw/*120.74*/(""""></img>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
        </div>
    </div>
</div>

"""),_display_(Seq[Any](/*133.2*/common/*133.8*/.footer())),format.raw/*133.17*/("""

</body>

</html>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 16 10:26:42 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/isdrun/Restaurant.scala.html
                    HASH: 81b28e7dc286dcabe5c05d1b5dbe25e4afe1cd60
                    MATRIX: 786->1|896->17|967->54|981->60|1014->72|1065->89|1078->95|1113->109|2772->1732|2787->1738|2841->1770|3280->2173|3295->2179|3349->2211|3812->2638|3827->2644|3881->2676|4335->3093|4351->3099|4406->3131|4860->3548|4876->3554|4931->3586|5201->3820|5216->3826|5248->3835
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|92->64|92->64|92->64|106->78|106->78|106->78|120->92|120->92|120->92|134->106|134->106|134->106|148->120|148->120|148->120|161->133|161->133|161->133
                    -- GENERATED --
                */
            