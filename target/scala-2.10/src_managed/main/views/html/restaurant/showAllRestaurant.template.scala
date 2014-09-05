
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
object showAllRestaurant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Restaurant],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(restaurants : List[Restaurant]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(Seq[Any](/*3.2*/common/*3.8*/.main("Restaurant")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	

	<div class="panel panel-default">
		  <!-- Default panel contents -->
		  <div class="panel-heading"><h3> All Restaurants </h3></div>
		  <div class="panel-body">	   
		 </div>
	
	<table class="table table-bordered table-striped table-hover">
		
		<tr>
			<th> <h4> Restaurant Name </h4> </th>
			<th> <h4> Location </h4> </th>
			<th> <h4> Phone Number </h4> </th>
		</tr>
								
		"""),_display_(Seq[Any](/*20.4*/for(restaurant <- restaurants) yield /*20.34*/{_display_(Seq[Any](format.raw/*20.35*/("""
			<tr>		    
		        <th> <h5><a class="btn" href=""""),_display_(Seq[Any](/*22.42*/controllers/*22.53*/.restaurant.routes.RestaurantController.showRestaurantProfile(restaurant.id))),format.raw/*22.129*/(""""> """),_display_(Seq[Any](/*22.133*/restaurant/*22.143*/.name)),format.raw/*22.148*/(""" </a></h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*23.21*/restaurant/*23.31*/.address)),format.raw/*23.39*/("""</h5> </th>
		        <th> <h5>"""),_display_(Seq[Any](/*24.21*/restaurant/*24.31*/.phone)),format.raw/*24.37*/("""</h5> </th>
		    </tr>		    		    
		    """)))})),format.raw/*26.8*/("""
		    
	</table>

""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(restaurants:List[Restaurant]): play.api.templates.HtmlFormat.Appendable = apply(restaurants)
    
    def f:((List[Restaurant]) => play.api.templates.HtmlFormat.Appendable) = (restaurants) => apply(restaurants)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/restaurant/showAllRestaurant.scala.html
                    HASH: 7efccf3834ff70c5ce8c12a637bd5a6c29719ba9
                    MATRIX: 807->1|933->33|970->36|983->42|1010->61|1049->63|1475->454|1521->484|1560->485|1652->541|1672->552|1771->628|1812->632|1832->642|1860->647|1933->684|1952->694|1982->702|2050->734|2069->744|2097->750|2171->793|2222->813
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|48->20|48->20|48->20|50->22|50->22|50->22|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|54->26|58->30
                    -- GENERATED --
                */
            