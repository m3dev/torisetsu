package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button

enum class ButtonSize {
    NORMAL,
    LARGE
}

@Composable
fun button(
    onClick: () -> Unit,
    size: ButtonSize,
    content: @Composable () -> Unit,
) {
    Button(
        attrs = {
            style {
                when (size) {
                    ButtonSize.NORMAL -> {
                        padding(16.px, 36.px)
                        borderRadius(16.px)
                        fontSize(32.px)
                    }

                    ButtonSize.LARGE -> {
                        padding(40.px, 100.px)
                        borderRadius(40.px)
                        fontSize(60.px)
                    }
                }
                backgroundImage("linear-gradient(#5772FF, #0054DD)")
                color(Color.white)
                fontWeight(700)
                property(
                    "box-shadow",
                    "0px 5.13px 5.13px 0px #F9F7F340 inset, 0px -5.13px 5.13px 0px #00000040 inset"
                )
            }
            onClick { onClick() }
        }
    ) {
        content()
    }
}