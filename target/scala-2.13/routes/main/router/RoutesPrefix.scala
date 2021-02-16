// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kris/Projects/wat/play-wat-vmware/conf/routes
// @DATE:Tue Feb 16 07:47:25 CET 2021


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
