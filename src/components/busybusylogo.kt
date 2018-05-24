package components.busybusy.logo

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

@JsModule("src/images/busybusylogo.png")
external val busyLogo: dynamic

fun RBuilder.busybusyLogo(height: Int = 100) {
	div("busy-logo") {
		/* attrs.jsStyle.height = height */
		img(alt = "busy.logo", src = busyLogo, classes = "busybusylogo") {}
	}
}
