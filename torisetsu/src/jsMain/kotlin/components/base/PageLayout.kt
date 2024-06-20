package components.base

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Main

@Composable
fun PageLayout(
    content: @Composable() () -> Unit
) {
    return Div(
        attrs = { classes(PageLayoutStyle.rootElm) }
    ) {
        Div(
            attrs = { classes(PageLayoutStyle.wrapper) }
        ) {
            Div(
                attrs = { classes(PageLayoutStyle.header) }
            ) {
                Img(
                    src = "./images/service_logo.svg",
                    alt = "エンジニア トリ診断",
                    attrs = { classes(PageLayoutStyle.titleLogo) }
                )
                Img(
                    src = "./images/m3_logo_en.svg",
                    alt = "M3 Inc.",
                    attrs = { classes(PageLayoutStyle.m3Logo) }
                )
            }
            Main(
                attrs = { classes(PageLayoutStyle.main) }
            ) {
                content()
            }
        }
    }
}