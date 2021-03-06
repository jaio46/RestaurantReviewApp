
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<html class="full" lang="en">
<!-- Make sure the <html> tag is set to the .full CSS class. Change the background image in the full.css file. -->

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Welcome to Restaurant Review System</title>

    <!-- Bootstrap Core CSS -->
    <link href=""""),_display_(Seq[Any](/*16.18*/routes/*16.24*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*16.67*/("""" rel="stylesheet">

    <!-- Custom CSS -->
    <link href=""""),_display_(Seq[Any](/*19.18*/routes/*19.24*/.Assets.at("stylesheets/the-big-picture.css"))),format.raw/*19.69*/("""" rel="stylesheet">

    <script src=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Assets.at("javascripts/facebook.js"))),format.raw/*21.62*/(""""></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<script src=""""),_display_(Seq[Any](/*33.15*/routes/*33.21*/.Assets.at("javascripts/jquery-1.11.0.js"))),format.raw/*33.63*/(""""></script>
<script src=""""),_display_(Seq[Any](/*34.15*/routes/*34.21*/.Assets.at("javascripts/facebookLogin.js"))),format.raw/*34.63*/(""""></script>
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://localhost:9000/">Quick Dining</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>-->

<!-- Page Content -->
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-6 column">
                </div>
                <div class="col-md-6 column">
                    <h3>
                        Hangout where you are supposed to!
                    </h3>
                    <div class="row clearfix">
                        <div class="col-md-2 column">
                        </div>
                        <div class="col-md-4 column">
                            <button type="button" class="btn btn-block btn-primary" onclick="Login()">Log in with Facebook</button>
                        </div>
                        <div class="col-md-6 column">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /.container -->

<!-- jQuery Version 1.11.0 -->
<script src=""""),_display_(Seq[Any](/*95.15*/routes/*95.21*/.Assets.at("javascripts/jquery-1.11.0.js"))),format.raw/*95.63*/(""""></script>

<!-- Bootstrap Core JavaScript -->
<script src=""""),_display_(Seq[Any](/*98.15*/routes/*98.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*98.63*/(""""></script>

</body>

</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 11:03:08 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/isdrun/home.scala.html
                    HASH: 87451fcf9738686908de3deb1a12d21202f2ab8e
                    MATRIX: 861->1|1392->496|1407->502|1472->545|1570->607|1585->613|1652->658|1727->697|1742->703|1801->740|2259->1162|2274->1168|2338->1210|2400->1236|2415->1242|2479->1284|4762->3531|4777->3537|4841->3579|4939->3641|4954->3647|5018->3689
                    LINES: 29->2|43->16|43->16|43->16|46->19|46->19|46->19|48->21|48->21|48->21|60->33|60->33|60->33|61->34|61->34|61->34|122->95|122->95|122->95|125->98|125->98|125->98
                    -- GENERATED --
                */
            