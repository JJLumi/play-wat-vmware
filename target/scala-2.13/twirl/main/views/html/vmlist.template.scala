
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

object vmlist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[models.VMInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vms: Seq[models.VMInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("VMware VM List")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
"""),format.raw/*4.1*/("""<div>
  <table style="width:100%">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Cpu Count</th>
      <th>Memory Size MiB</th>
      <th>Power State</th>
      <th>Actions</th>
    </tr>
    """),_display_(/*14.6*/for(vm <- vms) yield /*14.20*/{_display_(Seq[Any](format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""<tr>
      <td>"""),_display_(/*16.12*/{vm.getId}),format.raw/*16.22*/("""</td>
      <td>"""),_display_(/*17.12*/{vm.getName}),format.raw/*17.24*/("""</td>
      <td>todo</td>
      <td>todo</td>
      <td>todo</td>
      <td>
        <ul>
          <li><a href=""""),_display_(/*23.25*/controllers/*23.36*/.routes.VMServerController.startVM(vm.getId)),format.raw/*23.80*/("""">Start</a></li>
          <li><a href=""""),_display_(/*24.25*/controllers/*24.36*/.routes.VMServerController.stopVM(vm.getName)),format.raw/*24.81*/("""">Stop</a></li>
          <li><a href=""""),_display_(/*25.25*/controllers/*25.36*/.routes.VMServerController.suspendVM(vm.getName)),format.raw/*25.84*/("""">Suspend</a></li>
          <li><a href=""""),_display_(/*26.25*/controllers/*26.36*/.routes.VMServerController.resetVM(vm.getName)),format.raw/*26.82*/("""">Reset</a></li>
        </ul>
      </td>
    </tr>
    """)))}),format.raw/*30.6*/("""
  """),format.raw/*31.3*/("""</table>
</div>
""")))}))
      }
    }
  }

  def render(vms:Seq[models.VMInfo]): play.twirl.api.HtmlFormat.Appendable = apply(vms)

  def f:((Seq[models.VMInfo]) => play.twirl.api.HtmlFormat.Appendable) = (vms) => apply(vms)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-10T16:47:26.832
                  SOURCE: C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/app/views/vmlist.scala.html
                  HASH: efb4254a7da317266a34354a64d104859ebe3fb2
                  MATRIX: 921->1|1040->27|1067->29|1097->51|1136->53|1163->54|1392->257|1422->271|1461->272|1493->277|1536->293|1567->303|1611->320|1644->332|1785->446|1805->457|1870->501|1938->542|1958->553|2024->598|2091->638|2111->649|2180->697|2250->740|2270->751|2337->797|2425->855|2455->858
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|44->14|44->14|44->14|45->15|46->16|46->16|47->17|47->17|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|60->30|61->31
                  -- GENERATED --
              */
          