plugins {
    java
    minigames.`common-conventions`
    minigames.`publish-conventions`
}

dependencies {
    implementation(project(":core"))

    compileOnly(libs.velocity)
    annotationProcessor(libs.velocity)
}