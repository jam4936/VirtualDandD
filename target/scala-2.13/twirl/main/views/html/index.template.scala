
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,org.webjars.play.WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, webJarsUtil: org.webjars.play.WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),_display_(/*9.10*/webJarsUtil/*9.21*/.locate("bootstrap.min.css").css()),format.raw/*9.55*/("""
        """),_display_(/*10.10*/webJarsUtil/*10.21*/.locate("bootstrap-theme.min.css").css()),format.raw/*10.61*/("""

        """),format.raw/*12.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
        <title>Chat Room</title>

    </head>

    <body>
        <div class="wrap">
            <div class="container-fluid">
                <div>
                    <h1 class="">Chat Room</h1>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <ul id="messages" class="list-unstyled">
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="footer navbar-fixed-bottom">
            <div class="row">
                <div class="col-xs-8 col-sm-9">
                    <input id="message" placeholder="Type Here" type="text"
                      autofocus
                      autocomplete="off" spellcheck="false" autocorrect="off"
                      class="form-control input-lg" />
                </div>

                <div class="col-xs-4 col-sm-3">
                    <button id="send" type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
                </div>
            </div>
        </div>

        """),_display_(/*49.10*/webJarsUtil/*49.21*/.locate("jquery.min.js").script()),format.raw/*49.54*/("""

        """),format.raw/*51.9*/("""<script language="javascript">
                var $messages = $("#messages"),
                        $send = $("#send"),
                        $message = $("#message"),
                        connection = new WebSocket(""""),_display_(/*55.54*/url),format.raw/*55.57*/("""");

                $send.prop("disabled", true);

                var send = function () """),format.raw/*59.40*/("""{"""),format.raw/*59.41*/("""
                    """),format.raw/*60.21*/("""var text = $message.val();
                    $message.val("");
                    connection.send(text);
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""";

                connection.onopen = function () """),format.raw/*65.49*/("""{"""),format.raw/*65.50*/("""
                    """),format.raw/*66.21*/("""$send.prop("disabled", false);
                    $messages.prepend($("<li class='bg-info' style='font-size: 1.5em'>Connected</li>"));
                    $send.on('click', send);
                    $message.keypress(function(event)"""),format.raw/*69.54*/("""{"""),format.raw/*69.55*/("""
                        """),format.raw/*70.25*/("""var keycode = (event.keyCode ? event.keyCode : event.which);
                        if(keycode == '13')"""),format.raw/*71.44*/("""{"""),format.raw/*71.45*/("""
                            """),format.raw/*72.29*/("""send();
                        """),format.raw/*73.25*/("""}"""),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""");
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/(""";
                connection.onerror = function (error) """),format.raw/*76.55*/("""{"""),format.raw/*76.56*/("""
                    """),format.raw/*77.21*/("""console.log('WebSocket Error ', error);
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""";
                connection.onmessage = function (event) """),format.raw/*79.57*/("""{"""),format.raw/*79.58*/("""
                    """),format.raw/*80.21*/("""$messages.append($("<li style='font-size: 1.5em'>" + event.data + "</li>"))
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""
        """),format.raw/*82.9*/("""</script>
    </body>

</html>"""))
      }
    }
  }

  def render(url:String,webJarsUtil:org.webjars.play.WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(url,webJarsUtil)

  def f:((String,org.webjars.play.WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (url,webJarsUtil) => apply(url,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-07T17:05:37.695
                  SOURCE: C:/Users/jam941/Downloads/play-samples-play-java-chatroom-example/play-samples-play-java-chatroom-example/app/views/index.scala.html
                  HASH: 17f79ccb02e925df1723e4ab5afeaa5d3c0ed786
                  MATRIX: 936->1|1086->58|1336->282|1355->293|1409->327|1446->337|1466->348|1527->388|1564->398|1636->443|1651->449|1706->483|1794->544|1809->550|1862->582|2985->1678|3005->1689|3059->1722|3096->1732|3349->1958|3373->1961|3492->2052|3521->2053|3570->2074|3722->2198|3751->2199|3830->2250|3859->2251|3908->2272|4170->2506|4199->2507|4252->2532|4384->2636|4413->2637|4470->2666|4530->2698|4559->2699|4608->2720|4637->2721|4684->2740|4713->2741|4797->2797|4826->2798|4875->2819|4959->2875|4988->2876|5074->2934|5103->2935|5152->2956|5272->3048|5301->3049|5337->3058
                  LINES: 27->1|32->2|39->9|39->9|39->9|40->10|40->10|40->10|42->12|42->12|42->12|42->12|43->13|43->13|43->13|79->49|79->49|79->49|81->51|85->55|85->55|89->59|89->59|90->60|93->63|93->63|95->65|95->65|96->66|99->69|99->69|100->70|101->71|101->71|102->72|103->73|103->73|104->74|104->74|105->75|105->75|106->76|106->76|107->77|108->78|108->78|109->79|109->79|110->80|111->81|111->81|112->82
                  -- GENERATED --
              */
          