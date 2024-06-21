package components.pages

import androidx.compose.runtime.Composable
import components.base.Card
import components.base.PageLayout
import core.Quiz
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun QuizPage(
    quiz: Quiz
) {
    PageLayout {
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
                Text("${quiz.currentQuizNumber.value}問目")
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
                Text(quiz.getQuestionText())
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
            quiz.getAnswerOptions().map { opt ->
                Button(
                    attrs = {
                        onClick {
                            quiz.onClickNext(opt)
                        }
                    },
                ) {
                    Card {
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
                            Text(opt.text)
                        }
                    }
                }
            }
        }
    }
}