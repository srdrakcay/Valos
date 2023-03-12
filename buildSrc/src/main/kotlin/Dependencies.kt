

    object Releases {
        val versionCode = 1
        val versionName = "1.0"
    }

    object BuildPlugins {
        //All the build plugins are added here
        const val androidApplication = "com.android.application"
        const val kotlinAndroid = "kotlin-android"
        const val kotlinJetBrains = "org.jetbrains.kotlin.android"
        const val kotlinKapt = "kotlin-kapt"
        const val Hilt = "com.google.dagger.hilt.android"
        const val DaggerHiltPlugin = "dagger.hilt.android.plugin"
        const val NavSafeArgs = "androidx.navigation.safeargs"
        const val NavSafeArgsKt = "androidx.navigation.safeargs.kotlin"
        const val AndroidLibrary = "com.android.library"
        const val ktlint = "org.jlleitschuh.gradle.ktlint"
        const val kotlinJvm = "org.jetbrains.kotlin.jvm"

    }

    object AndroidSDK{
        //minimum, compile and target SDK versions
        const val min = 21
        const val compile = 33
        const val target = compile
    }

    object Modules{
        const val App = ":app"
        const val Common = ":common"
        const val Domain = ":domain"
        const val Data = ":data"
        const val Feature = ":feature"
        const val Navigation = ":navigation"
    }

    object Versions {
        val kotlin = "1.3.21"
        val gradle = "3.3.2"
        val retrofit = "2.9.0"
        val retrofitCoroutines = "0.9.2"
        val retrofitGson = "2.9.0"
        val gson = "2.8.8"
        val coroutines = "1.6.0"
        val koin = "1.0.2"
        val timber = "4.7.1"
        val lifecycle = "2.4.0"
        val nav = "2.5.3"
        val room = "2.5.0"
        val safeArgs = "2.4.2"
        val glide = "4.9.0"
        val fragmentTest = "1.1.0-alpha06"
        val hilt = "2.44"
    }

    object Libraries {

        val gson = "com.google.code.gson:gson:${Versions.gson}"
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
        val daggerHilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        val daggerHiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"

    }

    object KotlinLibraries {
        val kotlinCoroutineCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object AndroidLibraries {
        // KOTLIN
        val kotlinCoroutineAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

        // ANDROID
        val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"
        val lifecycleViewModelExt = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
        val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
        val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    }

