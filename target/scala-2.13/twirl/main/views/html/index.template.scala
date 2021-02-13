
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.mvc.Http.Request

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ConnectionData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[ConnectionData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
"""),format.raw/*5.1*/("""<div>

    """),format.raw/*7.40*/("""
    """),_display_(/*8.6*/request/*8.13*/.flash.asScala().data.map/*8.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*8.62*/("""
    """),format.raw/*9.5*/("""<div class=""""),_display_(/*9.18*/name),format.raw/*9.22*/("""">"""),_display_(/*9.25*/value),format.raw/*9.30*/("""</div>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<h2>Vmware Connection Details</h2>
    """),format.raw/*12.66*/("""
    """),_display_(/*13.6*/if(form.hasGlobalErrors)/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
    """),_display_(/*14.6*/form/*14.10*/.globalErrors.asScala.map/*14.35*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*14.84*/("""
    """),format.raw/*15.5*/("""<div>
        """),_display_(/*16.10*/error/*16.15*/.key),format.raw/*16.19*/(""": """),_display_(/*16.22*/error/*16.27*/.message),format.raw/*16.35*/("""
    """),format.raw/*17.5*/("""</div>
    """)))}),format.raw/*18.6*/("""
    """)))}),format.raw/*19.6*/("""

    """),_display_(/*21.6*/helper/*21.12*/.form(routes.VMServerController.setCredentials())/*21.61*/ {_display_(Seq[Any](format.raw/*21.63*/("""
    """),_display_(/*22.6*/helper/*22.12*/.CSRF.formField),format.raw/*22.27*/("""

    """),_display_(/*24.6*/helper/*24.12*/.inputText(form("server"))),format.raw/*24.38*/("""
    """),_display_(/*25.6*/helper/*25.12*/.inputText(form("port"))),format.raw/*25.36*/("""
    """),_display_(/*26.6*/helper/*26.12*/.inputText(form("username"))),format.raw/*26.40*/("""
    """),_display_(/*27.6*/helper/*27.12*/.inputPassword(form("password"))),format.raw/*27.44*/("""

    """),format.raw/*29.5*/("""<button type="submit">Save And Continue</button>
    """)))}),format.raw/*30.6*/("""

"""),format.raw/*32.1*/("""</div>

""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(form:Form[ConnectionData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(request,messages)

  def f:((Form[ConnectionData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (request,messages) => apply(form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-10T16:47:26.795
                  SOURCE: C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/app/views/index.scala.html
                  HASH: 301c7e00a800ef14f5c3c2a8a98b5bfdac252a46
                  MATRIX: 611->1|985->31|1164->117|1191->119|1222->142|1261->144|1288->145|1326->191|1357->197|1372->204|1405->229|1466->253|1497->258|1536->271|1560->275|1589->278|1614->283|1656->295|1688->300|1755->400|1787->406|1820->430|1860->432|1892->438|1905->442|1939->467|2026->516|2058->521|2100->536|2114->541|2139->545|2169->548|2183->553|2212->561|2244->566|2286->578|2322->584|2355->591|2370->597|2428->646|2468->648|2500->654|2515->660|2551->675|2584->682|2599->688|2646->714|2678->720|2693->726|2738->750|2770->756|2785->762|2834->790|2866->796|2881->802|2934->834|2967->840|3051->894|3080->896|3119->905
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|37->7|38->8|38->8|38->8|38->8|39->9|39->9|39->9|39->9|39->9|40->10|41->11|42->12|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|46->16|46->16|46->16|46->16|46->16|46->16|47->17|48->18|49->19|51->21|51->21|51->21|51->21|52->22|52->22|52->22|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|59->29|60->30|62->32|64->34
                  -- GENERATED --
              */
          