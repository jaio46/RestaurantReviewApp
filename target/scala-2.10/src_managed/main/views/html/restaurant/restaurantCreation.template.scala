
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
object restaurantCreation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[models.Restaurants.Franchise,play.data.Form[models.Restaurants.Restaurant],List[models.Restaurants.Restaurant],Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(franchise: models.Restaurants.Franchise , restaurantForm : play.data.Form[models.Restaurants.Restaurant] , restaurants : List[models.Restaurants.Restaurant] ,
cnt: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.14*/("""
<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(franchise.franchiseName +"- Add Restaurant"))),format.raw/*6.62*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("Create New Franchise"))),format.raw/*9.39*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h3 class="text-info">
						Add new restaurant to - """),_display_(Seq[Any](/*17.32*/franchise/*17.41*/.franchiseName)),format.raw/*17.55*/("""
					</h3>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-6 column">
					"""),_display_(Seq[Any](/*23.7*/helper/*23.13*/.form(action = controllers.Restaurant.routes.RestaurantManager.saveRestaurant())/*23.93*/{_display_(Seq[Any](format.raw/*23.94*/("""
						"""),_display_(Seq[Any](/*24.8*/helper/*24.14*/.input(restaurantForm("Name"),
								 '_showConstraints -> false)/*25.37*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*25.66*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*26.57*/name)),format.raw/*26.61*/("""" id=""""),_display_(Seq[Any](/*26.68*/id)),format.raw/*26.70*/(""""
									placeholder='Name for your franchise'>
							""")))})),format.raw/*28.9*/("""
						
						"""),_display_(Seq[Any](/*30.8*/helper/*30.14*/.input(restaurantForm("Email"),
									'_showConstraints -> false)/*31.37*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*31.63*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*32.57*/name)),format.raw/*32.61*/("""" id=""""),_display_(Seq[Any](/*32.68*/id)),format.raw/*32.70*/(""""
									placeholder='Email Address'>
							""")))})),format.raw/*34.9*/("""
						"""),_display_(Seq[Any](/*35.8*/helper/*35.14*/.input(restaurantForm("Address"),
									'_showConstraints -> false)/*36.37*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*36.63*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*37.57*/name)),format.raw/*37.61*/("""" id=""""),_display_(Seq[Any](/*37.68*/id)),format.raw/*37.70*/(""""
									placeholder= 'Address'>
							""")))})),format.raw/*39.9*/("""
						"""),_display_(Seq[Any](/*40.8*/helper/*40.14*/.input(restaurantForm("Phone"),
									'_showConstraints -> false)/*41.37*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*41.63*/("""
									<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*42.57*/name)),format.raw/*42.61*/("""" id=""""),_display_(Seq[Any](/*42.68*/id)),format.raw/*42.70*/(""""
									placeholder= 'contact number'>
							""")))})),format.raw/*44.9*/("""
						
						<div class="modal-footer">
							<button type="submit" class="btn btn-success">Confirm</button>
						</div>
					""")))})),format.raw/*49.7*/("""
				</div>
				<div class="col-md-6 column">
					<div class="list-group">
						 <a href="#" class="list-group-item active">"""),_display_(Seq[Any](/*53.52*/franchise/*53.61*/.franchiseName)),format.raw/*53.75*/(""" - Top Restaurants</a>
						 """),_display_(Seq[Any](/*54.9*/if(restaurants.isEmpty)/*54.32*/{_display_(Seq[Any](format.raw/*54.33*/("""
						 	<div class="list-group-item">
								Sorry, no Restaurants yet
							</div>
						 """)))})),format.raw/*58.9*/("""
						"""),_display_(Seq[Any](/*59.8*/for( restaurant<-restaurants ) yield /*59.38*/{_display_(Seq[Any](format.raw/*59.39*/("""
							<div class="list-group-item">
								<a href='/restaurant/"""),_display_(Seq[Any](/*61.31*/restaurant/*61.41*/.id)),format.raw/*61.44*/("""'>"""),_display_(Seq[Any](/*61.47*/restaurant/*61.57*/.restaurantName)),format.raw/*61.72*/("""</a>
							</div>
						""")))})),format.raw/*63.8*/("""
						<a class="list-group-item active" href="http://localhost:9000/franchise/"""),_display_(Seq[Any](/*64.80*/franchise/*64.89*/.id)),format.raw/*64.92*/(""""><span class="badge">"""),_display_(Seq[Any](/*64.115*/cnt)),format.raw/*64.118*/("""</span>More</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

"""),_display_(Seq[Any](/*72.2*/common/*72.8*/.footer())),format.raw/*72.17*/("""

</body>

</html>"""))}
    }
    
    def render(franchise:models.Restaurants.Franchise,restaurantForm:play.data.Form[models.Restaurants.Restaurant],restaurants:List[models.Restaurants.Restaurant],cnt:Integer): play.api.templates.HtmlFormat.Appendable = apply(franchise,restaurantForm,restaurants,cnt)
    
    def f:((models.Restaurants.Franchise,play.data.Form[models.Restaurants.Restaurant],List[models.Restaurants.Restaurant],Integer) => play.api.templates.HtmlFormat.Appendable) = (franchise,restaurantForm,restaurants,cnt) => apply(franchise,restaurantForm,restaurants,cnt)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 25 13:34:25 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/restaurant/restaurantCreation.scala.html
                    HASH: 055b3c19cf819cb916c249eac336de8df2019201
                    MATRIX: 910->1|1177->174|1247->210|1261->216|1332->266|1383->283|1396->289|1448->320|1695->531|1713->540|1749->554|1887->657|1902->663|1991->743|2030->744|2073->752|2088->758|2164->825|2231->854|2324->911|2350->915|2393->922|2417->924|2506->982|2556->997|2571->1003|2648->1071|2712->1097|2805->1154|2831->1158|2874->1165|2898->1167|2977->1215|3020->1223|3035->1229|3114->1299|3178->1325|3271->1382|3297->1386|3340->1393|3364->1395|3438->1438|3481->1446|3496->1452|3573->1520|3637->1546|3730->1603|3756->1607|3799->1614|3823->1616|3904->1666|4065->1796|4228->1923|4246->1932|4282->1946|4348->1977|4380->2000|4419->2001|4545->2096|4588->2104|4634->2134|4673->2135|4777->2203|4796->2213|4821->2216|4860->2219|4879->2229|4916->2244|4973->2270|5089->2350|5107->2359|5132->2362|5192->2385|5218->2388|5328->2463|5342->2469|5373->2478
                    LINES: 26->1|30->2|34->6|34->6|34->6|37->9|37->9|37->9|45->17|45->17|45->17|51->23|51->23|51->23|51->23|52->24|52->24|53->25|53->25|54->26|54->26|54->26|54->26|56->28|58->30|58->30|59->31|59->31|60->32|60->32|60->32|60->32|62->34|63->35|63->35|64->36|64->36|65->37|65->37|65->37|65->37|67->39|68->40|68->40|69->41|69->41|70->42|70->42|70->42|70->42|72->44|77->49|81->53|81->53|81->53|82->54|82->54|82->54|86->58|87->59|87->59|87->59|89->61|89->61|89->61|89->61|89->61|89->61|91->63|92->64|92->64|92->64|92->64|92->64|100->72|100->72|100->72
                    -- GENERATED --
                */
            