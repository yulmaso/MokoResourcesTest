plugins {
    alias(libs.plugins.mokoResources)
    alias(libs.plugins.multiplatform)
}

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            api(libs.mokoResources.core)
        }
    }
}

multiplatformResources {
    resourcesPackage.set("org.test.core_res") // required
    resourcesClassName.set("SharedRes") // optional, default MR
    iosBaseLocalizationRegion.set("ru") // optional, default "en"
}
