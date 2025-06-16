plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlin.serialization).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.composeMultiplatform).apply(false)


    id("de.jensklingenberg.ktorfit") version "2.1.0" apply false

    alias(libs.plugins.dependencyGuard).apply(false)
    alias(libs.plugins.spotless).apply(false)

}


tasks.register<Delete>("cleanTask") {
    delete(rootProject.buildDir)

}
