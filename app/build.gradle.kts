plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

//    //Room
//    kotlin("kapt")
//    id("androidx.navigation.safeargs.kotlin")
//
//    //parcelize for Parcelable (optional)
//    id("kotlin-parcelize")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.pokeapi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pokeapi"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

}

// Định nghĩa các biến phiên bản
val retrofitVersion = "2.9.0"
val navVersion = "2.7.7"
val lifecycleVersion = "2.4.0-alpha01"
val roomVersion = "2.4.0-alpha01"
val coroutinesVersion = "1.3.9"
val hiltVersion = "2.44"
val glideVersion = "4.12.0"

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    //    // Dagger-Hilt
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    kapt("com.google.dagger:hilt-compiler:$hiltVersion")

        // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")

//
//    // Navigation Components
//    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
//    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")
//
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion") // Added for runtime lifecycle support


//    // Architecture Components
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion") // Added for runtime lifecycle support
//
//    // Room Persistence Library
//    implementation("androidx.room:room-runtime:$roomVersion")
//    implementation("androidx.legacy:legacy-support-v4:1.0.0")
//    kapt("androidx.room:room-compiler:$roomVersion")
//    implementation("androidx.room:room-ktx:$roomVersion") // Support for Coroutines with Room
//

    // Glide
    implementation("com.github.bumptech.glide:glide:$glideVersion")
    kapt("com.github.bumptech.glide:compiler:$glideVersion")
//
//    // Circular Imgview
//    implementation("com.mikhaellopez:circularimageview:4.2.0")

}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}