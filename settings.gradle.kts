dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "QuicklyTanking"
include(":modulesBase:libBase")
include(":modulesPublic:common")
include(":modulesCore:main")
include(":modulesCore:login")
