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

tasks.register<Copy>("copyStaticPages") {
    listOf(
        "aoitori" to "aoitori",
        "index" to "banner",
    ).forEach { (fileName, imageName) ->
        from("src/jsMain/resources/base.html") {
            expand(
                mapOf(
                    "ogpImageName" to "$imageName.png"
                )
            )
            rename("base", fileName)
        }
    }
    into("src/jsMain/resources/")
}

tasks["jsProcessResources"].dependsOn("copyStaticPages")