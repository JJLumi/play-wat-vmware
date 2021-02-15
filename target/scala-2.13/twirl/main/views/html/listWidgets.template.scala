
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Widgets")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""

    """),format.raw/*6.5*/("""<h1>Widgets</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.asScala().data.map/*9.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*9.62*/("""
    """),format.raw/*10.5*/("""<div class=""""),_display_(/*10.18*/name),format.raw/*10.22*/("""">"""),_display_(/*10.25*/value),format.raw/*10.30*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
        <thead>
            <tr><th>Name</th><th>Price</th>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(w <- widgets) yield /*18.27*/ {_display_(Seq[Any](format.raw/*18.29*/("""
            """),format.raw/*19.13*/("""<tr><td>"""),_display_(/*19.22*/w/*19.23*/.name),format.raw/*19.28*/("""</td><td>"""),_display_(/*19.38*/w/*19.39*/.price),format.raw/*19.45*/("""</td></tr>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*26.66*/("""
    """),_display_(/*27.6*/if(form.hasGlobalErrors)/*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""
        """),_display_(/*28.10*/form/*28.14*/.globalErrors.asScala.map/*28.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*28.88*/("""
            """),format.raw/*29.13*/("""<div>
                """),_display_(/*30.18*/error/*30.23*/.key),format.raw/*30.27*/(""": """),_display_(/*30.30*/error/*30.35*/.message),format.raw/*30.43*/("""
            """),format.raw/*31.13*/("""</div>
        """)))}),format.raw/*32.10*/("""
    """)))}),format.raw/*33.6*/("""

    """),_display_(/*35.6*/helper/*35.12*/.form(routes.WidgetController.createWidget)/*35.55*/ {_display_(Seq[Any](format.raw/*35.57*/("""
        """),_display_(/*36.10*/helper/*36.16*/.CSRF.formField),format.raw/*36.31*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputText(form("name"))),format.raw/*38.40*/("""

        """),_display_(/*40.10*/helper/*40.16*/.inputText(form("price"))),format.raw/*40.41*/("""

        """),format.raw/*42.9*/("""<button type="submit">Create widget</button>
    """)))}),format.raw/*43.6*/("""

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form)(request,messages)

  def f:((Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form) => (request,messages) => apply(widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T13:37:21.991
                  SOURCE: C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/app/views/listWidgets.scala.html
                  HASH: a4f45b974c5515ae7e444fd939d0690278153c63
                  MATRIX: 611->1|999->31|1196->135|1223->137|1246->152|1285->154|1317->160|1366->217|1397->223|1412->230|1445->255|1506->279|1538->284|1578->297|1603->301|1633->304|1659->309|1701->321|1734->327|1871->437|1904->454|1944->456|1985->469|2021->478|2031->479|2057->484|2094->494|2104->495|2131->501|2182->521|2218->530|2284->629|2316->635|2349->659|2389->661|2426->671|2439->675|2473->700|2560->749|2601->762|2651->785|2665->790|2690->794|2720->797|2734->802|2763->810|2804->823|2851->839|2887->845|2920->852|2935->858|2987->901|3027->903|3064->913|3079->919|3115->934|3153->945|3168->951|3213->975|3251->986|3266->992|3312->1017|3349->1027|3429->1077|3462->1080
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|36->6|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|41->11|43->13|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|51->21|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|59->29|60->30|60->30|60->30|60->30|60->30|60->30|61->31|62->32|63->33|65->35|65->35|65->35|65->35|66->36|66->36|66->36|68->38|68->38|68->38|70->40|70->40|70->40|72->42|73->43|75->45
                  -- GENERATED --
              */
          