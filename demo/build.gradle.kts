import com.ridi.awdemo.Constants

extra["buildToolsVersion"] = Constants.BUILD_TOOLS_VERSION
extra["minSdkVersion"] = Constants.MIN_SDK_VERSION
extra["compileSdkVersion"] = Constants.COMPILE_SDK_VERSION
extra["targetSdkVersion"] = Constants.TARGET_SDK_VERSION
extra["androidXCore"] = Constants.ANDROIDX_CORE_VERSION

buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("de.undercouch:gradle-download-task:4.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${com.ridi.awdemo.Constants.KOTLIN_VERSION}")
    }
}

apply(plugin = "de.undercouch.download")

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}
