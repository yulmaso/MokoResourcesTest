plugins {
    alias(libs.plugins.mokoResources)
    alias(libs.plugins.multiplatform)
}

kotlin {
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"

            export(projects.coreRes)
            export(libs.mokoResources.core)
        }
    }

    sourceSets {
        iosMain.dependencies {
            api(projects.coreRes)
        }
    }
}
