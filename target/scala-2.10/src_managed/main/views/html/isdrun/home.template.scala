
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

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

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
            <a class="navbar-brand" href="#">Quick Dining</a>
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
                        Hangout where you aresupposed to!
                    </h3>
                    <div class="row clearfix">
                        <div class="col-md-6 column">
                            <button type="button" class="btn btn-block btn-primary">Log in with Fcaebook</button>
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
<script src=""""),_display_(Seq[Any](/*90.15*/routes/*90.21*/.Assets.at("javascripts/jquery-1.11.0.js"))),format.raw/*90.63*/(""""></script>

<!-- Bootstrap Core JavaScript -->
<script src=""""),_display_(Seq[Any](/*93.15*/routes/*93.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*93.63*/(""""></script>

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
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/isdrun/home.scala.html
                    HASH: 7859b9749a3752e30170289635739b62ce746cd0
                    MATRIX: 861->1|1392->496|1407->502|1472->545|1570->607|1585->613|1652->658|4215->3185|4230->3191|4294->3233|4392->3295|4407->3301|4471->3343
                    LINES: 29->2|43->16|43->16|43->16|46->19|46->19|46->19|117->90|117->90|117->90|120->93|120->93|120->93
                    -- GENERATED --
                */
            