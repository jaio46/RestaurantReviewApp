
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



"""),_display_(Seq[Any](/*13.2*/common/*13.8*/.footer())),format.raw/*13.17*/("""

</body>

</html>"""))}
    }
    
    def render(user:models.User.User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((models.User.User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 09:03:15 BDT 2014
                    SOURCE: /Users/sheikhahmed/Projects/RestaurantApp/app/views/userend/profile.scala.html
                    HASH: 28d8690b6deb880d051c7b73c83701c1c896ab4a
                    MATRIX: 794->1|913->26|984->63|998->69|1035->85|1086->102|1099->108|1138->126|1178->131|1192->137|1223->146
                    LINES: 26->1|29->1|34->6|34->6|34->6|37->9|37->9|37->9|41->13|41->13|41->13
                    -- GENERATED --
                */
            