package router

import react.*
import react.dom.*
import react.router.dom.*
import components.busybusy.logo.*
import routes.*

class Router : RComponent<RProps, RState>() {
	override fun RBuilder.render() {
		browserRouter {
			div("router-container") {
				div("router-nav") {
					routeLink("/") { +"Index" }
					routeLink("/employees") { +"Employees" }
				}
				div("router-body") {
					div("header") {
						busybusyLogo()
						/* div ("logo") { */
						/*   span { +"busy" } */
						/*   span { +"busy" } */
						/* } */
					}
					div("body") {
						route("/", IndexRoute::class, exact = true)
						route("/employees", EmployeesRoute::class, exact = true)
					}
				}
			}
		}
	}
}

fun RBuilder.router() = child(Router::class) {}
