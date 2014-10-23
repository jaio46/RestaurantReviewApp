
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
object navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<style type="text/css">

html """),format.raw/*5.6*/("""{"""),format.raw/*5.7*/("""
    overflow-y: scroll;
"""),format.raw/*7.1*/("""}"""),format.raw/*7.2*/("""
.container """),format.raw/*8.12*/("""{"""),format.raw/*8.13*/("""
    margin: 0 auto;
    max-width: 750px;
    text-align: center;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
.tt-dropdown-menu, .gist """),format.raw/*13.26*/("""{"""),format.raw/*13.27*/("""
    text-align: left;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""
html """),format.raw/*16.6*/("""{"""),format.raw/*16.7*/("""
    color: #333333;
    font-family:"Helvetica Neue", Helvetica, Arial, sans-serif;
    font-size: 18px;
    line-height: 1.2;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""
.title, .example-name """),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""
    font-family: Prociono;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
p """),format.raw/*25.3*/("""{"""),format.raw/*25.4*/("""
    margin: 0 0 10px;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""
.title """),format.raw/*28.8*/("""{"""),format.raw/*28.9*/("""
    font-size: 64px;
    margin: 20px 0 0;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
.example """),format.raw/*32.10*/("""{"""),format.raw/*32.11*/("""
    padding: 30px 0;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
.example-name """),format.raw/*35.15*/("""{"""),format.raw/*35.16*/("""
    font-size: 32px;
    margin: 20px 0;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
.demo """),format.raw/*39.7*/("""{"""),format.raw/*39.8*/("""
    margin: 50px 0;
    position: relative;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""
.typeahead, .tt-query, .tt-hint """),format.raw/*43.33*/("""{"""),format.raw/*43.34*/("""
    border: 1px solid #CCCCCC;
    border-radius: 4px 4px 4px 4px;
    font-size: 20px;
    height: 34px;
    line-height: 26px;
    outline: medium none;
    padding: 8px;
    width: 396px;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""
.typeahead """),format.raw/*53.12*/("""{"""),format.raw/*53.13*/("""
    background-color: #FFFFFF;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
.typeahead:focus """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
    border: 1px solid #0097CF;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
.tt-query """),format.raw/*59.11*/("""{"""),format.raw/*59.12*/("""
    box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
.tt-hint """),format.raw/*62.10*/("""{"""),format.raw/*62.11*/("""
    color: #999999;
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""
.tt-dropdown-menu """),format.raw/*65.19*/("""{"""),format.raw/*65.20*/("""
    background-color: #FFFFFF;
    border: 1px solid rgba(0, 0, 0, 0.2);
    border-radius: 8px 8px 8px 8px;
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
    margin-top: 12px;
    padding: 8px 0;
    width: 422px;
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
.tt-suggestion """),format.raw/*74.16*/("""{"""),format.raw/*74.17*/("""
    font-size: 18px;
    line-height: 24px;
    padding: 3px 20px;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""
.tt-suggestion.tt-cursor """),format.raw/*79.26*/("""{"""),format.raw/*79.27*/("""
    background-color: #0097CF;
    color: #FFFFFF;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""
.tt-suggestion p """),format.raw/*83.18*/("""{"""),format.raw/*83.19*/("""
    margin: 0;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""
.gist """),format.raw/*86.7*/("""{"""),format.raw/*86.8*/("""
    font-size: 14px;
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
.example-twitter-oss .tt-suggestion """),format.raw/*89.37*/("""{"""),format.raw/*89.38*/("""
    padding: 8px 20px;
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""
.example-twitter-oss .tt-suggestion + .tt-suggestion """),format.raw/*92.54*/("""{"""),format.raw/*92.55*/("""
    border-top: 1px solid #CCCCCC;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""
.example-twitter-oss .repo-language """),format.raw/*95.37*/("""{"""),format.raw/*95.38*/("""
    float: right;
    font-style: italic;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""
.example-twitter-oss .repo-name """),format.raw/*99.33*/("""{"""),format.raw/*99.34*/("""
    font-weight: bold;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""
.example-twitter-oss .repo-description """),format.raw/*102.40*/("""{"""),format.raw/*102.41*/("""
    font-size: 14px;
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/("""
.example-sports .league-name """),format.raw/*105.30*/("""{"""),format.raw/*105.31*/("""
    border-bottom: 1px solid #CCCCCC;
    margin: 0 20px 5px;
    padding: 3px 0;
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""
.example-arabic .tt-dropdown-menu """),format.raw/*110.35*/("""{"""),format.raw/*110.36*/("""
    text-align: right;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""
</style>

<script>
$(window).load(function()"""),format.raw/*116.26*/("""{"""),format.raw/*116.27*/("""
// Instantiate the Bloodhound suggestion engine
var movies = new Bloodhound("""),format.raw/*118.29*/("""{"""),format.raw/*118.30*/("""
    datumTokenizer: function (datum) """),format.raw/*119.38*/("""{"""),format.raw/*119.39*/("""
        return Bloodhound.tokenizers.whitespace(datum.value);
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""",
    queryTokenizer: Bloodhound.tokenizers.whitespace,
    remote: """),format.raw/*123.13*/("""{"""),format.raw/*123.14*/("""
        url: 'http://api.themoviedb.org/3/search/movie?query=%QUERY&api_key=470fd2ec8853e25d2f8d86f685d2270e',
        filter: function (movies) """),format.raw/*125.35*/("""{"""),format.raw/*125.36*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(movies.results, function (movie) """),format.raw/*127.59*/("""{"""),format.raw/*127.60*/("""
                return """),format.raw/*128.24*/("""{"""),format.raw/*128.25*/("""
                    value: movie.original_title
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/(""";
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/(""");
        """),format.raw/*132.9*/("""}"""),format.raw/*132.10*/("""
    """),format.raw/*133.5*/("""}"""),format.raw/*133.6*/("""
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/(""");

// Initialize the Bloodhound suggestion engine
movies.initialize();

// Instantiate the Typeahead UI
$('#blood .typeahead').typeahead(null, """),format.raw/*140.40*/("""{"""),format.raw/*140.41*/("""
    displayKey: 'value',
    source: movies.ttAdapter()
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/(""");
"""),format.raw/*144.1*/("""}"""),format.raw/*144.2*/(""");
</script>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Restaurant Review System</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Profile</a></li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group" id="blood">
                    <input type="text" class="typeahead" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Search</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Settings <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Profile</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="/createNewFranchise">Create new Franchise</a></li>
                        <li><a href="/fr/list">All Franchises</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Log Out</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 23 09:57:57 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/navbar.scala.html
                    HASH: 4c22227b1ed1b6984515714b50a5018adbc7da24
                    MATRIX: 782->1|891->16|949->48|976->49|1027->74|1054->75|1093->87|1121->88|1215->155|1243->156|1297->182|1326->183|1376->206|1404->207|1437->213|1465->214|1620->342|1648->343|1699->366|1728->367|1783->395|1811->396|1841->399|1869->400|1919->423|1947->424|1982->432|2010->433|2081->477|2109->478|2147->488|2176->489|2225->511|2253->512|2296->527|2325->528|2394->570|2422->571|2456->578|2484->579|2556->624|2584->625|2645->658|2674->659|2893->851|2921->852|2961->864|2990->865|3049->897|3077->898|3123->916|3152->917|3211->949|3239->950|3278->961|3307->962|3389->1017|3417->1018|3455->1028|3484->1029|3532->1050|3560->1051|3607->1070|3636->1071|3880->1288|3908->1289|3952->1305|3981->1306|4076->1374|4104->1375|4158->1401|4187->1402|4266->1454|4294->1455|4340->1473|4369->1474|4412->1490|4440->1491|4474->1498|4502->1499|4551->1521|4579->1522|4644->1559|4673->1560|4724->1584|4752->1585|4834->1639|4863->1640|4926->1676|4954->1677|5019->1714|5048->1715|5118->1758|5146->1759|5207->1792|5236->1793|5288->1817|5317->1818|5386->1858|5416->1859|5466->1881|5495->1882|5554->1912|5584->1913|5695->1996|5724->1997|5788->2032|5818->2033|5870->2057|5899->2058|5973->2103|6003->2104|6109->2181|6139->2182|6206->2220|6236->2221|6331->2288|6360->2289|6457->2357|6487->2358|6662->2504|6692->2505|6850->2634|6880->2635|6933->2659|6963->2660|7057->2725|7087->2726|7130->2740|7160->2741|7199->2752|7229->2753|7262->2758|7291->2759|7320->2760|7349->2761|7522->2905|7552->2906|7637->2963|7666->2964|7697->2967|7726->2968
                    LINES: 26->1|29->1|33->5|33->5|35->7|35->7|36->8|36->8|40->12|40->12|41->13|41->13|43->15|43->15|44->16|44->16|49->21|49->21|50->22|50->22|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|59->31|59->31|60->32|60->32|62->34|62->34|63->35|63->35|66->38|66->38|67->39|67->39|70->42|70->42|71->43|71->43|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|86->58|86->58|87->59|87->59|89->61|89->61|90->62|90->62|92->64|92->64|93->65|93->65|101->73|101->73|102->74|102->74|106->78|106->78|107->79|107->79|110->82|110->82|111->83|111->83|113->85|113->85|114->86|114->86|116->88|116->88|117->89|117->89|119->91|119->91|120->92|120->92|122->94|122->94|123->95|123->95|126->98|126->98|127->99|127->99|129->101|129->101|130->102|130->102|132->104|132->104|133->105|133->105|137->109|137->109|138->110|138->110|140->112|140->112|144->116|144->116|146->118|146->118|147->119|147->119|149->121|149->121|151->123|151->123|153->125|153->125|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|162->134|162->134|168->140|168->140|171->143|171->143|172->144|172->144
                    -- GENERATED --
                */
            