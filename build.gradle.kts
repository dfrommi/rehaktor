import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    `maven-publish`
}

group = "io.github.dfrommi"

publishing {
    publications {
        create<MavenPublication>("lib") {
            from(components["java"])
        }
    }
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
    }

    dependencies {
        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

dependencies {
    api("io.github.hap-java:hap:[2.0.7,3)")
}

project(":generator") {
    dependencies {
        implementation("com.squareup:kotlinpoet:1.13.2")
        implementation("com.pinterest:ktlint:0.49.0")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.+")
    }

    task<JavaExec>("generate") {
        mainClass.set("io.github.dfrommi.hapkt.generator.HomekitGeneratorKt")
        args(file("../src/main/kotlin").absolutePath)
        classpath(sourceSets.main.get().runtimeClasspath)
    }
}
