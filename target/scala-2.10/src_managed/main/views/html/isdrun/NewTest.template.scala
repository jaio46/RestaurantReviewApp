
package views.html.isdrun

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
object NewTest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html><html><head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>How to tie Typeahead.js suggestions to a cross domain data source? - jsFiddle demo</title>
  
  <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>
  
  
    
      <script type="text/javascript" src="http://twitter.github.io/typeahead.js/releases/latest/typeahead.bundle.js"></script>
    
  
  <style type="text/css">
    html """),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""
    overflow-y: scroll;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""
.container """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
    margin: 0 auto;
    max-width: 750px;
    text-align: center;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
.tt-dropdown-menu, .gist """),format.raw/*21.26*/("""{"""),format.raw/*21.27*/("""
    text-align: left;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
html """),format.raw/*24.6*/("""{"""),format.raw/*24.7*/("""
    color: #333333;
    font-family:"Helvetica Neue", Helvetica, Arial, sans-serif;
    font-size: 18px;
    line-height: 1.2;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
.title, .example-name """),format.raw/*30.23*/("""{"""),format.raw/*30.24*/("""
    font-family: Prociono;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
p """),format.raw/*33.3*/("""{"""),format.raw/*33.4*/("""
    margin: 0 0 10px;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
.title """),format.raw/*36.8*/("""{"""),format.raw/*36.9*/("""
    font-size: 64px;
    margin: 20px 0 0;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
.example """),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""
    padding: 30px 0;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""
.example-name """),format.raw/*43.15*/("""{"""),format.raw/*43.16*/("""
    font-size: 32px;
    margin: 20px 0;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""
.demo """),format.raw/*47.7*/("""{"""),format.raw/*47.8*/("""
    margin: 50px 0;
    position: relative;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""
.typeahead, .tt-query, .tt-hint """),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""
    border: 2px solid #CCCCCC;
    border-radius: 8px 8px 8px 8px;
    font-size: 24px;
    height: 30px;
    line-height: 30px;
    outline: medium none;
    padding: 8px 12px;
    width: 396px;
"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""
.typeahead """),format.raw/*61.12*/("""{"""),format.raw/*61.13*/("""
    background-color: #FFFFFF;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""
.typeahead:focus """),format.raw/*64.18*/("""{"""),format.raw/*64.19*/("""
    border: 2px solid #0097CF;
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/("""
.tt-query """),format.raw/*67.11*/("""{"""),format.raw/*67.12*/("""
    box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""
.tt-hint """),format.raw/*70.10*/("""{"""),format.raw/*70.11*/("""
    color: #999999;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
.tt-dropdown-menu """),format.raw/*73.19*/("""{"""),format.raw/*73.20*/("""
    background-color: #FFFFFF;
    border: 1px solid rgba(0, 0, 0, 0.2);
    border-radius: 8px 8px 8px 8px;
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
    margin-top: 12px;
    padding: 8px 0;
    width: 422px;
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""
.tt-suggestion """),format.raw/*82.16*/("""{"""),format.raw/*82.17*/("""
    font-size: 18px;
    line-height: 24px;
    padding: 3px 20px;
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""
.tt-suggestion.tt-cursor """),format.raw/*87.26*/("""{"""),format.raw/*87.27*/("""
    background-color: #0097CF;
    color: #FFFFFF;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
.tt-suggestion p """),format.raw/*91.18*/("""{"""),format.raw/*91.19*/("""
    margin: 0;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""
.gist """),format.raw/*94.7*/("""{"""),format.raw/*94.8*/("""
    font-size: 14px;
"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
.example-twitter-oss .tt-suggestion """),format.raw/*97.37*/("""{"""),format.raw/*97.38*/("""
    padding: 8px 20px;
"""),format.raw/*99.1*/("""}"""),format.raw/*99.2*/("""
.example-twitter-oss .tt-suggestion + .tt-suggestion """),format.raw/*100.54*/("""{"""),format.raw/*100.55*/("""
    border-top: 1px solid #CCCCCC;
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""
.example-twitter-oss .repo-language """),format.raw/*103.37*/("""{"""),format.raw/*103.38*/("""
    float: right;
    font-style: italic;
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""
.example-twitter-oss .repo-name """),format.raw/*107.33*/("""{"""),format.raw/*107.34*/("""
    font-weight: bold;
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""
.example-twitter-oss .repo-description """),format.raw/*110.40*/("""{"""),format.raw/*110.41*/("""
    font-size: 14px;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""
.example-sports .league-name """),format.raw/*113.30*/("""{"""),format.raw/*113.31*/("""
    border-bottom: 1px solid #CCCCCC;
    margin: 0 20px 5px;
    padding: 3px 0;
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/("""
.example-arabic .tt-dropdown-menu """),format.raw/*118.35*/("""{"""),format.raw/*118.36*/("""
    text-align: right;
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/("""
  </style>
  


<script type="text/javascript">
//<![CDATA[ 
$(window).load(function()"""),format.raw/*127.26*/("""{"""),format.raw/*127.27*/("""
// Instantiate the Bloodhound suggestion engine
var movies = new Bloodhound("""),format.raw/*129.29*/("""{"""),format.raw/*129.30*/("""
    datumTokenizer: function (datum) """),format.raw/*130.38*/("""{"""),format.raw/*130.39*/("""
        return Bloodhound.tokenizers.whitespace(datum.value);
    """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/(""",
    queryTokenizer: Bloodhound.tokenizers.whitespace,
    remote: """),format.raw/*134.13*/("""{"""),format.raw/*134.14*/("""
        url: 'http://api.themoviedb.org/3/search/movie?query=%QUERY&api_key=470fd2ec8853e25d2f8d86f685d2270e',
        filter: function (movies) """),format.raw/*136.35*/("""{"""),format.raw/*136.36*/("""
            // Map the remote source JSON array to a JavaScript array
            return $.map(movies.results, function (movie) """),format.raw/*138.59*/("""{"""),format.raw/*138.60*/("""
                return """),format.raw/*139.24*/("""{"""),format.raw/*139.25*/("""
                    value: movie.original_title
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/(""";
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/(""");
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""
    """),format.raw/*144.5*/("""}"""),format.raw/*144.6*/("""
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/(""");

// Initialize the Bloodhound suggestion engine
movies.initialize();

// Instantiate the Typeahead UI
$('.typeahead').typeahead(null, """),format.raw/*151.33*/("""{"""),format.raw/*151.34*/("""
    displayKey: 'value',
    source: movies.ttAdapter()
"""),format.raw/*154.1*/("""}"""),format.raw/*154.2*/(""");
"""),format.raw/*155.1*/("""}"""),format.raw/*155.2*/(""");//]]>  

</script>


</head>
<body>
<div id="remote">
  <input class="typeahead" type="text" placeholder="Oscar winners for Best Picture">
</div>
</body></html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Oct 23 09:47:42 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/isdrun/NewTest.scala.html
                    HASH: 4e455bd0c93ff4fcb14f6499ed657d9e2c81f4de
                    MATRIX: 864->0|1357->465|1386->466|1438->491|1466->492|1506->504|1535->505|1629->572|1657->573|1711->599|1740->600|1790->623|1818->624|1851->630|1879->631|2034->759|2062->760|2113->783|2142->784|2197->812|2225->813|2255->816|2283->817|2333->840|2361->841|2396->849|2424->850|2495->894|2523->895|2561->905|2590->906|2639->928|2667->929|2710->944|2739->945|2808->987|2836->988|2870->995|2898->996|2970->1041|2998->1042|3059->1075|3088->1076|3312->1273|3340->1274|3380->1286|3409->1287|3468->1319|3496->1320|3542->1338|3571->1339|3630->1371|3658->1372|3697->1383|3726->1384|3808->1439|3836->1440|3874->1450|3903->1451|3951->1472|3979->1473|4026->1492|4055->1493|4299->1710|4327->1711|4371->1727|4400->1728|4495->1796|4523->1797|4577->1823|4606->1824|4685->1876|4713->1877|4759->1895|4788->1896|4831->1912|4859->1913|4893->1920|4921->1921|4970->1943|4998->1944|5063->1981|5092->1982|5143->2006|5171->2007|5254->2061|5284->2062|5348->2098|5377->2099|5443->2136|5473->2137|5544->2180|5573->2181|5635->2214|5665->2215|5717->2239|5746->2240|5815->2280|5845->2281|5895->2303|5924->2304|5983->2334|6013->2335|6124->2418|6153->2419|6217->2454|6247->2455|6299->2479|6328->2480|6444->2567|6474->2568|6580->2645|6610->2646|6677->2684|6707->2685|6802->2752|6831->2753|6928->2821|6958->2822|7133->2968|7163->2969|7321->3098|7351->3099|7404->3123|7434->3124|7528->3189|7558->3190|7601->3204|7631->3205|7670->3216|7700->3217|7733->3222|7762->3223|7791->3224|7820->3225|7986->3362|8016->3363|8101->3420|8130->3421|8161->3424|8190->3425
                    LINES: 29->1|41->13|41->13|43->15|43->15|44->16|44->16|48->20|48->20|49->21|49->21|51->23|51->23|52->24|52->24|57->29|57->29|58->30|58->30|60->32|60->32|61->33|61->33|63->35|63->35|64->36|64->36|67->39|67->39|68->40|68->40|70->42|70->42|71->43|71->43|74->46|74->46|75->47|75->47|78->50|78->50|79->51|79->51|88->60|88->60|89->61|89->61|91->63|91->63|92->64|92->64|94->66|94->66|95->67|95->67|97->69|97->69|98->70|98->70|100->72|100->72|101->73|101->73|109->81|109->81|110->82|110->82|114->86|114->86|115->87|115->87|118->90|118->90|119->91|119->91|121->93|121->93|122->94|122->94|124->96|124->96|125->97|125->97|127->99|127->99|128->100|128->100|130->102|130->102|131->103|131->103|134->106|134->106|135->107|135->107|137->109|137->109|138->110|138->110|140->112|140->112|141->113|141->113|145->117|145->117|146->118|146->118|148->120|148->120|155->127|155->127|157->129|157->129|158->130|158->130|160->132|160->132|162->134|162->134|164->136|164->136|166->138|166->138|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143|172->144|172->144|173->145|173->145|179->151|179->151|182->154|182->154|183->155|183->155
                    -- GENERATED --
                */
            