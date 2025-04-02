plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlin.serialization).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)

    id("de.jensklingenberg.ktorfit") version "2.1.0" apply false

}


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)

}
