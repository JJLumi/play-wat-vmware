// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/conf/routes
// @DATE:Wed Feb 10 16:47:26 CET 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseVMServerController VMServerController = new controllers.ReverseVMServerController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWidgetController WidgetController = new controllers.ReverseWidgetController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseVMServerController VMServerController = new controllers.javascript.ReverseVMServerController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWidgetController WidgetController = new controllers.javascript.ReverseWidgetController(RoutesPrefix.byNamePrefix());
  }

}
