import androidx.compose.runtime.*
import components.pages.QuizPage
import components.pages.ResultPage
import components.pages.TopPage
import core.ComposeQuiz
import core.ComposeResult
import core.Quiz
import core.Result
import kotlinx.browser.window

@Composable
fun App() {
    var currentPage by remember { mutableStateOf(Page.TOP) }
    val quiz: Quiz by remember { mutableStateOf(ComposeQuiz()) }
    val result: Result by remember { mutableStateOf(ComposeResult()) }

    if (window.location.pathname.replace("/", "") in listOf("torisetsu", "", "index.html")) {
        when (currentPage) {
            Page.TOP -> {
                TopPage(
                    onClickStart = { currentPage = Page.QUIZ }
                )
            }
            Page.QUIZ -> {
                QuizPage(quiz = quiz)
            }
        }
    } else {
        ResultPage(
            diagnosis = result.getDiagnosis(window.location.pathname),
            onClickBack = {
                quiz.reset()
                window.location.href = "/torisetsu/"
            }
        )
    }

}