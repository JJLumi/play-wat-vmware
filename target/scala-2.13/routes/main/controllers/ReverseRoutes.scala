// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/conf/routes
// @DATE:Sat Feb 13 13:37:21 CET 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseVMServerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def startVM(vmId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "startvm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("vmId", vmId)))
    }
  
    // @LINE:10
    def suspendVM(vmName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suspendvm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("vmName", vmName)))
    }
  
    // @LINE:11
    def resetVM(vmName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "resetvm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("vmName", vmName)))
    }
  
    // @LINE:6
    def setCredentials(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def listVMs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listvms")
    }
  
    // @LINE:9
    def stopVM(vmName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "stopvm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("vmName", vmName)))
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseWidgetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:14
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widgets")
    }
  
  }


}
