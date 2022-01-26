plugins {
    kotlin("jvm") version "1.5.10"
}

repositories {
    mavenCentral()
}

subprojects {
    apply {
        plugin("kotlin")
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
        testImplementation(kotlin("test-junit"))
    }
}