plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-kapt")
    id("maven-publish")
    id("de.jensklingenberg.ktorfit")
}

android {
    namespace = "org.mifos.core"
    compileSdk = 34
    buildToolsVersion = "28.0.3"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
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

    // rxJava dependency
    implementation(libs.rxjava)

    // Square dependencies
    implementation("com.squareup.retrofit2:retrofit:2.9.0") {
        exclude(module = "okhttp")
    }
    implementation(libs.converter.gson)
    implementation(libs.converter.scalars)
    implementation(libs.adapter.rxjava)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    // Shared Preferences dependency
    implementation(libs.preference.ktx)

    // fineractClient dependency
    implementation(libs.fineract.client.cmp)

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

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.openMF"
            artifactId = "mifos-android-sdk-arch"
            version = "1.0.6"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
