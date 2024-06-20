package components.base

import org.jetbrains.compose.web.css.*
import style.GlobalStyle
import style.data
import style.forMobile

object ButtonStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        data("size", "normal") {
            padding(16.px, 36.px)
            borderRadius(16.px)
            fontSize(32.px)
        }


        data("size", "large") {
            padding(40.px, 100.px)
            borderRadius(40.px)
            fontSize(60.px)
        }

        forMobile {
            data("size", "normal") {
                padding(16.px, 36.px)
                borderRadius(12.px)
                fontSize(24.px)
            }

            data("size", "large") {
                padding(20.px, 50.px)
                borderRadius(20.px)
                fontSize(32.px)
            }
        }



        backgroundImage("linear-gradient(#5772FF, #0054DD)")
        color(Color.white)
        fontWeight(700)
        property(
            "box-shadow",
            "0px 5.13px 5.13px 0px #F9F7F340 inset, 0px -5.13px 5.13px 0px #00000040 inset"
        )
    }
}