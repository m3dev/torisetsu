package components.base

import org.jetbrains.compose.web.css.*
import style.GlobalStyle

object XShareButtonStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        backgroundColor(rgb(0, 0, 0))
        color(Color.white)
        padding(20.px, 32.px)
        borderRadius(999.px)
        textDecoration("none")
        width(160.px)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        gap(10.px)
        justifyContent(JustifyContent.Center)
    }

    val icon by style {
        width(20.px)
        flexShrink(0)
        property("aspect-ratio", "1")
    }
    
    val text by style {
        flexShrink(0)
    }
}