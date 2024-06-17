import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import components.pages.quizPage
import components.pages.resultPage
import components.pages.topPage
import core.ComposeQuiz
import core.ComposeResult
import core.Quiz
import core.Result
import org.jetbrains.compose.web.renderComposable

enum class Page {
    TOP,
    QUIZ,
    RESULT
}

fun main() {
    renderComposable(rootElementId = "root") {
        var resultId by remember { mutableStateOf(0) }
        var currentPage by remember { mutableStateOf(Page.TOP) }
        val quiz: Quiz by remember { mutableStateOf(ComposeQuiz()) }
        val result: Result by remember { mutableStateOf(ComposeResult()) }

        when (currentPage) {
            Page.TOP -> topPage(
                onClickStart = { currentPage = Page.QUIZ }
            )

            Page.QUIZ -> quizPage(
                quiz = quiz,
                onClickFinish = { nextId: Int ->
                    resultId = nextId
                    currentPage = Page.RESULT
                }
            )

            Page.RESULT -> resultPage(
                diagnosis = result.getDiagnosis(resultId),
                onClickBack = {
                    quiz.reset()
                    resultId = 0
                    currentPage = Page.TOP
                }
            )
        }

    }
}