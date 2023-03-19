rootProject.name = "otus.kotlin"

pluginManagement{
    plugins{
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
    }
}


include("m1l1")