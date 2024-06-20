package components.pages

import org.jetbrains.compose.web.css.*
import style.GlobalStyle
import style.forMobile

object TopPageStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        width(100.percent)
        height(100.percent)
        padding(100.px, 32.px)

        forMobile {
            padding(64.px, 16.px)
        }
    }

    val heroSection by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        gap(30.px)
        width(700.px)
        maxWidth(90.percent)
    }

    val heroImage by style {
        width(700.px)
        maxWidth(100.percent)
    }

    val catchphraseSection by style {
        fontSize(20.px)
        color(Color.white)
        fontWeight(700)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.SpaceBetween)
        gap(32.px)

        forMobile {
            fontSize(16.px)
            flexDirection(FlexDirection.Column)
        }
    }

    val by_m3 by style {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        gap(16.px)
    }

    val catchphraseText by style {
        flexGrow(1)
    }

    val footer by style {
        position(Position.Fixed)
        bottom(0.px)
        left(0.px)
        right(0.px)
        background("#0F0069")
        height(68.px)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        property("z-index", -1)
    }

    val footerText by style {
        color(Color.white)
        fontSize(16.px)

        forMobile {
            fontSize(12.px)
        }
    }
}