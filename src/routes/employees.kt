package routes

import react.*
import react.dom.*
import components.logo.*
import components.ticker.*

class EmployeesRoute : RComponent<RProps, RState>() {
	override fun RBuilder.render() {
		div("index-header") {
			logo()
			h2 {
				+"Employees Route"
			}
		}

		p("index-intro") {
			+"To get started, edit "
			code { +"app/App.kt" }
			+" and save to reload."
		}

		p("index-ticker") { ticker() }
	}
}
