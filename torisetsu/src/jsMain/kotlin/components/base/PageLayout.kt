package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun PageLayout(
    content: @Composable() () -> Unit
) {
    return Div(
        attrs = {
            style {
                padding(32.px, 12.px)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    width(649.px)
                    maxWidth(100.percent)
                    display(DisplayStyle.Flex)
                    alignItems(AlignItems.Center)
                    flexDirection(FlexDirection.Column)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Row)
                        gap(60.px)
                    }
                }
            ) {
                Img(
                    src = "./images/service_logo.svg",
                    alt = "エンジニア トリ診断",
                    attrs = {
                        style {
                            width(150.px)
                        }
                    }
                )
                Img(
                    src = "./images/m3_logo_en.svg",
                    alt = "M3 Inc.",
                    attrs = {
                        style {
                            width(160.px)
                        }
                    })
            }
            Div(
                attrs = {
                    style {
                        marginTop(40.px)
                        width(100.percent)
                    }
                }
            ) {
                content()
            }
        }
    }
}