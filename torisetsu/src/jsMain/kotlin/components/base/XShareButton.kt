package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun XShareButton() {
    A(
        href = "https://twitter.com/intent/tweet?text=私のトリタイプはハシビロコウです！&url=https://example.com&hashtags=トリタイプ診断",
        attrs = {
            target(ATarget.Blank)
            style {
                backgroundColor(rgb(0, 0, 0))
                color(Color.white)
                padding(20.px, 32.px)
                borderRadius(999.px)
                textDecoration("none")
                width(160.px)
                display(DisplayStyle.Flex)
                alignItems(AlignItems.Center)
                gap(10.px)
                justifyContent(JustifyContent.Center)
            }
        }

    ) {
        Img(
            src = "/icons/x_icon.svg",
            attrs = {
                style {
                    width(20.px)
                    flexShrink(0)
                    property("aspect-ratio", "1")
                }
            }

        )
        Div(
            attrs = {
                style {
                    flexShrink(0)
                }
            }
        ) {
            Text("Xでシェア")
        }
    }
}