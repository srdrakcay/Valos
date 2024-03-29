// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.5.3"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
plugins {
    id (BuildPlugins.androidApplication) version "7.4.2" apply false
    id (BuildPlugins.AndroidLibrary) version "7.4.2" apply false
    id (BuildPlugins.kotlinJetBrains) version "1.7.0" apply false
    id (BuildPlugins.kotlinJvm)  version "1.7.20" apply false
    id(BuildPlugins.Hilt) version "2.44" apply false


}