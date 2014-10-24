
package views.html.restaurant

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
object AddNewFood extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Foods.FoodItem],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(foodForm : play.data.Form[models.Foods.FoodItem]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""
<div class="modal fade" id="AddNewFood" tabindex="-1" role="dialog"
	aria-labelledby="signInModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="AddNewFoodLabel">Add New Food</h4>
			</div>
			<div class="modal-body">
			"""),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = controllers.Restaurant.routes.RestaurantManager.addFood())/*12.84*/{_display_(Seq[Any](format.raw/*12.85*/("""
						"""),_display_(Seq[Any](/*13.8*/helper/*13.14*/.input(foodForm("Item Title"),
								 '_showConstraints -> false)/*14.37*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*14.66*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*15.57*/name)),format.raw/*15.61*/("""" id=""""),_display_(Seq[Any](/*15.68*/id)),format.raw/*15.70*/(""""
									placeholder='Name for your franchise'>
							""")))})),format.raw/*17.9*/("""
						
						"""),_display_(Seq[Any](/*19.8*/helper/*19.14*/.input(foodForm("Item Category"),
									'_showConstraints -> false)/*20.37*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*20.63*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*21.57*/name)),format.raw/*21.61*/("""" id=""""),_display_(Seq[Any](/*21.68*/id)),format.raw/*21.70*/(""""
									placeholder='Email Address'>
							""")))})),format.raw/*23.9*/("""
						<div class="modal-footer">
							<button type="submit" class="btn btn-success">Confirm</button>
						</div>
					""")))})),format.raw/*27.7*/("""
					</div>
		</div>
	</div>
</div>"""))}
    }
    
    def render(foodForm:play.data.Form[models.Foods.FoodItem]): play.api.templates.HtmlFormat.Appendable = apply(foodForm)
    
    def f:((play.data.Form[models.Foods.FoodItem]) => play.api.templates.HtmlFormat.Appendable) = (foodForm) => apply(foodForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 24 23:49:13 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/restaurant/AddNewFood.scala.html
                    HASH: d5e1a3d2f9c3302666d70a008dbdc901bfcf1140
                    MATRIX: 821->1|965->51|1424->475|1439->481|1521->554|1560->555|1603->563|1618->569|1694->636|1761->665|1854->722|1880->726|1923->733|1947->735|2036->793|2086->808|2101->814|2180->884|2244->910|2337->967|2363->971|2406->978|2430->980|2509->1028|2663->1151
                    LINES: 26->1|29->1|40->12|40->12|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|43->15|43->15|45->17|47->19|47->19|48->20|48->20|49->21|49->21|49->21|49->21|51->23|55->27
                    -- GENERATED --
                */
            