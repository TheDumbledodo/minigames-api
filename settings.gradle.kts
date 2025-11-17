dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}


rootProject.name = "minigames-api"
include("common", "host", "proxy")