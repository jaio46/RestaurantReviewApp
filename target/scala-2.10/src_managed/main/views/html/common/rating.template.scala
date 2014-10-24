
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
object rating extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Double,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(linkId : String, presentRating: Double):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""


<input type="number" class="rating" id='"""),_display_(Seq[Any](/*4.42*/linkId)),format.raw/*4.48*/("""' name="test" data-min="1" data-max="5" value='"""),_display_(Seq[Any](/*4.96*/presentRating)),format.raw/*4.109*/("""'>"""))}
    }
    
    def render(linkId:String,presentRating:Double): play.api.templates.HtmlFormat.Appendable = apply(linkId,presentRating)
    
    def f:((String,Double) => play.api.templates.HtmlFormat.Appendable) = (linkId,presentRating) => apply(linkId,presentRating)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 24 23:44:45 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/rating.scala.html
                    HASH: a788297b5a6db57a3270e691939ed409b32f2ebd
                    MATRIX: 789->1|923->41|1002->85|1029->91|1112->139|1147->152
                    LINES: 26->1|29->1|32->4|32->4|32->4|32->4
                    -- GENERATED --
                */
            