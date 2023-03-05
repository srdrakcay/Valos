plugins {
    id(BuildPlugins.AndroidLibrary)
    id(BuildPlugins.kotlinJetBrains)
}

android {
    namespace = "com.serdar.navigation"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    sourceSets {
        getByName("main").res.srcDirs(
            "$rootDir/navigation/src/main/sharedRes", "build/generated/source/navigation-args"
        )
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}
    dependencies {

        implementation("androidx.core:core-ktx:1.7.0")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.8.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        implementation(project(Modules.Feature))
        api(AndroidLibraries.navigation)
        api(AndroidLibraries.navigationFrag)


    }


