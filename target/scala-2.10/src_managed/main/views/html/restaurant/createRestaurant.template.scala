
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
object createRestaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.data.Form[models.Restaurant],Seq[models.Franchise],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurantForm: play.data.Form[models.Restaurant], franchises : Seq[models.Franchise]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.89*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/common/*5.8*/.main("Add New Restairant")/*5.35*/{_display_(Seq[Any](format.raw/*5.36*/("""
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action = controllers.restaurant.routes.RestaurantController.addRestaurant())/*6.91*/ {_display_(Seq[Any](format.raw/*6.93*/("""
		<div class="modal-body">

			"""),_display_(Seq[Any](/*9.5*/helper/*9.11*/.input(restaurantForm("name"),
				 '_showConstraints -> false, 
				 '_class -> "no-dt")/*11.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*11.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*12.53*/name)),format.raw/*12.57*/("""" id=""""),_display_(Seq[Any](/*12.64*/id)),format.raw/*12.66*/(""""
					placeholder="Name">
			""")))})),format.raw/*14.5*/("""
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.input(restaurantForm("email"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*18.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*18.54*/("""
					<input type="email" class="form-control" name=""""),_display_(Seq[Any](/*19.54*/name)),format.raw/*19.58*/("""" id=""""),_display_(Seq[Any](/*19.65*/id)),format.raw/*19.67*/(""""
					placeholder="Email">
			""")))})),format.raw/*21.5*/("""
			
			"""),_display_(Seq[Any](/*23.5*/helper/*23.11*/.input(restaurantForm("phone"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*25.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.54*/("""
					<input type="tel" class="form-control" name=""""),_display_(Seq[Any](/*26.52*/name)),format.raw/*26.56*/("""" id=""""),_display_(Seq[Any](/*26.63*/id)),format.raw/*26.65*/(""""
					placeholder="Phone">
			""")))})),format.raw/*28.5*/("""
			
			"""),_display_(Seq[Any](/*30.5*/helper/*30.11*/.input(restaurantForm("address"),
				 '_showConstraints -> false,
				 '_class -> "no-dt")/*32.25*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*32.54*/("""
					<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*33.53*/name)),format.raw/*33.57*/("""" id=""""),_display_(Seq[Any](/*33.64*/id)),format.raw/*33.66*/(""""
					placeholder="Address">
			""")))})),format.raw/*35.5*/("""
			
			"""),_display_(Seq[Any](/*37.5*/helper/*37.11*/.select(field = restaurantForm("franchise"), franchises.map {a => a.id.toString -> a.franchiseTitle}, '_label -> "Choose Franchise"))),format.raw/*37.143*/("""
			
			
		</div>
		<div class="Submission">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	""")))})),format.raw/*44.3*/("""
""")))})))}
    }
    
    def render(restaurantForm:play.data.Form[models.Restaurant],franchises:Seq[models.Franchise]): play.api.templates.HtmlFormat.Appendable = apply(restaurantForm,franchises)
    
    def f:((play.data.Form[models.Restaurant],Seq[models.Franchise]) => play.api.templates.HtmlFormat.Appendable) = (restaurantForm,franchises) => apply(restaurantForm,franchises)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/restaurant/createRestaurant.scala.html
                    HASH: 1fec77158f48ff3ef071425db34c9d66f3d87e19
                    MATRIX: 845->1|1042->88|1070->107|1106->109|1119->115|1154->142|1192->143|1229->146|1242->152|1332->234|1371->236|1438->269|1452->275|1550->364|1617->393|1706->446|1732->450|1775->457|1799->459|1861->490|1905->499|1920->505|2018->594|2085->623|2175->677|2201->681|2244->688|2268->690|2331->722|2375->731|2390->737|2488->826|2555->855|2643->907|2669->911|2712->918|2736->920|2799->952|2843->961|2858->967|2958->1058|3025->1087|3114->1140|3140->1144|3183->1151|3207->1153|3272->1187|3316->1196|3331->1202|3486->1334|3638->1455
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|37->9|37->9|39->11|39->11|40->12|40->12|40->12|40->12|42->14|44->16|44->16|46->18|46->18|47->19|47->19|47->19|47->19|49->21|51->23|51->23|53->25|53->25|54->26|54->26|54->26|54->26|56->28|58->30|58->30|60->32|60->32|61->33|61->33|61->33|61->33|63->35|65->37|65->37|65->37|72->44
                    -- GENERATED --
                */
            