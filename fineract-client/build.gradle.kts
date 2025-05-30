import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */


plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kover)
    alias(libs.plugins.dokka)
    id("kotlinx-serialization")
    alias(libs.plugins.ksp)
    alias(libs.plugins.ktorfit)
}

android {
    namespace = "org.mifos.fineract"
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packaging {
        resources.excludes.add("META-INF/core_release.kotlin_module")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "fineract-client"
            isStatic = true
        }
    }

    jvm()

    js(IR) {
        nodejs()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.datetime)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.json)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.client.serialization)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.client.auth)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.ktorfit.lib)
            implementation(libs.ktorfit.converters.call)
            implementation(libs.ktorfit.converters.flow)
        }
    }
}

dependencies {
    implementation(libs.androidx.ui.android)
    implementation(libs.firebase.crashlytics.buildtools)
    add("kspCommonMainMetadata", libs.ktorfit.ksp)
    add("kspJvm", libs.ktorfit.ksp)
    add("kspIosX64", libs.ktorfit.ksp)
    add("kspIosArm64", libs.ktorfit.ksp)
    add("kspIosSimulatorArm64", libs.ktorfit.ksp)
}

tasks.configureEach {
    if (name.startsWith("kspKotlin") && name != "kspCommonMainKotlinMetadata") {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}
tasks.configureEach {
    if (name.startsWith("kspDebugKotlin") && name != "kspCommonMainKotlinMetadata") {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}

//tasks.named("sourcesJar").configure {
//    dependsOn(tasks.named("kspCommonMainKotlinMetadata"))
//}

// Maven publishing configuration
//val artifactId = "fineract-client-kmp"
//val mavenGroup: String by project
//val defaultVersion: String by project
//val currentVersion = System.getenv("PACKAGE_VERSION") ?: defaultVersion
