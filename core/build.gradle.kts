import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlin.serialization)
    id("maven-publish")
    alias(libs.plugins.dependencyGuard)
    alias(libs.plugins.detekt)
    alias(libs.plugins.spotless)
}

android {
    namespace = "org.mifos.core"
    compileSdk = 35
    buildToolsVersion = "35.0.0"
}


kotlin {
    jvm()
    androidTarget()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "core"
            isStatic = true
        }
    }

    js(IR){
        nodejs()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.client.serialization)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.client.auth)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.ktor.client.json)
            implementation(libs.ktorfit.lib)
            implementation(libs.ktorfit.converters.call)
            implementation(libs.ktorfit.converters.flow)
            implementation(libs.niyajali.fineract.client.kmp)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

    }
}

dependencyGuard {
    configuration("releaseRuntimeClasspath")
}
