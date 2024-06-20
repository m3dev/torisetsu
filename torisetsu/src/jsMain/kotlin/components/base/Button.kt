package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Button

enum class ButtonSize {
    NORMAL,
    LARGE
}

@Composable
fun Button(
    onClick: () -> Unit,
    size: ButtonSize,
    content: @Composable () -> Unit,
) {
    Button(
        attrs = {
            classes(ButtonStyle.rootElm)
            onClick { onClick() }
            attr("data-size", size.name.lowercase())
        }
    ) {
        content()
    }
}