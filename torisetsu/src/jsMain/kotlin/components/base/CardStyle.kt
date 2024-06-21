package components.base

import org.jetbrains.compose.web.css.*
import style.GlobalStyle
import style.forMobile

object CardStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        padding(32.px)
        backgroundColor(rgb(255, 255, 255))
        borderRadius(16.px)
        property("box-shadow", "0px 4px 4px rgba(0, 0, 0, 0.25), 0px 8px 6px rgba(0, 0, 0, 0.10)")

        forMobile {
            padding(24.px)
        }
    }
}