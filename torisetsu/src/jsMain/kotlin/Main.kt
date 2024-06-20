import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import style.GlobalStyle

enum class Page {
    TOP,
    QUIZ,
    RESULT
}

fun main() {
    renderComposable(rootElementId = "root") {
        Style(GlobalStyle)
        App()
    }
}