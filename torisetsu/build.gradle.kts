plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("org.jetbrains.compose")
}

group = "me.user"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    // aoitori
    copy {
        from("src/jsMain/resources/base.html")
        into("src/jsMain/resources/aoitori/")
        expand(mapOf(
            "scriptPath" to "..",
            "ogpImageName" to "aoitori.png"
        ))
        rename("base", "index")
    }
    // main
    copy {
        from("src/jsMain/resources/base.html")
        into("src/jsMain/resources/")
        expand(mapOf(
            "scriptPath" to "..",
            "ogpImageName" to "banner.png"
        ))
        rename("base", "index")
    }
}

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

