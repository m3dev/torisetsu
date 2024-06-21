package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun XShareButton() {
    A(
        href = "https://twitter.com/intent/tweet?text=私のトリタイプはハシビロコウです！&url=https://m3dev.github.io/torisetsu&hashtags=トリタイプ診断",
        attrs = {
            target(ATarget.Blank)
            classes(XShareButtonStyle.rootElm)
        }
    ) {
        Img(
            src = "/icons/x_icon.svg",
            attrs = { classes(XShareButtonStyle.icon) }
        )
        Div(
            attrs = { classes(XShareButtonStyle.text) }
        ) {
            Text("Xでシェア")
        }
    }
}
