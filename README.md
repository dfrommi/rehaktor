# Hap-KT

This library is a wrapper around the excellent [HAP-Java](https://github.com/hap-java/HAP-Java) to simplify the
integration in Kotlin-projects.

## Usage

Accessories are built from a list of services, each service having a fixed list of possible characteristics.

A few sample scripts are available

- [switch.main.kts](/samples/switch.main.kts): A minimal example exposing a switch
- [tv.main.kts](/samples/tv.main.kts): A more complex example with a television service

To run the sample scripts, just make sure that a recent version of the Kotlin compiler is available, then just execute
them as a script.
Shortly afterwards, the bridge will show up in the home up and can be added using the PIN printed in the console.

### Gradle

To add the library to a gradle build, you need to...

1. add the Jitpack-repo:
   ```
   maven("https://jitpack.io")
   ```
2. add dependency
   ```
   dependencies {
     implementation("io.github.dfrommi:hap-kt:master-SNAPSHOT")
   } 
   ```

## Services and Characteristics

Characteristics and services are generated from Apple's definition file shipped with `HAS` (Homekit Accessory Simulator)
plus a hand-crafted definition for TV accessory.
This approach was heavily inspired
by [HAP-NodeJS](https://github.com/homebridge/HAP-NodeJS/blob/master/src/lib/gen/import.js).

The list of all services is [here](/src/main/kotlin/io/github/dfrommi/rehaktor/services)
and characteristics [here](/src/main/kotlin/io/github/dfrommi/rehaktor/characteristics).

## Design Principles

The goal of this project is to simplify the usage of HAP-Java in projects using Kotlin.
To achieve this, it has the following underlying design principles:

- Optional characteristics are expressed by optional nullable constructor parameters rather than parameters of
  type `Optional`
- `ObservableValue` class is used as observable value wrapper, as opposed to `CompletableFuture`
- Lambdas are used to trigger actions from Homekit.

On top of that, a few simple wrapper classes are available to define new accessories in a fluent way without the need to
implement interfaces.
