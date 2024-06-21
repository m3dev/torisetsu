package components.pages

import androidx.compose.runtime.Composable
import components.base.Button
import components.base.ButtonSize
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun TopPage(
    onClickStart: () -> Unit
) {
    Div(attrs = { classes(TopPageStyle.rootElm) }) {
        Div(
            attrs = {
                classes(TopPageStyle.heroSection)
            }
        ) {
            H1 {
                Img(
                    src = "./images/service_logo.svg",
                    attrs = {
                        classes(TopPageStyle.heroImage)
                    }
                )
            }
            Div {
                P(
                    attrs = {
                        classes(TopPageStyle.catchphraseSection)
                    }
                ) {
                    Div({ classes(TopPageStyle.catchphraseText) }) {
                        Text("トリあえず、やってみればーどうでしょう??")
                    }
                    Div(
                        attrs = {
                            classes(TopPageStyle.by_m3)
                        }
                    ) {
                        Div {
                            Text("by")
                        }
                        Img(
                            src = "images/m3_logo_en.svg",
                            alt = "M3, Inc.",
                        )
                    }

                }
            }
        }
        Div(
            attrs = {
                style {
                    marginTop(60.px)
                }
            }

        ) {
            Button(
                onClick = { onClickStart() },
                size = ButtonSize.LARGE
            ) {
                Text("診断を始める")
            }
        }
        Div(attrs = { classes(TopPageStyle.footer) }) {
            P(attrs = { classes(TopPageStyle.footerText) }) {
                Text("@M3, Inc")
            }
        }
    }

    Div(
        attrs = { classes(TopPageStyle.overlayBirds) }
    ) {
        Img(
            src = "images/tori_left.png",
            alt = "birds",
            attrs = { classes(TopPageStyle.leftBirds) }
        )
        Img(
            src = "images/tori_right.png",
            alt = "birds",
            attrs = { classes(TopPageStyle.rightBirds) }
        )
        Img(
            src = "images/tori_center.png",
            alt = "birds",
            attrs = { classes(TopPageStyle.centerBirds) }
        )
    }
}