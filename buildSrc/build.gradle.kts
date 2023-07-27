plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.stdlib.jdk8)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.gradle.kotlin.dsl.plugins)
    implementation(libs.dokka.gradle.plugin)
    implementation(libs.nexus.publish.gradle.plugin)
    implementation(libs.reckon.gradle.plugin)

    constraints {
        implementation(libs.jackson.databind)
        implementation(libs.jackson.module.kotlin)
    }

    /*
     * Workaround for https://github.com/gradle/gradle/issues/15383:
     * Make version catalogs accessible from precompiled script plugins.
     */
    implementation(files(project.libs.javaClass.superclass.protectionDomain.codeSource.location))
}
