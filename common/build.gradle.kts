plugins {
    java
    minigames.`common-conventions`
    minigames.`publish-conventions`
}

dependencies {
    compileOnly(libs.checkerframework)
    compileOnly(libs.jackson.databind)
}