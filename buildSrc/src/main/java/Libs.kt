package com.example.composemovieapp

import Versions
object Libs {

     //Coil
     object Coil {
          const val coilCompose = "io.coil-kt:coil-compose:" + Versions.coilCompose
     }

     // Compose dependencies
     object Compose {
          const val lifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModelCompose}"
          const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
          const val accompanistFlowLayout = "com.google.accompanist:accompanist-flowlayout:${Versions.accompanistFlowLayout}"
     }

     // Coroutines
     object Coroutines {
          const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
          const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
     }

     // Coroutine Lifecycle Scopes
     object Lifecycle {
          const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
          const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
     }

     // Dagger - Hilt
     object DaggerHilt {
          const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
          const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
          const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hilt}"
          const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hilt}"
          const val hiltWork = "androidx.hilt:hilt-work:${Versions.hilt}"
          const val workRuntimeKtx = "androidx.work:work-runtime-ktx:${Versions.work}"
     }

     // Retrofit
     object Network {
          const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
          const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
          const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
          const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
     }

}
