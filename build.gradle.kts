// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    //add the hilt-android-gradle-plugin plugin to your project's root build.gradle file:
    id("com.google.dagger.hilt.android") version "2.44" apply false
//    id ("androidx.navigation.safeargs") version "2.5.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        val nav_version = "2.7.7"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
