import org.gradle.api.JavaVersion

object Versions {
    val java = JavaVersion.VERSION_1_8
    const val bintrayPlugin = "1.8.5"
    const val commonsText = "1.9"
    const val coroutines = "1.3.9"
    const val dependencyManagement = "1.0.10.RELEASE"
    const val dependencyUpdate = "0.33.0"
    const val dokka = "1.4.10"
    const val dom4j = "2.1.3"
    const val graal = "20.2.0"
    const val hamcrest = "1.3"
    const val hamkrest = "1.8.0.1"
    const val hocon = "1.4.0"
    const val jacksonMinor = "2.11"
    const val jackson = "$jacksonMinor.3"
    const val jacoco = "0.8.6"
    const val jaxen = "1.2.0"
    const val jgit = "5.9.0.202009080501-r"
    const val jmh = "1.25.2"
    const val jmhPlugin = "0.5.2"
    const val junit = "5.7.0"
    const val junitPlatform = "1.7.0"
    const val kotlin = "1.4.10"
    const val kotlinApi = "1.3"
    const val reflections = "0.9.12"
    const val slf4j = "1.7.30"
    const val spark = "2.9.2"
    const val spek = "1.2.1"
    const val spotless = "5.6.1"
    const val taskTree = "1.5"
    const val toml4j = "0.7.2"
    const val yaml = "1.27"

    const val googleJavaFormat = "1.7"
    const val ktlint = "0.39.0"
}


fun String?.withColon() = this?.let { ":$this" } ?: ""

fun kotlin(module: String, version: String? = null) =
    "org.jetbrains.kotlin:kotlin-$module${version.withColon()}"

fun spek(module: String, version: String? = null) =
    "org.jetbrains.spek:spek-$module${version.withColon()}"

fun jackson(scope: String, module: String, version: String? = null) =
    "com.fasterxml.jackson.$scope:jackson-$scope-$module${version.withColon()}"

fun jacksonCore(module: String = "core", version: String? = null) =
    "com.fasterxml.jackson.core:jackson-$module${version.withColon()}"

fun junit(scope: String, module: String, version: String? = null) =
    "org.junit.$scope:junit-$scope-$module${version.withColon()}"
