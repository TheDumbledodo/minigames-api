plugins {
    java
    minigames.`common-conventions`
    minigames.`publish-conventions`
}

dependencies {
    implementation(project(":common"))

    compileOnly(libs.paper)
}