# Fineract Client Kotlin Multiplatform SDK

Fineract Client SDK is a Kotlin-based SDK designed to interact with the Apache Fineract 1.x platform. It basically exposes services to Applications, offering an abstract layer and avoiding the need to construct the client and Services.
Fineract client sdk is built on top of [Fineract client Kmp](https://github.com/openMF/fineract-client-kmp) utilizes its model classes and services.

![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=flat-square&logo=kotlin&logoColor=white)
![Kotlin Multiplatform](https://img.shields.io/badge/Kotlin%20Multiplatform-4c8d3f?style=flat-square&logo=kotlin&logoColor=white)
![Open Source](https://img.shields.io/badge/Open%20Source-Yes-brightgreen)
![GSoC](https://img.shields.io/badge/GSoC-yellow)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![GitHub license](https://img.shields.io/badge/License-MPL_2.0-brightgreen.svg)](https://github.com/openMF/fineract-client-kmp-sdk/tree/main)
[![GitHub release](https://img.shields.io/badge/release-v0.0.1-blue)](https://github.com/openMF/fineract-client-kmp-sdk/releases/)
[![GitHub issues](https://img.shields.io/github/issues/Naereen/StrapDown.js.svg)](https://github.com/openMF/fineract-client-kmp-sdk/issues/)
[![Slack](https://img.shields.io/badge/Slack-4A154B?style=flat-square&logo=slack&logoColor=white)](https://join.slack.com/t/mifos/shared_invite/zt-2wvi9t82t-DuSBdqdQVOY9fsqsLjkKPA)

## Feature


1. Fineract SDK supports Multiple Platforms due to the KtorFit network library.
2. It supports Coroutines and Flows with Suspend functions.
3. Extend [`UserPreferences<USER>`](https://github.com/openMF/mifos-android-sdk-arch/blob/development/core/src/main/java/org/mifos/core/sharedpreference/UserPreferences.kt) and [`BasePreferenceManager`](https://github.com/openMF/mifos-android-sdk-arch/blob/development/core/src/main/java/org/mifos/core/sharedpreference/BasePreferenceManager.kt) classes for handling the preferences tasks.
4. Single point of interaction for all the api services using [BaseApiManager](https://github.com/openMF/mifos-android-sdk-arch/blob/development/core/src/main/java/org/mifos/core/apimanager/BaseApiManager.kt).

## Quickstart Setup

### Installation

Add dependency in the `build.gradle`.

- Kts

  ```kts
    dependencies {
        implementation("com.github.openMF:mifos-android-sdk-arch:$sdk_Version")
    }
  ```

- Groovy
  ```groovy
    dependencies {
        implementation 'com.github.openMF:mifos-android-sdk-arch:$sdk_Version'
    }
  ```

Add this in your root `settings.gradle`.

- Kts

  ```Kotlin
    dependencyResolutionManagement {
        repositories {
            maven {
                setUrl("https://jitpack.io")
            }
        }
    }
  ```

- Groovy

  ```groovy
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
  ```

### Initialization

- Initialize the `BaseApiManager` and create a service to initialize the KtorFit client.

    ```Kotlin
        val baseUrl = PROTOCOL_HTTPS + API_ENDPOINT + API_PATH
        val tenant = "default"
        val username = "mifos"
        val password = "password"
        val baseApiManager = BaseApiManager.getInstance()
        baseApiManager.createService(username, password, baseUrl, tenant, false)
    ```

### Authentication

- Example code to use the Authentication API:

    ```Kotlin
        val req = PostAuthenticationRequest(username = username, password = password)

        lifecycleScope.launch(Dispatchers.IO) {
            val response = baseApiManager.getAuthApi().authenticate(req, true)
            Log.d("Auth Response",response.toString())    
        }
    ```

### Usage Example
- To get Client Details with clientId 1:

    ```Kotlin
        private fun getClient() {
            lifecycleScope.launch(Dispatchers.IO) {
                val response = baseApiManager.getClientsApi().retrieveOne11(1, false)
                Log.d("Client Details Response",response.toString())
            }
        }
    ```

## Architecture

1. The core module in the SDK contains all the API requests written.
2. The entry point to the library is the [BaseApiManager](https://github.com/openMF/mifos-android-sdk-arch/blob/development/core/src/main/java/org/mifos/core/apimanager/BaseApiManager.kt).
3. Use companion object's `getInstance()` function to get the instance of the implementation of `BaseApiManager`.
4. For setting up the services, call `createService(username: String, password: String, baseUrl: String, tenant: String)` method of `BaseApiManager` providing valid credentials.

## Development Setup
Please refer to the  [Development Setup Guide](https://github.com/openMF/fineract-client-kmp-sdk/wiki/Set-up-an-environment) for detailed instructions on configuring the development environment.

## How to Contribute
Thank you for your interest in contributing to the Fineract Client Sdk project by Mifos! We welcome all contributions and encourage you to follow these guidelines to ensure a smooth and efficient collaboration process.
To get started, please refer to the [Contribution Guide](https://github.com/openMF/fineract-client-kmp-sdk/wiki/How-to-Contribute) for detailed instructions on how to contribute to the project.


## Wiki

Please visit our [Wiki](https://github.com/openMF/fineract-client-kmp-sdk/wiki) page for a detailed overview of the project's architecture and guidelines. Explore further to gain a deeper understanding of our project.

## Contributors

Special thanks to the incredible code contributors who continue to drive this project forward.

<a href="https://github.com/openMF/fineract-client-kmp-sdk/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=openMF/fineract-client-kmp-sdk" />
</a>