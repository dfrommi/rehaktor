import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
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
    api("com.github.dfrommi:hap-java:08ce3b2")
    api("io.projectreactor:reactor-core:[3.0,)")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:[2.0,)")
}

project(":generator") {
    dependencies {
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.+")
        implementation("com.pinterest:ktlint:0.39.0")
    }

    task<JavaExec>("generate") {
        main = "io.github.dfrommi.rehaktor.generator.HomekitGeneratorKt"
        args(file("../src/main/kotlin").absolutePath)
        classpath(sourceSets.main.get().runtimeClasspath)
    }
}
