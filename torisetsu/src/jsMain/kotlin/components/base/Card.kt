package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div

@Composable
fun Card(
    content: @Composable() () -> Unit
) {
    Div(attrs = { classes(CardStyle.rootElm) }) {
        content()
    }
}