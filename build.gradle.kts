plugins {
    kotlin("jvm") version "1.6.10"
    id("io.gitlab.arturbosch.detekt").version("1.19.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.19.0")
}