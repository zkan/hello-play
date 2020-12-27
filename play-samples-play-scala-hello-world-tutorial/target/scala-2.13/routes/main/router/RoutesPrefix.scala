// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/zkan/Labs/hello-play/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Dec 27 20:42:56 ICT 2020


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
