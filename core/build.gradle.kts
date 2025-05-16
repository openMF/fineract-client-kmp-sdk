plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-kapt")
    id("maven-publish")
    id("de.jensklingenberg.ktorfit")
}

android {
    namespace = "org.mifos.core"
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packaging {
        resources. excludes. add("META-INF/core_release.kotlin_module")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}


kotlin {
    jvmToolchain(21)
    jvm() // For JVM applications
    androidTarget() // For Android
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    js {
        browser()

        binaries.executable()
    }


}


dependencies {
    implementation(libs.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Testing dependency
    androidTestImplementation(libs.truth)

    // Kotlin standard library dependency
    implementation(libs.kotlin.stdlib)


    implementation(libs.converter.gson)


    // fineractClient dependency

//    implementation(libs.fineract.client.kmp)
    implementation(libs.niyajali.fineract.client.kmp)

    // Add Ktorfit
    implementation(libs.ktorfit.lib)

    // Add Ktor dependencies
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.logging)
    implementation(libs.ktor.client.auth)
    implementation(libs.ktor.network.tls.certificates)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.kotlinx.serialization.json)
}

