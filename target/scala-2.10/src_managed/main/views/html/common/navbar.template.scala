
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
  width: 396px;
  height: 34px;
  padding: 8px 12px;
  font-size: 20px;
  line-height: 26px;
  border: 1px solid #ccc;
  -webkit-border-radius: 4px;
     -moz-border-radius: 4px;
          border-radius: 4px;
  outline: none;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

.typeahead """),format.raw/*26.12*/("""{"""),format.raw/*26.13*/("""
  background-color: #fff;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

.typeahead:focus """),format.raw/*30.18*/("""{"""),format.raw/*30.19*/("""
  border: 2px solid #0097cf;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

.tt-query """),format.raw/*34.11*/("""{"""),format.raw/*34.12*/("""
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
     -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

.tt-hint """),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""
  color: #999
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

.tt-dropdown-menu """),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""
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
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

.tt-suggestion """),format.raw/*59.16*/("""{"""),format.raw/*59.17*/("""
  padding: 8px 12px;
  font-size: 20px;
  line-height: 26px;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

.tt-suggestion.tt-is-under-cursor """),format.raw/*65.35*/("""{"""),format.raw/*65.36*/("""
  color: #fff;
  background-color: #0097cf;

"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

.tt-suggestion p """),format.raw/*71.18*/("""{"""),format.raw/*71.19*/("""
  margin: 0;
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
</style> 

<script>
$(window).load(function()"""),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""
// Instantiate the Bloodhound suggestion engine
var movies = new Bloodhound("""),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
    datumTokenizer: Bloodhound.tokenizers.obj.whitespace('value'),
  	queryTokenizer: Bloodhound.tokenizers.whitespace,
    
    limit:10,
    prefetch: """),format.raw/*84.15*/("""{"""),format.raw/*84.16*/("""
        url: 'http://localhost:9000/srs/preload',
        
        filter: function (list) """),format.raw/*87.33*/("""{"""),format.raw/*87.34*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(list, function (movie) """),format.raw/*89.49*/("""{"""),format.raw/*89.50*/("""
                return """),format.raw/*90.24*/("""{"""),format.raw/*90.25*/(""" value : movie """),format.raw/*90.40*/("""}"""),format.raw/*90.41*/(""";
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""");
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""",
    
    remote: """),format.raw/*95.13*/("""{"""),format.raw/*95.14*/("""
    
    	url: 'http://localhost:9000/search/%QUERY',
        filter: function (list) """),format.raw/*98.33*/("""{"""),format.raw/*98.34*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(list, function (movie) """),format.raw/*100.49*/("""{"""),format.raw/*100.50*/("""
                return """),format.raw/*101.24*/("""{"""),format.raw/*101.25*/(""" value : movie """),format.raw/*101.40*/("""}"""),format.raw/*101.41*/(""";
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/(""");
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/(""");

// Initialize the Bloodhound suggestion engine
movies.initialize();

// Instantiate the Typeahead UI
$('#blood .typeahead').typeahead(null, """),format.raw/*111.40*/("""{"""),format.raw/*111.41*/("""
	name: 'movies',
    displayKey: 'value',
    source: movies.ttAdapter()
"""),format.raw/*115.1*/("""}"""),format.raw/*115.2*/(""");
"""),format.raw/*116.1*/("""}"""),format.raw/*116.2*/(""");
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
                    DATE: Sat Oct 25 08:08:11 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/navbar.scala.html
                    HASH: d123c1a9c6dfd91362d13af1147bd7d0ddf05259
                    MATRIX: 782->1|891->16|1002->100|1030->101|1077->122|1104->123|1166->157|1195->158|1449->385|1477->386|1518->399|1547->400|1601->427|1629->428|1676->447|1705->448|1762->478|1790->479|1830->491|1859->492|2067->673|2095->674|2134->685|2163->686|2205->701|2233->702|2281->722|2310->723|2721->1107|2749->1108|2794->1125|2823->1126|2912->1188|2940->1189|3004->1225|3033->1226|3106->1272|3134->1273|3181->1292|3210->1293|3251->1307|3279->1308|3353->1354|3382->1355|3487->1432|3516->1433|3698->1587|3727->1588|3847->1680|3876->1681|4023->1800|4052->1801|4104->1825|4133->1826|4176->1841|4205->1842|4247->1856|4276->1857|4314->1868|4343->1869|4375->1874|4403->1875|4450->1894|4479->1895|4594->1982|4623->1983|4771->2102|4801->2103|4854->2127|4884->2128|4928->2143|4958->2144|5001->2158|5031->2159|5070->2170|5100->2171|5133->2176|5162->2177|5191->2178|5220->2179|5393->2323|5423->2324|5525->2398|5554->2399|5585->2402|5614->2403
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|41->13|41->13|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|62->34|62->34|66->38|66->38|68->40|68->40|70->42|70->42|72->44|72->44|85->57|85->57|87->59|87->59|91->63|91->63|93->65|93->65|97->69|97->69|99->71|99->71|101->73|101->73|105->77|105->77|107->79|107->79|112->84|112->84|115->87|115->87|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|126->98|126->98|128->100|128->100|129->101|129->101|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|133->105|133->105|139->111|139->111|143->115|143->115|144->116|144->116
                    -- GENERATED --
                */
            