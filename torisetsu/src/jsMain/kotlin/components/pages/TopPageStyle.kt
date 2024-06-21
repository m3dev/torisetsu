package components.pages

import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import style.GlobalStyle
import style.forMobile

object TopPageStyle : StyleSheet(GlobalStyle) {
    val rootElm by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        width(100.percent)
        height(100.percent)
        padding(100.px, 32.px)

        forMobile {
            padding(64.px, 16.px)
        }
    }

    val heroSection by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        gap(30.px)
        width(700.px)
        maxWidth(90.percent)
    }

    val heroImage by style {
        width(700.px)
        maxWidth(100.percent)
    }

    val catchphraseSection by style {
        fontSize(20.px)
        color(Color.white)
        fontWeight(700)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.SpaceBetween)
        gap(32.px)

        forMobile {
            fontSize(16.px)
            flexDirection(FlexDirection.Column)
        }
    }

    val by_m3 by style {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        gap(16.px)
    }

    val catchphraseText by style {
        flexGrow(1)
    }

    val footer by style {
        position(Position.Fixed)
        bottom(0.px)
        left(0.px)
        right(0.px)
        background("#0F0069")
        height(68.px)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)
        property("z-index", -1)
    }

    val footerText by style {
        color(Color.white)
        fontSize(16.px)

        forMobile {
            fontSize(12.px)
        }
    }

    val overlayBirds by style {
        position(Position.Fixed)
        top(0.px)
        left(0.px)
        right(0.px)
        bottom(0.px)
        property("pointer-event", "none")
        property("z-index", -1)
        maxWidth(2000.px)
    }

    val leftBirdsWrapper by style {
        position(Position.Fixed)
        left(0.px)
        bottom(400.px)
        property("width", "calc((100vw - 700px) / 2)")
        maxHeight(70.vh)
        height(100.percent)
        maxWidth(850.px)

        media(mediaMaxWidth(1650.px)) {
            self style {
                bottom(300.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }

        media(mediaMaxWidth(1200.px)) {
            self style {
                bottom(250.px)
                width(50.percent)
            }
        }
        media(mediaMaxWidth(600.px)) {
            self style {
                bottom(180.px)
            }
        }
    }

    @OptIn(ExperimentalComposeWebApi::class)
    private val rotationKeyframes by keyframes {
        each(0.percent) { transform { rotate(0.deg) } }
        each(10.percent) { transform { rotate(360.deg) } }
        each(100.percent) { transform { rotate(360.deg) } }
    }

    val leftBirds by style {
        position(Position.Absolute)
        bottom(0.px)
        width(100.percent)
        property("object-fit", "contain")
        property("object-position", "right")

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(15.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }
    }

    val leftBird1 by style {
        position(Position.Absolute)
        bottom(340.px)
        left(0.px)
        width(60.percent)
        maxWidth(1000.px)
        property("object-fit", "contain")
        property("object-position", "right")

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(5.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }

        media(mediaMaxWidth(1000.px)) {
            self style {
                bottom(250.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }

        media(mediaMaxWidth(640.px)) {
            self style {
                bottom(150.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }
    }

    val leftBird3 by style {
        position(Position.Absolute)
        bottom(0.px)
        right(0.px)
        width(80.percent)
        maxWidth(1000.px)
        property("object-fit", "contain")
        property("object-position", "right")

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(10.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }
    }

    val rightBirdsWrapper by style {
        position(Position.Fixed)
        right(0.px)
        bottom(400.px)
        property("width", "calc((100vw - 700px) / 2)")
        maxHeight(70.vh)
        maxWidth(850.px)

        media(mediaMaxWidth(1650.px)) {
            self style {
                bottom(300.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }
        media(mediaMaxWidth(1200.px)) {
            self style {
                bottom(250.px)
                width(50.percent)
            }
        }
        media(mediaMaxWidth(600.px)) {
            self style {
                bottom(180.px)
            }
        }
    }

    val rightBirds by style {
        property("object-fit", "contain")
        property("object-position", "left")
        position(Position.Absolute)
        bottom(0.px)
        width(100.percent)
        maxWidth(2000.px)

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(25.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }
    }

    val rightBird13 by style {
        position(Position.Absolute)
        bottom(70.px)
        left(0.px)
        width(65.percent)
        maxWidth(1000.px)

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(20.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }
    }

    val rightBird15 by style {
        position(Position.Absolute)
        bottom(320.px)
        right(25.percent)
        width(60.percent)
        maxWidth(1000.px)


        media(mediaMaxWidth(1500.px)) {
            self style {
                bottom(240.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }

        animation(rotationKeyframes) {
            duration(50.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
            delay(30.s)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }

        media(mediaMaxWidth(640.px)) {
            self style {
                bottom(160.px)
                maxWidth(500.px)
                width(50.percent)
            }
        }
    }

    @OptIn(ExperimentalComposeWebApi::class)
    private val vibrateKeyframes by keyframes {
        each(0.percent) { transform { translateX(-50.percent) } }
        each(10.percent) { transform { translateX(-49.percent) } }
        each(20.percent) { transform { translateX(-51.percent) } }
        each(30.percent) { transform { translateX(-49.percent) } }
        each(40.percent) { transform { translateX(-51.percent) } }
        each(50.percent) { transform { translateX(-49.percent) } }
        each(60.percent) { transform { translateX(-51.percent) } }
        each(70.percent) { transform { translateX(-49.percent) } }
        each(80.percent) { transform { translateX(-51.percent) } }
        each(90.percent) { transform { translateX(-49.percent) } }
        each(100.percent) { transform { translateX(-50.percent) } }
    }

    val centerBirds by style {
        position(Position.Fixed)
        bottom(20.px) // footerの高さ分あげる
        width(100.percent)
        minWidth(1500.px)
        maxWidth(3000.px)
        left(50.percent)
        property("transform", "translateX(-50%)")
        property("object-fit", "cover")

        media(mediaMaxWidth(600.px)) {
            self style {
                minWidth(1000.px)
            }
        }

        animation(vibrateKeyframes) {
            duration(20.s)
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(null)
        }
        media("prefers-reduced-motion") {
            self style {
                property("animation-name", "none")
            }
        }
    }
}