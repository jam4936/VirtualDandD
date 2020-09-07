// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jam941/Downloads/play-samples-play-java-chatroom-example/play-samples-play-java-chatroom-example/conf/routes
// @DATE:Mon Sep 07 17:05:37 EDT 2020


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
