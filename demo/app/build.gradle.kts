import com.ridi.awdemo.Constants

plugins {
    id("com.android.application")
    id("de.undercouch.download")
    id("kotlin-android")
    id("kotlin-kapt")
}

// #1 Download chromium-aw from github releases.
val downloadChromiumAwTaskName = "chromium-aw@aar"
tasks.register<de.undercouch.gradle.tasks.download.Download>(downloadChromiumAwTaskName) {
    src("https://github.com/ridi/chromium-aw/releases/download/${Constants.AW_VERSION}/${Constants.AW_AAR_NAME}")
    dest(Constants.AW_AAR_PATH)
    overwrite(true)
    onlyIfModified(true)
}
tasks.matching { it.name != downloadChromiumAwTaskName }
    .all { dependsOn(downloadChromiumAwTaskName) }

android {
    compileSdkVersion(Constants.COMPILE_SDK_VERSION)
    buildToolsVersion = Constants.BUILD_TOOLS_VERSION

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
        minSdkVersion(Constants.MIN_SDK_VERSION)
        targetSdkVersion(Constants.TARGET_SDK_VERSION)

        applicationId = "com.ridi.awdemo"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    // #2 Do not compress chromium-aw resources.
    aaptOptions {
        noCompress("bin", "dat", "pak")
    }
}

dependencies {
    implementation("androidx.core:core-ktx:${Constants.ANDROIDX_CORE_VERSION}")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.google.android.material:material:1.3.0")
    // #3 Makes it refer to the locally received `chromium-aw-release.aar`.
    implementation(files(Constants.AW_AAR_PATH))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Constants.KOTLIN_VERSION}")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}
