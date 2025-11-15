plugins {
    java
}

group = "dev.dumble.minigames"
description = "An all-in-one minigames plugin that performs"
version = "${rootProject.ext["fullVersion"]}"

tasks {
    defaultTasks("build")
}

allprojects {
    tasks {
        withType<Jar> {
            archiveBaseName = "${rootProject.name}-${project.name}"
            archiveVersion = version as String
        }
    }
}