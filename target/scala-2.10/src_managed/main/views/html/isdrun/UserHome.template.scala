
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
object UserHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head(title))),format.raw/*6.24*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar(title))),format.raw/*9.22*/("""

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-2 column">
                    <h2>
                        KFC releases new Gingerbread Burger
                    </h2>
                    <p>
                        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
                    </p>
                    <p>
                        <a class="btn" href="#">View details »</a>
                    </p>
                    <h2>
                        A&W to close
                    </h2>
                    <p>
                        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
                    </p>
                    <p>
                        <a class="btn" href="#">View details »</a>
                    </p>
                    <h2>
                        Royal Buffet Price Updates
                    </h2>
                    <p>
                        Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
                    </p>
                    <p>
                        <a class="btn" href="#">View details »</a>
                    </p>
                </div>
                <div class="col-md-6 column">
                    <br>
                    <div class="media">
                        <a href="#" class="pull-left"><img src="http://lorempixel.com/64/64/people" class="media-object" alt=""></a>
                        <div class="media-body">
                            <h4 class="media-heading">
                                Shakib Ahmed and <a href="#">2 others</a>
                            </h4> likes <a href="#">El Torah</a>

                        </div>
                    </div>
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">like</a> <span class="divider"> </span>
                        </li>
                        <li>
                            <a href="#">comment</a> <span class="divider"> </span>
                        </li>
                    </ul>
                    <div class="media">
                        <a href="#" class="pull-left"><img src="http://lorempixel.com/g/64/64/people" class="media-object" alt=""></a>
                        <div class="media-body">
                            <h4 class="media-heading">
                                Nawfil Nibir
                            </h4> likes <a href="#">KFC</a>

                        </div>
                    </div>
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">like</a> <span class="divider"> </span>
                        </li>
                        <li>
                            <a href="#">comment</a> <span class="divider"> </span>
                        </li>
                    </ul>
                    <div class="media">
                        <a href="#" class="pull-left"><img src="http://lorempixel.com/64/64/people" class="media-object" alt=""></a>
                        <div class="media-body">
                            <h4 class="media-heading">
                                Mostafiz Rahman
                            </h4> likes <a href="#">Western Grill</a>

                        </div>
                    </div>
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">like</a> <span class="divider"> </span>
                        </li>
                        <li>
                            <a href="#">comment</a> <span class="divider"> </span>
                        </li>
                    </ul>
                    <div class="media">
                        <a href="#" class="pull-left"><img src="http://lorempixel.com/g/64/64/people" class="media-object" alt=""></a>
                        <div class="media-body">
                            <h4 class="media-heading">
                                Anika Tabassum
                            </h4> likes <a href="#">Star Kabab</a>

                        </div>
                    </div>
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">like</a> <span class="divider"> </span>
                        </li>
                        <li>
                            <a href="#">comment</a> <span class="divider"> </span>
                        </li>
                    </ul>
                    <div class="media">
                        <a href="#" class="pull-left"><img src="http://lorempixel.com/64/64/people" class="media-object" alt=""></a>
                        <div class="media-body">
                            <h4 class="media-heading">
                                Rafi Kamal
                            </h4> likes <a href="#">Palasir Rice</a>

                        </div>
                    </div>
                    <ul class="breadcrumb">
                        <li>
                            <a href="#">like</a> <span class="divider"> </span>
                        </li>
                        <li>
                            <a href="#">comment</a> <span class="divider"> </span>
                        </li>
                    </ul>
                </div>

                <div class="col-md-4 column">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="thumbnail">
                                <img alt="300x200" src="http://lorempixel.com/600/200/people" />
                                <div class="caption">
                                    <h3>
                                        Item from KFC suggested
                                    </h3>
                                    <p>
                                        <a class="btn" href="#">Nawfil Nibir</a> seggests Ginger bread burger from kfc
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Find Pricing</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="thumbnail">
                                <img alt="300x200" src="http://lorempixel.com/600/200/city" />
                                <div class="caption">
                                    <h3>
                                        Item from Western Grill Suggested
                                    </h3>
                                    <p>
                                        <a class="btn" href="#">Sumaiya Nasrin</a> seggests cheese burger from Western Grill
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Find Pricing</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="thumbnail">
                                <img alt="300x200" src="http://lorempixel.com/600/200/people" />
                                <div class="caption">
                                    <h3>
                                        Hangout Requests
                                    </h3>
                                    <p>
                                        10 New Hangout requests
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Details</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="thumbnail">
                                <img alt="300x200" src="http://lorempixel.com/600/200/city" />
                                <div class="caption">
                                    <h3>
                                        New restaurants
                                    </h3>
                                    <p>
                                        5 New restaurants at your area.
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Details</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

"""),_display_(Seq[Any](/*210.2*/common/*210.8*/.footer())),format.raw/*210.17*/("""

</body>

</html>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 05 07:05:50 ALMT 2014
                    SOURCE: G:/Play/Restaurant App/app/views/isdrun/UserHome.scala.html
                    HASH: 21458a192b077476f3840690eec20b07abea6ce4
                    MATRIX: 784->1|894->17|965->54|979->60|1012->72|1063->89|1076->95|1111->109|10681->9643|10696->9649|10728->9658
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|238->210|238->210|238->210
                    -- GENERATED --
                */
            