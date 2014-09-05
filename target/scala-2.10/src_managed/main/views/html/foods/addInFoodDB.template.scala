
package views.html.foods

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
object addInFoodDB extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.FoodItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(foodForm: play.data.Form[models.FoodItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.main("Add Food")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
	
	"""),_display_(Seq[Any](/*7.3*/helper/*7.9*/.form(action = controllers.foods.routes.FoodController.saveFood())/*7.75*/ {_display_(Seq[Any](format.raw/*7.77*/("""
		<div class="modal-body">
		
			
			"""),_display_(Seq[Any](/*11.5*/helper/*11.11*/.input(foodForm("itemTitle"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*13.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*13.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*14.53*/name)),format.raw/*14.57*/("""" id=""""),_display_(Seq[Any](/*14.64*/id)),format.raw/*14.66*/(""""
					placeholder="Food Title">
			""")))})),format.raw/*16.5*/("""
			
			"""),_display_(Seq[Any](/*18.5*/helper/*18.11*/.input(foodForm("category"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*20.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*20.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*21.53*/name)),format.raw/*21.57*/("""" id=""""),_display_(Seq[Any](/*21.64*/id)),format.raw/*21.66*/(""""
					placeholder="Category">
			""")))})),format.raw/*23.5*/("""
		</div>
		
		<div class="Submission">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	""")))})),format.raw/*29.3*/("""
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(foodForm:play.data.Form[models.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(foodForm)
    
    def f:((play.data.Form[models.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (foodForm) => apply(foodForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:49 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/foods/addInFoodDB.scala.html
                    HASH: b142411b35de307c127bbc3d5001874565275c14
                    MATRIX: 811->1|964->44|992->63|1028->65|1041->71|1066->88|1105->90|1144->95|1157->101|1231->167|1270->169|1344->208|1359->214|1455->301|1522->330|1611->383|1637->387|1680->394|1704->396|1772->433|1816->442|1831->448|1926->534|1993->563|2082->616|2108->620|2151->627|2175->629|2241->664|2388->780|2421->782
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|35->7|39->11|39->11|41->13|41->13|42->14|42->14|42->14|42->14|44->16|46->18|46->18|48->20|48->20|49->21|49->21|49->21|49->21|51->23|57->29|58->30
                    -- GENERATED --
                */
            