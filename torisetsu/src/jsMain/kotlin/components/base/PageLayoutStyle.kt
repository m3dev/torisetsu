package components.base

import org.jetbrains.compose.web.css.*
import style.GlobalStyle

object PageLayoutStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        padding(32.px, 24.px)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
    }
    val wrapper by style {
        width(649.px)
        maxWidth(100.percent)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        flexDirection(FlexDirection.Column)
    }
    val header by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        gap(60.px)
    }
    val titleLogo by style {
        width(150.px)
    }
    val m3Logo by style {
        width(160.px)
    }
    val main by style {
        marginTop(40.px)
        width(100.percent)
    }
}