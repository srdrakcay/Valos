plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinJetBrains)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.DaggerHiltPlugin)
}

android {
    compileSdk = AndroidSDK.target
    namespace = "com.serdar.valos"
    defaultConfig {
        applicationId = "com.serdar.valos"
        minSdk = AndroidSDK.min
        targetSdk = AndroidSDK.target
        versionCode = Releases.versionCode
        versionName = Releases.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    sourceSets {
        getByName("debug").res.srcDirs("$rootDir/navigation/src/main/sharedRes")
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.fragment:fragment-ktx:1.5.5")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    kapt(Libraries.daggerHiltCompiler)
    api(Libraries.daggerHilt)
    api(AndroidLibraries.kotlinCoroutineAndroid)
    api(KotlinLibraries.kotlinCoroutineCore)
    api(AndroidLibraries.lifeCycleViewModel)
    api(AndroidLibraries.lifecycleViewModelExt)
    api(AndroidLibraries.lifecycleRuntime)
    implementation(project(Modules.Data))
    implementation(project(Modules.Feature))


}