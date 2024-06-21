package components.pages

import androidx.compose.runtime.Composable
import components.base.Button
import components.base.ButtonSize
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun TopPage(
    onClickStart: () -> Unit
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
                width(100.percent)
                height(100.percent)
                padding(100.px, 32.px)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    alignItems(AlignItems.Center)
                    justifyContent(JustifyContent.Center)
                    gap(30.px)
                    width(700.px)
                    maxWidth(90.percent)
                }
            }

        ) {
            H1 {
                Img(
                    src = "./images/service_logo.svg",
                    attrs = {
                        style {
                            width(700.px)
                            maxWidth(100.percent)
                        }
                    }
                )
            }
            Div {
                P(
                    attrs = {
                        style {
                            fontSize(20.px)
                            color(Color.white)
                            fontWeight(700)
                            display(DisplayStyle.Flex)
                            alignItems(AlignItems.Center)
                            justifyContent(JustifyContent.SpaceBetween)
                            gap(32.px)
                        }
                    }

                ) {
                    Span {
                        Text("トリあえず、やってみればーどうでしょう??")
                    }
                    Span {
                        Text("by")
                    }
                    Img(
                        src = "images/m3_logo_en.svg",
                        alt = "M3, Inc.",
                    )

                }
            }
        }
        Div(
            attrs = {
                style {
                    marginTop(60.px)
                }
            }

        ) {
            Button(
                onClick = { onClickStart() },
                size = ButtonSize.LARGE
            ) {
                Span(
                    attrs = {
                        style {
                            fontSize(60.px)
                            fontWeight(700)
                        }
                    }
                ) {

                    Text("診断を始める")
                }
            }
        }
        Div(
            attrs = {
                style {
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
            }
        ) {
            P(
                attrs = {
                    style {
                        color(Color.white)
                        fontSize(12.px)
                    }
                }
            ) {
                Text("@M3, Inc")
            }
        }
    }
}