plugins {
    java
    scala
}

tasks.withType<ScalaCompile>().configureEach {
    scalaCompileOptions.additionalParameters = listOf(
        "-Xunchecked-java-output-version",
        JavaVersion.current().majorVersion,
    )
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.8.3"
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
}