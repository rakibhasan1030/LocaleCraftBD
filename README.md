# Locale Craft BD [![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/rakibhasan1030/LocaleCraftBD/blob/master/LICENSE) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.rakibhasan1030/bd-navigator/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.rakibhasan1030/bd-navigator/badge.svg)

This initiative focuses on providing fundamental insights into Bangladesh, particularly covering details about its administrative structure in both English and Bengali languages. The aim is to present comprehensive information in a clear and accessible manner for a broad audience.

## Installation

LocaleCraftBD is installed by adding the following dependency to your `build.gradle` file:
```
repositories {
  mavenCentral()
}
```

#### Gradle Groovy DSL
```
dependencies {
  implementation 'io.github.rakibhasan1030:bd-navigator:1.0.1'
}
```

#### Gradle Kotlin DSL
```kotlin
dependencies {
  implementation("io.github.rakibhasan1030:bd-navigator:1.0.1")
}
```

#### Apache Maven
```
<dependency>
  <groupId>io.github.rakibhasan1030</groupId>
  <artifactId>bd-navigator</artifactId>
  <version>1.0.1</version>
  <type>aar</type>
</dependency>
```

## Usage
To begin with LocaleCraftBD you've to simply call the DivisionInfo class, it'll return a list of string which contain all the division list.
<br>Example:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Apply the custom theme defined in LocaleCraftBDTheme
            LocaleCraftBDTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Initialize an instance of DivisionInfo for navigating through divisions
                    val navigator = DivisionInfo()

                    // Log Division List in Bangla and English
                    Log.v("TAG", "Division List in Bangla : ${navigator.getDivisionsBn()}")
                    Log.v("TAG", "Division List in English : ${navigator.getDivisionsEn()}")

                    // Log District List in Bangla and English
                    Log.v("TAG", "District List in Bangla : ${navigator.getDistrictsBn()}")
                    Log.v("TAG", "District List in English : ${navigator.getDistrictsEn()}")

                    // Log Upazila List in Bangla and English
                    Log.v("TAG", "Upazila List in Bangla : ${navigator.getUpazilasBn()}")
                    Log.v("TAG", "Upazila List in English : ${navigator.getUpazilasEn()}")

                    // Log Union List in Bangla and English along with the count
                    Log.v("TAG", "Union List in Bangla : ${navigator.getUnionsBn().size}")
                    Log.v("TAG", "Union List in English : ${navigator.getUnionsEn()}")
                }
            }
        }
    }
}
```




