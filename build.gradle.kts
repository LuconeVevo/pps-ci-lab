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

tasks.named<Test>("test") {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.8.3"
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}