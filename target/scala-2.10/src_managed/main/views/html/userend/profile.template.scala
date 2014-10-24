
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user : models.User.User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

<!DOCTYPE html>
<html>
<head>
    """),_display_(Seq[Any](/*6.6*/common/*6.12*/.head("Profile"))),format.raw/*6.28*/("""
</head>
<body>
"""),_display_(Seq[Any](/*9.2*/common/*9.8*/.navbar("Profile"))),format.raw/*9.26*/("""

"""),_display_(Seq[Any](/*11.2*/common/*11.8*/.rating(10,4))),format.raw/*11.21*/("""
"""),_display_(Seq[Any](/*12.2*/common/*12.8*/.rating(11,4))),format.raw/*12.21*/("""

"""),_display_(Seq[Any](/*14.2*/common/*14.8*/.footer())),format.raw/*14.17*/("""

</body>

</html>"""))}
    }
    
    def render(user:models.User.User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((models.User.User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 24 09:01:25 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/userend/profile.scala.html
                    HASH: 1a75c3252926c694a9ea624ad784ac1f3976077f
                    MATRIX: 794->1|913->26|984->63|998->69|1035->85|1086->102|1099->108|1138->126|1176->129|1190->135|1225->148|1262->150|1276->156|1311->169|1349->172|1363->178|1394->187
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14
                    -- GENERATED --
                */
            