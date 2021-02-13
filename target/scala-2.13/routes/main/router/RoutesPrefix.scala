// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lumi/Desktop/10.02/play-wat-vmware_2/play-wat-vmware/conf/routes
// @DATE:Wed Feb 10 16:47:26 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
