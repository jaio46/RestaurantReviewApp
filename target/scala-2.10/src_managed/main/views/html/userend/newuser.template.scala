
package views.html.userend

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
object newuser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User.User,play.data.Form[models.User.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: models.User.User, userForm: play.data.Form[models.User.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.70*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head("Hello new friend"))),format.raw/*6.37*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("New Signup"))),format.raw/*9.29*/("""
<script src=""""),_display_(Seq[Any](/*10.15*/routes/*10.21*/.Assets.at("javascripts/facebook.js"))),format.raw/*10.58*/(""""></script>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-info">
				Welcome new friend!
			</h3>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-8 column">
			"""),_display_(Seq[Any](/*21.5*/helper/*21.11*/.form(action = controllers.UserControl.routes.RegistrationAndLogin.saveUser())/*21.89*/{_display_(Seq[Any](format.raw/*21.90*/("""
				"""),_display_(Seq[Any](/*22.6*/helper/*22.12*/.input(userForm("Name"),
						 '_showConstraints -> false)/*23.35*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.64*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*24.55*/name)),format.raw/*24.59*/("""" id=""""),_display_(Seq[Any](/*24.66*/id)),format.raw/*24.68*/(""""
							value='"""),_display_(Seq[Any](/*25.16*/user/*25.20*/.name)),format.raw/*25.25*/("""'>
					""")))})),format.raw/*26.7*/("""
				
				"""),_display_(Seq[Any](/*28.6*/helper/*28.12*/.input(userForm("Email"),
							'_showConstraints -> false)/*29.35*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*29.61*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*30.55*/name)),format.raw/*30.59*/("""" id=""""),_display_(Seq[Any](/*30.66*/id)),format.raw/*30.68*/(""""
							value="""),_display_(Seq[Any](/*31.15*/user/*31.19*/.email)),format.raw/*31.25*/(""">
					""")))})),format.raw/*32.7*/("""
				"""),_display_(Seq[Any](/*33.6*/helper/*33.12*/.input(userForm("Username"),
							'_showConstraints -> false)/*34.35*/{(id, name, value, args)=>_display_(Seq[Any](format.raw/*34.61*/("""
							<input type="text" class="form-control" name=""""),_display_(Seq[Any](/*35.55*/name)),format.raw/*35.59*/("""" id=""""),_display_(Seq[Any](/*35.66*/id)),format.raw/*35.68*/(""""
							placeholder= 'choose a username for you'>
					""")))})),format.raw/*37.7*/("""
				
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Confirm</button>
				</div>
			""")))})),format.raw/*42.5*/("""
			
			
		</div>
		<div class="col-md-4 column" id="picLevel">
			<h4 class="text-info">
				Profile Picture
			</h4>
			<script>
			FB.api('/"""),_display_(Seq[Any](/*51.14*/user/*51.18*/.id)),format.raw/*51.21*/("""/picture?type=large', function(response) """),format.raw/*51.62*/("""{"""),format.raw/*51.63*/("""
	        var str="<img src='"+response.data.url+"'/>";
	        document.getElementById("picLevel").innerHTML+=str;
	        """),format.raw/*54.10*/("""}"""),format.raw/*54.11*/(""");
			</script>
			
		</div>
	</div>
</div>
"""),_display_(Seq[Any](/*60.2*/common/*60.8*/.footer())),format.raw/*60.17*/("""

</body>

</html>"""))}
    }
    
    def render(user:models.User.User,userForm:play.data.Form[models.User.User]): play.api.templates.HtmlFormat.Appendable = apply(user,userForm)
    
    def f:((models.User.User,play.data.Form[models.User.User]) => play.api.templates.HtmlFormat.Appendable) = (user,userForm) => apply(user,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 03:26:37 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/userend/newuser.scala.html
                    HASH: e7d2ae4253347c17662c50473a34ee376cfebb5e
                    MATRIX: 827->1|989->69|1060->106|1074->112|1120->137|1171->154|1184->160|1226->181|1277->196|1292->202|1351->239|1623->476|1638->482|1725->560|1764->561|1805->567|1820->573|1888->632|1955->661|2046->716|2072->720|2115->727|2139->729|2192->746|2205->750|2232->755|2272->764|2318->775|2333->781|2402->841|2466->867|2557->922|2583->926|2626->933|2650->935|2702->951|2715->955|2743->961|2782->969|2823->975|2838->981|2910->1044|2974->1070|3065->1125|3091->1129|3134->1136|3158->1138|3246->1195|3397->1315|3577->1459|3590->1463|3615->1466|3684->1507|3713->1508|3867->1634|3896->1635|3976->1680|3990->1686|4021->1695
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|38->10|38->10|38->10|49->21|49->21|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|54->26|56->28|56->28|57->29|57->29|58->30|58->30|58->30|58->30|59->31|59->31|59->31|60->32|61->33|61->33|62->34|62->34|63->35|63->35|63->35|63->35|65->37|70->42|79->51|79->51|79->51|79->51|79->51|82->54|82->54|88->60|88->60|88->60
                    -- GENERATED --
                */
            