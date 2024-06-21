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
        Div(attrs = { classes(TopPageStyle.leftBirdsWrapper) }) {
            Img(
                src = "images/tori_left_2.png",
                alt = "",
                attrs = { classes(TopPageStyle.leftBirds) }
            )
            Img(
                src = "images/tori1.png",
                alt = "",
                attrs = { classes(TopPageStyle.leftBird1) }
            )
            Img(
                src = "images/tori3.png",
                alt = "",
                attrs = { classes(TopPageStyle.leftBird3) }
            )

        }
        Div(attrs = { classes(TopPageStyle.rightBirdsWrapper) }) {
            Img(
                src = "images/tori_right_2.png",
                alt = "",
                attrs = { classes(TopPageStyle.rightBirds) }
            )
            Img(
                src = "images/tori13.png",
                alt = "",
                attrs = { classes(TopPageStyle.rightBird13) }
            )
            Img(
                src = "images/tori15.png",
                alt = "",
                attrs = { classes(TopPageStyle.rightBird15) }
            )
        }
        Img(
            src = "images/tori_center.png",
            alt = "",
            attrs = { classes(TopPageStyle.centerBirds) }
        )
    }
}