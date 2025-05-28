import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlin.serialization)
    id("maven-publish")
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

    js(IR){
        nodejs()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
//        nodejs {
//            testTask {
//                enabled = false
//            }
//        }
        browser()
    }

    sourceSets{
        commonMain.dependencies {
            implementation(project(":fineract-client"))
        }
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
    implementation(project(":fineract-client"))


    // fineractClient dependency
//    implementation(libs.niyajali.fineract.client.kmp)
}