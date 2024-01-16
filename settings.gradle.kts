rootProject.name="fern-fable"

pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings

    repositories {
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
    }
    
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
