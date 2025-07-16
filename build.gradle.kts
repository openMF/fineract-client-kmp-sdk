/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.dependencyGuard) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.spotless) apply true
}

object DynamicVersion {
    fun setDynamicVersion(file: File, version: String) {
        val cleanedVersion = version.split('+')[0]
        file.writeText(cleanedVersion)
    }
}

tasks.register("versionFile") {
    val file = File(projectDir, "version.txt")

    DynamicVersion.setDynamicVersion(file, project.version.toString())
}

private val ktlintVersion = "1.0.1"
spotless {
    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**/*.kt")
        targetExclude("spotless/copyright.kt")
        ktlint(ktlintVersion).editorConfigOverride(
            mapOf("android" to "true"),
        )
        licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
    }

    format("kts") {
        target("**/*.kts")
        targetExclude("**/build/**/*.kts")
        targetExclude("spotless/copyright.kts")
        // Look for the first line that doesn't have a block comment (assumed to be the license)
        licenseHeaderFile(rootProject.file("spotless/copyright.kts"), "(^(?![\\/ ]\\*).*$)")
    }

    format("xml") {
        target("**/*.xml")
        targetExclude("**/build/**/*.xml")
        targetExclude("spotless/copyright.xml")
        // Look for the first XML tag that isn't a comment (<!--) or the xml declaration (<?xml)
        licenseHeaderFile(rootProject.file("spotless/copyright.xml"), "(<[^!?])")
    }
}
