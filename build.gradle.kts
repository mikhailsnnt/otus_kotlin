
plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "me.mihailnikitin"
version = "1.0.0"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}