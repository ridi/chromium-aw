plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    implementation("com.github.jk1:gradle-license-report:1.9")
}
