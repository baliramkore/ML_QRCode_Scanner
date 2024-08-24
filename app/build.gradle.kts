plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.rbk.ml_qrscanner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rbk.ml_qrscanner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Barcode scanning without google play services
    implementation("com.google.mlkit:barcode-scanning:17.3.0")

    //Using Google play services
    implementation("com.google.android.gms:play-services-mlkit-barcode-scanning:18.3.1")


    implementation ("androidx.camera:camera-core:1.2.2")
    implementation ("androidx.camera:camera-camera2:1.2.2")
    implementation ("androidx.camera:camera-lifecycle:1.2.2")
    implementation ("androidx.camera:camera-video:1.2.2")
    implementation ("androidx.camera:camera-view:1.2.2")
    implementation ("androidx.camera:camera-extensions:1.2.2")

    implementation ("androidx.concurrent:concurrent-listenablefuture:1.0.0-beta01")

}