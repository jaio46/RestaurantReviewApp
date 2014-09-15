
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <body>
        <div id="fb-root"></div>
        <script src="//connect.facebook.net/en_US/all.js"></script>

        <script>
        window.fbAsyncInit = function() """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""
        FB.init("""),format.raw/*8.17*/("""{"""),format.raw/*8.18*/("""
        appId      : '804870622878100', // Set YOUR APP ID
        status     : true, // check login status
        cookie     : true, // enable cookies to allow the server to access the session
        xfbml      : true  // parse XFBML
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""");

        FB.Event.subscribe('auth.authResponseChange', function(response)
        """),format.raw/*16.9*/("""{"""),format.raw/*16.10*/("""
        if (response.status === 'connected')
        """),format.raw/*18.9*/("""{"""),format.raw/*18.10*/("""
        document.getElementById("message").innerHTML +=  "<br>Connected to Facebook";
        //SUCCESS

        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
        else if (response.status === 'not_authorized')
        """),format.raw/*24.9*/("""{"""),format.raw/*24.10*/("""
        document.getElementById("message").innerHTML +=  "<br>Failed to Connect";

        //FAILED
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""" else
        """),format.raw/*29.9*/("""{"""),format.raw/*29.10*/("""
        document.getElementById("message").innerHTML +=  "<br>Logged Out";

        //UNKNOWN ERROR
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""");

        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""";

        function Login()
        """),format.raw/*39.9*/("""{"""),format.raw/*39.10*/("""

        FB.login(function(response) """),format.raw/*41.37*/("""{"""),format.raw/*41.38*/("""
        if (response.authResponse)
        """),format.raw/*43.9*/("""{"""),format.raw/*43.10*/("""
        getUserInfo();
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""" else
        """),format.raw/*46.9*/("""{"""),format.raw/*46.10*/("""
        console.log('User cancelled login or did not fully authorize.');
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/("""
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""","""),format.raw/*49.11*/("""{"""),format.raw/*49.12*/("""scope: 'email,user_photos,user_videos'"""),format.raw/*49.50*/("""}"""),format.raw/*49.51*/(""");

        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        function getUserInfo() """),format.raw/*53.32*/("""{"""),format.raw/*53.33*/("""
        FB.api('/me', function(response) """),format.raw/*54.42*/("""{"""),format.raw/*54.43*/("""

        var str="<b>Name</b> : "+response.name+"<br>";
        str +="<b>Link: </b>"+response.link+"<br>";
        str +="<b>Username:</b> "+response.username+"<br>";
        str +="<b>id: </b>"+response.id+"<br>";
        str +="<b>Email:</b> "+response.email+"<br>";
        str +="<input type='button' value='Get Photo' onclick='getPhoto();'/>";
        str +="<input type='button' value='Logout' onclick='Logout();'/>";
        document.getElementById("status").innerHTML=str;


        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""
        function getPhoto()
        """),format.raw/*69.9*/("""{"""),format.raw/*69.10*/("""
        FB.api('/me/picture?type=normal', function(response) """),format.raw/*70.62*/("""{"""),format.raw/*70.63*/("""

        var str="<br/><b>Pic</b> : <img src='"+response.data.url+"'/>";
        document.getElementById("status").innerHTML+=str;

        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""");

        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""
        function Logout()
        """),format.raw/*79.9*/("""{"""),format.raw/*79.10*/("""
        FB.logout(function()"""),format.raw/*80.29*/("""{"""),format.raw/*80.30*/("""document.location.reload();"""),format.raw/*80.57*/("""}"""),format.raw/*80.58*/(""");
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""

        // Load the SDK asynchronously
        (function(d)"""),format.raw/*84.21*/("""{"""),format.raw/*84.22*/("""
        var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
        if (d.getElementById(id)) """),format.raw/*86.35*/("""{"""),format.raw/*86.36*/("""return;"""),format.raw/*86.43*/("""}"""),format.raw/*86.44*/("""
        js = d.createElement('script'); js.id = id; js.async = true;
        js.src = "http://connect.facebook.net/en_US/all.js";
        ref.parentNode.insertBefore(js, ref);
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""(document));

        </script>

        <div align="center">
            <h2>Facebook OAuth Javascript Demo</h2>

            <div id="status">
 Click on Below Image to start the demo: <br/>
                <img src="http://hayageek.com/examples/oauth/facebook/oauth-javascript/LoginWithFacebook.png" style="cursor:pointer;" onclick="Login()"/>
</div>

            <br/><br/><br/><br/><br/>

            <div id="message">
Logs:<br/>
</div>

        </div>
    </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Sep 07 23:11:35 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/isdrun/test.scala.html
                    HASH: 1d7cd4d5cf58a897109ddd9e40c1362006ecdec3
                    MATRIX: 861->0|1065->177|1093->178|1137->195|1165->196|1438->442|1467->443|1579->528|1608->529|1689->583|1718->584|1859->698|1888->699|1979->763|2008->764|2144->873|2173->874|2214->888|2243->889|2379->998|2408->999|2444->1008|2473->1009|2512->1021|2541->1022|2604->1058|2633->1059|2699->1097|2728->1098|2799->1142|2828->1143|2887->1175|2916->1176|2957->1190|2986->1191|3095->1273|3124->1274|3160->1283|3189->1284|3218->1285|3247->1286|3313->1324|3342->1325|3381->1337|3410->1338|3471->1371|3500->1372|3570->1414|3599->1415|4119->1908|4148->1909|4186->1920|4215->1921|4279->1958|4308->1959|4398->2021|4427->2022|4595->2163|4624->2164|4663->2176|4692->2177|4754->2212|4783->2213|4840->2242|4869->2243|4924->2270|4953->2271|4991->2282|5020->2283|5109->2344|5138->2345|5283->2462|5312->2463|5347->2470|5376->2471|5588->2656|5617->2657
                    LINES: 29->1|35->7|35->7|36->8|36->8|41->13|41->13|44->16|44->16|46->18|46->18|50->22|50->22|52->24|52->24|56->28|56->28|57->29|57->29|61->33|61->33|62->34|62->34|64->36|64->36|67->39|67->39|69->41|69->41|71->43|71->43|73->45|73->45|74->46|74->46|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|79->51|79->51|81->53|81->53|82->54|82->54|94->66|94->66|95->67|95->67|97->69|97->69|98->70|98->70|103->75|103->75|105->77|105->77|107->79|107->79|108->80|108->80|108->80|108->80|109->81|109->81|112->84|112->84|114->86|114->86|114->86|114->86|118->90|118->90
                    -- GENERATED --
                */
            