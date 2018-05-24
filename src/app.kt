package app

import react.*
import react.dom.*
import router.*

class App : RComponent<RProps, RState>() {
  override fun RBuilder.render() {
    div("application") {
      router()
    }
  }
}

fun RBuilder.app() = child(App::class) {}
