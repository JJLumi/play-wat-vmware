// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kris/Projects/wat/play-wat-vmware/conf/routes
// @DATE:Tue Feb 16 07:47:25 CET 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseVMServerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def startVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.startVM",
      """
        function(vmId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmId", vmId0))})
        }
      """
    )
  
    // @LINE:10
    def suspendVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.suspendVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suspendvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
    // @LINE:11
    def resetVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.resetVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
    // @LINE:6
    def setCredentials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.setCredentials",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def listVMs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.listVMs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listvms"})
        }
      """
    )
  
    // @LINE:9
    def stopVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.stopVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stopvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseWidgetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def createWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.createWidget",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
    // @LINE:14
    def listWidgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.listWidgets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
  }


}
