pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}
rootProject.name = "template"
include("core_app", "home_app", "cards_app", "statement_app")
