import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import components.pages.quizPage
import components.pages.resultPage
import components.pages.topPage
import org.jetbrains.compose.web.renderComposable

enum class Page {
    TOP,
    QUIZ,
    RESULT
}

fun main() {
    renderComposable(rootElementId = "root") {
        var currentPage by remember { mutableStateOf(Page.TOP) }

        when (currentPage) {
            Page.TOP -> topPage(
                onClickStart = { currentPage = Page.QUIZ }
            )

            Page.QUIZ -> quizPage(
                onClickFinish = { currentPage = Page.RESULT }
            )

            Page.RESULT -> resultPage(
                onClickBack = { currentPage = Page.TOP }
            )
        }

    }
}