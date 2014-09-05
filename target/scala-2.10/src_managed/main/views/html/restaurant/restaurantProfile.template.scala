
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
object restaurantProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Restaurant,List[RestaurantFood],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurant : Restaurant, foods : List[RestaurantFood]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/common/*3.8*/.main("Restaurant")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	
	<h2>Restaurant Name: """),_display_(Seq[Any](/*5.24*/restaurant/*5.34*/.name)),format.raw/*5.39*/("""</h2>
	<h2>Franchise: """),_display_(Seq[Any](/*6.18*/restaurant/*6.28*/.franchise.franchiseTitle)),format.raw/*6.53*/("""</h2>

	<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><h3> Food Menu </h3></div>
		  <div class="panel-body">	   
		 </div>
	
	<table class="table table-bordered table-striped table-hover">
		
		<tr>
			<th> <h4> Food Item </h4> </th>
			<th> <h4> Item Price </h4> </th>
			<th> <h4> Rating </h4> </th>
		</tr>
								
		"""),_display_(Seq[Any](/*22.4*/for(food <- foods) yield /*22.22*/{_display_(Seq[Any](format.raw/*22.23*/("""
			<tr>		    
		        <th> <h5>"""),_display_(Seq[Any](/*24.21*/food/*24.25*/.foodItem.itemTitle)),format.raw/*24.44*/("""</h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*25.21*/food/*25.25*/.price)),format.raw/*25.31*/("""</h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*26.21*/food/*26.25*/.rating)),format.raw/*26.32*/("""</h5> </th>
		    </tr>		    		    
		    """)))})),format.raw/*28.8*/("""
		    
	</table>
	
	<div class="col-md-4" id="add-options">
			<div class="row">
				<a class="btn" href=""""),_display_(Seq[Any](/*34.27*/controllers/*34.38*/.restaurant.routes.RestaurantFoodController.addFoodInMenu(restaurant.id))),format.raw/*34.110*/("""" >Add Food</a>
			</div>
	</div>
	
""")))})),format.raw/*38.2*/("""

"""))}
    }
    
    def render(restaurant:Restaurant,foods:List[RestaurantFood]): play.api.templates.HtmlFormat.Appendable = apply(restaurant,foods)
    
    def f:((Restaurant,List[RestaurantFood]) => play.api.templates.HtmlFormat.Appendable) = (restaurant,foods) => apply(restaurant,foods)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/restaurant/restaurantProfile.scala.html
                    HASH: 2bb58bf2a0907150a37cbddd13683b43d8841214
                    MATRIX: 822->1|971->56|1008->59|1021->65|1048->84|1087->86|1148->112|1166->122|1192->127|1250->150|1268->160|1314->185|1727->563|1761->581|1800->582|1871->617|1884->621|1925->640|1993->672|2006->676|2034->682|2102->714|2115->718|2144->725|2218->768|2362->876|2382->887|2477->959|2545->996
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|62->34|62->34|62->34|66->38
                    -- GENERATED --
                */
            