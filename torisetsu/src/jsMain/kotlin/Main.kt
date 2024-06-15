import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.dom.*

fun main() {
    renderComposable(rootElementId = "root") {
        Div { Text("hello world by torisetsu.") }
    }
}