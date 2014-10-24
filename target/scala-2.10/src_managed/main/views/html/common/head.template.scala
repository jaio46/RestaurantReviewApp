
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
object head extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<title>"""),_display_(Seq[Any](/*3.9*/title)),format.raw/*3.14*/("""</title>

<!-- <link rel='stylesheet' href='"""),_display_(Seq[Any](/*5.36*/routes/*5.42*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.81*/("""'>  -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<link href='"""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.Assets.at("stylesheets/select2.css"))),format.raw/*7.57*/("""' rel="stylesheet" type="text/css">

<link rel='stylesheet' href='"""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("stylesheets/index.css"))),format.raw/*9.72*/("""'>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*10.38*/routes/*10.44*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*10.83*/("""'></script>

<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("javascripts/typeahead.bundle.js"))),format.raw/*13.66*/(""""></script>
<!-- <link rel='text/javascript' href='"""),_display_(Seq[Any](/*14.41*/routes/*14.47*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*14.85*/("""'> -->

<style type="text/css">
.glyphicon """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
  font-family: 'Glyphicons Halflings';
  src: url("""),_display_(Seq[Any](/*19.13*/routes/*19.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot"))),format.raw/*19.71*/(""");
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
</style>

<script type="text/javascript">//<![CDATA[ 
$(window).load(function()"""),format.raw/*24.26*/("""{"""),format.raw/*24.27*/("""
(function ($) """),format.raw/*25.15*/("""{"""),format.raw/*25.16*/("""

  $.fn.rating = function () """),format.raw/*27.29*/("""{"""),format.raw/*27.30*/("""

    var element;
    var originalId;

    // A private function to highlight a star corresponding to a given value
    function _paintValue(ratingInput, value) """),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""
      var selectedStar = $(ratingInput).find('[data-value=' + value + ']');
      selectedStar.removeClass('glyphicon-star-empty').addClass('glyphicon-star');
      selectedStar.prevAll('[data-value]').removeClass('glyphicon-star-empty').addClass('glyphicon-star');
      selectedStar.nextAll('[data-value]').removeClass('glyphicon-star').addClass('glyphicon-star-empty');
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""

    // A private function to remove the selected rating
    function _clearValue(ratingInput) """),format.raw/*41.39*/("""{"""),format.raw/*41.40*/("""
      var self = $(ratingInput);
      self.find('[data-value]').removeClass('glyphicon-star').addClass('glyphicon-star-empty');
      self.find('.rating-clear').hide();
      self.find('input').val('').trigger('change');
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""

    // Iterate and transform all selected inputs
    for (element = this.length - 1; element >= 0; element--) """),format.raw/*49.62*/("""{"""),format.raw/*49.63*/("""

      var el, i, ratingInputs,
        originalInput = $(this[element]),
        max = originalInput.data('max') || 5,
        min = originalInput.data('min') || 0,
        clearable = originalInput.data('clearable') || null,
        stars = '';

      // HTML element construction
      for (i = min; i <= max; i++) """),format.raw/*59.36*/("""{"""),format.raw/*59.37*/("""
        // Create <max> empty stars
        stars += ['<span class="glyphicon glyphicon-star-empty" data-value="', i, '"></span>'].join('');
      """),format.raw/*62.7*/("""}"""),format.raw/*62.8*/("""
      // Add a clear link if clearable option is set
      if (clearable) """),format.raw/*64.22*/("""{"""),format.raw/*64.23*/("""
        stars += [
          ' <a class="rating-clear" style="display:none;" href="javascript:void">',
          '<span class="glyphicon glyphicon-remove"></span> ',
          clearable,
          '</a>'].join('');
      """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/("""

      el = [
        // Rating widget is wrapped inside a div
        '<div class="rating-input">',
        stars,
        // Value will be hold in a hidden input with same name and id than original input so the form will still work
        '<input type="hidden" name="',
        originalInput.attr('name'),
        '" value="',
        originalInput.val(),
        '" id="',
        originalInput.attr('id'),
        '" />',
        '</div>'].join('');
      // Replace original inputs HTML with the new one
      originalInput.replaceWith(el);

    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""

    // Give live to the newly generated widgets
    $('.rating-input')
      // Highlight stars on hovering
      .on('mouseenter', '[data-value]', function () """),format.raw/*93.53*/("""{"""),format.raw/*93.54*/("""
        var self = $(this);
        _paintValue(self.closest('.rating-input'), self.data('value'));
      """),format.raw/*96.7*/("""}"""),format.raw/*96.8*/(""")
      // View current value while mouse is out
      .on('mouseleave', '[data-value]', function () """),format.raw/*98.53*/("""{"""),format.raw/*98.54*/("""
        var self = $(this);
        var val = self.siblings('input').val();
        if (val) """),format.raw/*101.18*/("""{"""),format.raw/*101.19*/("""
          _paintValue(self.closest('.rating-input'), val);
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/(""" else """),format.raw/*103.16*/("""{"""),format.raw/*103.17*/("""
          _clearValue(self.closest('.rating-input'));
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""
      """),format.raw/*106.7*/("""}"""),format.raw/*106.8*/(""")
      // Set the selected value to the hidden field
      .on('click', '[data-value]', function (e) """),format.raw/*108.49*/("""{"""),format.raw/*108.50*/("""
        var self = $(this);
        var val = self.data('value');
        var address="/submitRating/"+self.siblings('input').attr('id')+"/"+val;
        alert(address);
        self.siblings('input').val(val).trigger('change');
        self.siblings('.rating-clear').show();
        e.preventDefault();
        false
      """),format.raw/*117.7*/("""}"""),format.raw/*117.8*/(""")
      // Remove value on clear
      .on('click', '.rating-clear', function (e) """),format.raw/*119.50*/("""{"""),format.raw/*119.51*/("""
        _clearValue($(this).closest('.rating-input'));
        e.preventDefault();
        false
      """),format.raw/*123.7*/("""}"""),format.raw/*123.8*/(""")
      // Initialize view with default value
      .each(function () """),format.raw/*125.25*/("""{"""),format.raw/*125.26*/("""
        var val = Math.round($(this).find('input').val());
        if (val) """),format.raw/*127.18*/("""{"""),format.raw/*127.19*/("""
          _paintValue(this, val);
          $(this).find('.rating-clear').show();
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
      """),format.raw/*131.7*/("""}"""),format.raw/*131.8*/(""");

  """),format.raw/*133.3*/("""}"""),format.raw/*133.4*/(""";

  // Auto apply conversion of number fields with class 'rating' into rating-fields
  $(function () """),format.raw/*136.17*/("""{"""),format.raw/*136.18*/("""
    if ($('input.rating[type=number]').length > 0) """),format.raw/*137.52*/("""{"""),format.raw/*137.53*/("""
      $('input.rating[type=number]').rating();
    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/("""
  """),format.raw/*140.3*/("""}"""),format.raw/*140.4*/(""");

"""),format.raw/*142.1*/("""}"""),format.raw/*142.2*/("""(jQuery));
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/(""");//]]>  

</script>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 24 23:09:23 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/common/head.scala.html
                    HASH: 8b8aa2647e93184e126969a1f54379af3f98cc91
                    MATRIX: 780->1|889->16|933->26|959->31|1039->76|1053->82|1113->121|1264->237|1278->243|1336->280|1438->347|1452->353|1508->388|1584->428|1599->434|1660->473|1809->586|1824->592|1891->637|1979->689|1994->695|2054->733|2125->776|2154->777|2242->829|2257->835|2331->887|2361->890|2389->891|2497->971|2526->972|2569->987|2598->988|2656->1018|2685->1019|2875->1181|2904->1182|3309->1560|3337->1561|3461->1657|3490->1658|3744->1885|3772->1886|3912->1998|3941->1999|4288->2318|4317->2319|4492->2467|4520->2468|4623->2543|4652->2544|4901->2766|4929->2767|5509->3320|5537->3321|5727->3483|5756->3484|5890->3591|5918->3592|6047->3693|6076->3694|6199->3788|6229->3789|6325->3857|6355->3858|6390->3864|6420->3865|6511->3928|6541->3929|6576->3936|6605->3937|6736->4039|6766->4040|7119->4365|7148->4366|7259->4448|7289->4449|7421->4553|7450->4554|7549->4624|7579->4625|7685->4702|7715->4703|7834->4794|7864->4795|7899->4802|7928->4803|7962->4809|7991->4810|8122->4912|8152->4913|8233->4965|8263->4966|8343->5018|8372->5019|8403->5022|8432->5023|8464->5027|8493->5028|8532->5039|8561->5040
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|47->19|47->19|47->19|48->20|48->20|52->24|52->24|53->25|53->25|55->27|55->27|61->33|61->33|66->38|66->38|69->41|69->41|74->46|74->46|77->49|77->49|87->59|87->59|90->62|90->62|92->64|92->64|98->70|98->70|116->88|116->88|121->93|121->93|124->96|124->96|126->98|126->98|129->101|129->101|131->103|131->103|131->103|131->103|133->105|133->105|134->106|134->106|136->108|136->108|145->117|145->117|147->119|147->119|151->123|151->123|153->125|153->125|155->127|155->127|158->130|158->130|159->131|159->131|161->133|161->133|164->136|164->136|165->137|165->137|167->139|167->139|168->140|168->140|170->142|170->142|171->143|171->143
                    -- GENERATED --
                */
            