package components.pages

import androidx.compose.runtime.Composable
import components.base.card
import components.base.pageLayout
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

val answerOptions = listOf(
    "ほとんど触らない",
    "100回以下",
    "100回以上"
)

@Composable
fun quizPage(
    onClickFinish: () -> Unit,
) {
    pageLayout {
        Div(
            attrs = {
                style {
                    width(100.percent)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    alignItems(AlignItems.FlexStart)
                    gap(12.px)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        color(Color.white)
                        fontWeight(700)
                        fontSize(20.px)
                    }
                }
            ) {
                Text("1/10")
            }
            Div(
                attrs = {
                    style {
                        color(Color.white)
                        fontWeight(700)
                        fontSize(32.px)
                    }
                }
            ) {
                Text("X（旧Twitter）を一日どのくらい触っている?")
            }
        }
        Div(
            attrs =
            {
                style {
                    marginTop(48.px)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    gap(20.px)
                }
            }
        ) {
            answerOptions.map {
                Button(
                    attrs = {
                        // TODO: 次の問題へ進むように
                        onClick { onClickFinish() }
                    },
                ) {
                    card {
                        Div(
                            attrs = {
                                style {
                                    color(Color.black)
                                    fontWeight(700)
                                    fontSize(24.px)
                                    textAlign("center")
                                }
                            }
                        ) {
                            Text(it)
                        }
                    }
                }
            }
        }
    }
}