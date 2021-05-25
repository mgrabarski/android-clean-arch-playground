object BuildConfigVersions {
    val compileSdkVersion = 30
    val minSdkVersion = 16
    val targetSdkVersion = 30
    val versionCode = 1
    val versionName = "0.0.1"
}

object Versions {
    val gradle = "4.2.0"
    val kotlin = "1.5.0"
    val coreKtx = "1.3.2"
    val appCompat = "1.2.0"
    val materialComponents = "1.3.0"
    val constraintlayout = "2.0.4"
    val kotest = "4.4.3"
    val jodaTime = "2.10.10"
    val koin = "3.0.1"
    val mockk = "1.11.0"
    val coroutines = "1.5.0-RC"
    val lifecycle = "2.3.1"
}

object KotlinDependencies {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
}

object LibrariesDependencies {
    val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    val jodaTime = "joda-time:joda-time:${Versions.jodaTime}"
}

object AndroidDependencies {
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val material = "com.google.android.material:material:${Versions.materialComponents}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
}

object UnitTestsDependencies {
    val kotestRunner = "io.kotest:kotest-runner-junit5-jvm:${Versions.kotest}"
    val kotestFrameworkEngine = "io.kotest:kotest-framework-engine-jvm:${Versions.kotest}"
    val kotestCore = "io.kotest:kotest-assertions-core:${Versions.kotest}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
}