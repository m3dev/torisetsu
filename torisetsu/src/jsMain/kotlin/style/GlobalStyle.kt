package style

import org.jetbrains.compose.web.css.*

object GlobalStyle : StyleSheet() {
    init {
        universal style {
            boxSizing("border-box")
        }

        "body" style {
            margin(0.px)
            backgroundSize("auto auto")
            backgroundColor(rgb(12, 31, 204))
            backgroundImage("repeating-linear-gradient(-45deg, rgb(12, 31, 204), rgb(12, 31, 204) 10px, rgba(10, 0, 146, 1) 10px, rgba(10, 0, 146, 1) 12px)")
            minHeight(100.vh)
            fontFamily("\"Noto Sans JP\", sans-serif")
            property("font-optical-sizing", "auto")
        }

        "h1, h2, h3, h4, h5, h6, p" style {
            margin(0.px)
        }

        "button" style {
            backgroundColor(Color.transparent)
            border(0.px)
            cursor("pointer")
        }
    }
}