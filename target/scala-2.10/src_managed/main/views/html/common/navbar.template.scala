
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

/* custom styles for the typeahead */

.tt-dropdown-menu """),format.raw/*7.19*/("""{"""),format.raw/*7.20*/("""
  text-align: left;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

.typeahead,
.tt-query,
.tt-hint """),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""
  height: 34px;
  padding: 8px 12px;
  font-size: 20px;
  line-height: 26px;
  border: 1px solid #ccc;
  -webkit-border-radius: 4px;
     -moz-border-radius: 4px;
          border-radius: 4px;
  outline: none;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""

.typeahead """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/("""
  background-color: #fff;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

.typeahead:focus """),format.raw/*29.18*/("""{"""),format.raw/*29.19*/("""
  border: 2px solid #0097cf;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

.tt-query """),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
     -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

.tt-hint """),format.raw/*39.10*/("""{"""),format.raw/*39.11*/("""
  color: #999
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""

.tt-dropdown-menu """),format.raw/*43.19*/("""{"""),format.raw/*43.20*/("""
  width: 422px;
  margin-top: 12px;
  padding: 8px 0;
  background-color: #fff;
  border: 1px solid #ccc;
  border: 1px solid rgba(0, 0, 0, 0.2);
  -webkit-border-radius: 4px;
     -moz-border-radius: 4px;
          border-radius: 4px;
  -webkit-box-shadow: 0 5px 10px rgba(0,0,0,.2);
     -moz-box-shadow: 0 5px 10px rgba(0,0,0,.2);
          box-shadow: 0 5px 10px rgba(0,0,0,.2);
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

.tt-suggestion """),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
  padding: 8px 12px;
  font-size: 20px;
  line-height: 26px;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

.tt-suggestion.tt-is-under-cursor """),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
  color: #fff;
  background-color: #0097cf;

"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""

.tt-suggestion p """),format.raw/*70.18*/("""{"""),format.raw/*70.19*/("""
  margin: 0;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
</style> 

<script>
$(window).load(function()"""),format.raw/*76.26*/("""{"""),format.raw/*76.27*/("""
// Instantiate the Bloodhound suggestion engine
var movies = new Bloodhound("""),format.raw/*78.29*/("""{"""),format.raw/*78.30*/("""
    datumTokenizer: Bloodhound.tokenizers.obj.whitespace('value'),
  	queryTokenizer: Bloodhound.tokenizers.whitespace,
    
    limit:10,
    prefetch: """),format.raw/*83.15*/("""{"""),format.raw/*83.16*/("""
        url: 'http://localhost:9000/srs/preload',
        
        filter: function (list) """),format.raw/*86.33*/("""{"""),format.raw/*86.34*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(list, function (movie) """),format.raw/*88.49*/("""{"""),format.raw/*88.50*/("""
                return """),format.raw/*89.24*/("""{"""),format.raw/*89.25*/(""" value : movie """),format.raw/*89.40*/("""}"""),format.raw/*89.41*/(""";
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/(""");
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/(""",
    
    remote: """),format.raw/*94.13*/("""{"""),format.raw/*94.14*/("""
    
    	url: 'http://localhost:9000/search/%QUERY',
        filter: function (list) """),format.raw/*97.33*/("""{"""),format.raw/*97.34*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(list, function (movie) """),format.raw/*99.49*/("""{"""),format.raw/*99.50*/("""
                return """),format.raw/*100.24*/("""{"""),format.raw/*100.25*/(""" value : movie """),format.raw/*100.40*/("""}"""),format.raw/*100.41*/(""";
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/(""");
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/(""");

// Initialize the Bloodhound suggestion engine
movies.initialize();

// Instantiate the Typeahead UI
$('#blood .typeahead').typeahead(null, """),format.raw/*110.40*/("""{"""),format.raw/*110.41*/("""
	name: 'movies',
    displayKey: 'value',
    source: movies.ttAdapter()
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/(""");
"""),format.raw/*115.1*/("""}"""),format.raw/*115.2*/(""");
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
            <a class="navbar-brand" href="/profile">Restaurant Review System</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/profile">Profile</a></li>
            </ul>
            <script>
            function getDone()
            """),format.raw/*138.13*/("""{"""),format.raw/*138.14*/("""
            	var val=$('#field').val();
            	$('#ina').val(val);
            """),format.raw/*141.13*/("""}"""),format.raw/*141.14*/("""
            </script>
            <form class="navbar-form navbar-left" role="search" action="/answer" method="post">
                <div class="form-group" id="blood">
                     <input type="text" class="typeahead" id="field" placeholder="Search">
                    <input type="hidden" class="form-control" name="check" id="ina">
                </div>
                <button type="submit" class="btn btn-default" onClick="getDone()">Search</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Settings <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/profile">Profile</a></li>
                        <li><a href="#">Your Franchises</a></li>
                        <li><a href="/createNewFranchise">Create new Franchise</a></li>
                        <li><a href="/fr/list">All Franchises</a></li>
                        <li class="divider"></li>
                        <li><a href="/logout">Log Out</a></li>
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
                    DATE: Sat Oct 25 13:10:36 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/navbar.scala.html
                    HASH: 376faf92c0813f6e3aebb8e36dbc524c97446089
                    MATRIX: 782->1|891->16|1002->100|1030->101|1077->122|1104->123|1166->157|1195->158|1433->369|1461->370|1502->383|1531->384|1585->411|1613->412|1660->431|1689->432|1746->462|1774->463|1814->475|1843->476|2051->657|2079->658|2118->669|2147->670|2189->685|2217->686|2265->706|2294->707|2705->1091|2733->1092|2778->1109|2807->1110|2896->1172|2924->1173|2988->1209|3017->1210|3090->1256|3118->1257|3165->1276|3194->1277|3235->1291|3263->1292|3337->1338|3366->1339|3471->1416|3500->1417|3682->1571|3711->1572|3831->1664|3860->1665|4007->1784|4036->1785|4088->1809|4117->1810|4160->1825|4189->1826|4231->1840|4260->1841|4298->1852|4327->1853|4359->1858|4387->1859|4434->1878|4463->1879|4578->1966|4607->1967|4754->2086|4783->2087|4836->2111|4866->2112|4910->2127|4940->2128|4983->2142|5013->2143|5052->2154|5082->2155|5115->2160|5144->2161|5173->2162|5202->2163|5375->2307|5405->2308|5507->2382|5536->2383|5567->2386|5596->2387|6634->3396|6664->3397|6779->3483|6809->3484
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|41->13|41->13|51->23|51->23|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|65->37|65->37|67->39|67->39|69->41|69->41|71->43|71->43|84->56|84->56|86->58|86->58|90->62|90->62|92->64|92->64|96->68|96->68|98->70|98->70|100->72|100->72|104->76|104->76|106->78|106->78|111->83|111->83|114->86|114->86|116->88|116->88|117->89|117->89|117->89|117->89|118->90|118->90|119->91|119->91|120->92|120->92|122->94|122->94|125->97|125->97|127->99|127->99|128->100|128->100|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|138->110|138->110|142->114|142->114|143->115|143->115|166->138|166->138|169->141|169->141
                    -- GENERATED --
                */
            