package components.pages

import androidx.compose.runtime.Composable
import components.base.*
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun resultPage(onClickBack: () -> Unit) {
    pageLayout {
        Div(
            attrs = {
                style {
                    width(100.percent)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    alignItems(AlignItems.Center)
                    gap(48.px)
                }
            },
        ) {
            Section {
                card {
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.Flex)
                                flexDirection(FlexDirection.Column)
                                alignItems(AlignItems.Center)
                                gap(20.px)
                            }
                        }
                    ) {
                        Div {
                            H2(
                                attrs = {
                                    style {
                                        fontSize(24.px)
                                        fontWeight(700)
                                        textAlign("center")
                                    }
                                }
                            ) {
                                Text(
                                    "あなたのトリタイプ：",
                                )
                            }
                        }
                        Img(
                            src = "./images/penguin.png",
                            attrs = {
                                style {
                                    width(100.percent)
                                    maxWidth(500.px)
                                }
                            }
                        )
                        Div(
                            attrs = {
                                style {
                                    display(DisplayStyle.Flex)
                                    flexDirection(FlexDirection.Column)
                                    alignItems(AlignItems.Center)
                                    gap(40.px)
                                }
                            }
                        ) {
                            P(
                                attrs = {
                                    style {
                                        whiteSpace("pre-line")
                                        fontSize(18.px)
                                    }
                                }
                            ) {
                                Text(
                                    "どんなインシデントが起きても動じず冷静に対処できる。\n" +
                                            "そんなあなたは\n\n"
                                )
                                Span(
                                    attrs = {
                                        style {
                                            fontSize(32.px)
                                            fontWeight(700)
                                        }
                                    }
                                ) {
                                    Text("「ハシビロコウ」")
                                }
                                Text(
                                    "タイプ\n\n狙った獲物が、現れるまで、数時間も動きを止めることができるトリで、その動じない姿はまさに頼れるシニアなエンジニア。\n" +
                                            "\n" +
                                            "関東では、上野動物園、千葉市動物公園で見ることができます。"
                                )
                            }
                            xShareButton()
                        }
                    }
                }
            }
            Section(
                attrs = {
                    style {
                        width(100.percent)
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        alignItems(AlignItems.Center)
                        gap(20.px)
                    }
                }

            ) {
                H2(
                    attrs = {
                        style {
                            fontSize(24.px)
                            fontWeight(700)
                            textAlign("center")
                            color(Color.white)
                        }
                    }
                ) {
                    Text("動じないエンジニア大募集！")
                }
                A(
                    href = "https://example.com",
                    attrs = {
                        target(ATarget.Blank)
                    }
                ) {
                    Img(
                        src = "./images/banner.png",
                        alt = "",
                        attrs = {
                            style {
                                width(100.percent)
                                borderRadius(16.px)
                                property(
                                    "box-shadow",
                                    "0px 4px 4px rgba(0, 0, 0, 0.25), 0px 8px 6px rgba(0, 0, 0, 0.10)"
                                )
                            }
                        }

                    )
                }

            }
            button(
                onClick = onClickBack,
                size = ButtonSize.NORMAL
            ) {
                Text("TOPに戻る")
            }

        }
    }
}