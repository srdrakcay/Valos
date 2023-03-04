

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
        const val kotlinParcelize = "kotlin-parcelize"
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
        const val compile = 32
        const val target = compile
    }

    object Modules{
        const val App = ":app"
        const val Common = ":common"
        const val Domain = ":domain"
        const val Data = ":data"
        const val Feature = ":feature"
    }

    object Versions {
        val kotlin = "1.3.21"
        val gradle = "3.3.2"
        val appCompat = "1.1.0-alpha04"
        val coreKtx = "1.1.0-alpha04"
        val constraintLayout = "1.1.3"
        val junit = "4.12"
        val androidTestRunner = "1.1.2-alpha02"
        val espressoCore = "3.2.0-alpha02"
        val retrofit = "2.9.0"
        val retrofitCoroutines = "0.9.2"
        val retrofitGson = "2.9.0"
        val gson = "2.8.8"
        val coroutines = "1.6.0"
        val koin = "1.0.2"
        val timber = "4.7.1"
        val lifecycle = "2.4.0"
        val nav = "2.3.5"
        val room = "2.1.0-alpha06"
        val recyclerview = "1.0.0"
        val safeArgs = "2.4.2"
        val glide = "4.9.0"
        val mockwebserver = "2.7.5"
        val archCoreTest = "2.0.0"
        val androidJunit = "1.1.0"
        val mockk = "1.9.2"
        val fragmentTest = "1.1.0-alpha06"
        val databinding = "3.3.2"
        val hilt = "2.41"
        val okHttp = "4.7.2"
        val sandwich = "1.2.4"
        val activityExt = "1.2.3"
    }

    object Libraries {
        // ROOM
        val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
        val roomKtx = "androidx.room:room-ktx:${Versions.room}"

        // RETROFIT
        val retrofitCoroutineAdapter =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
        val gson = "com.google.code.gson:gson:${Versions.gson}"
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
        val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

        // GLIDE
        val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

        val daggerHilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        val daggerHiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
        val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        val sandwich ="com.github.skydoves:sandwich:${Versions.sandwich}"


    }

    object KotlinLibraries {
        val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
        val kotlinCoroutineCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object AndroidLibraries {
        // KOTLIN
        val kotlinCoroutineAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

        // ANDROID
        val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"
        val lifecycleViewModelExt = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
        val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
        val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
        val activityExt ="androidx.activity:activity-ktx:${Versions.activityExt}"

    }

    object TestLibraries {
        // ANDROID TEST
        val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
        val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
        val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
        val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
        val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"

        // KOIN
        val koin = "org.koin:koin-test:${Versions.koin}"

        // MOCK WEBSERVER
        val mockWebServer = "com.squareup.okhttp:mockwebserver:${Versions.mockwebserver}"

        // MOCK
        val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
        val mockk = "io.mockk:mockk:${Versions.mockk}"

        // COROUTINE
        val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

        // DATA BINDING
        val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"
    }
