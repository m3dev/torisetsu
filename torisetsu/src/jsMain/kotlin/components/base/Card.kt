package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun card(
    content: @Composable() () -> Unit
) {
    Div(
        attrs = {
            style {
                padding(32.px)
                backgroundColor(rgb(255, 255, 255))
                borderRadius(16.px)
                property("box-shadow", "0px 4px 4px rgba(0, 0, 0, 0.25), 0px 8px 6px rgba(0, 0, 0, 0.10)")

            }
        }
    ) {
        content()
    }
}