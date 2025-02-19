rootProject.extra.apply {
    set("androidPluginVersion", "4.1.2")
    set("kotlinVersion", "1.5.10")
    set("playPublisherVersion", "3.4.0-agp4.2")
}

repositories {
    google()
    mavenCentral()
    mavenLocal()
    gradlePluginPortal()
    maven(url = "https://jitpack.io")
    maven {
        url "https://plugins.gradle.org/m2/"
    }
}
