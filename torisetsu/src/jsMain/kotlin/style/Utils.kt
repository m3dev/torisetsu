package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector

fun <TBuilder> GenericStyleSheetBuilder<TBuilder>.mobile(
    cssSelector: CSSSelector,
    rulesBuild: TBuilder.() -> Unit
) {
    media(mediaMaxWidth(640.px)) {
        cssSelector style rulesBuild
    }
}

fun CSSBuilder.forMobile(builder: CSSBuilder.() -> Unit) {
    mobile(self, builder)
}


fun <TBuilder> GenericStyleSheetBuilder<TBuilder>.dataAttr(
    selector: String,
    value: String,
    cssSelector: CSSSelector,
    rulesBuild: TBuilder.() -> Unit
) {
    (cssSelector + attrEquals("data-$selector", value, true)) style {
        rulesBuild()
    }
}

fun CSSBuilder.data(selector: String, value: String, builder: CSSBuilder.() -> Unit) {
//    (self + attrEquals(selector, value, true)) style {
//        builder()
//    }
    dataAttr(selector, value, self, builder)
}