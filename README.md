# Mongo Java POC

This project was generated with [Spring Initializer](https://start.spring.io/)

# Problems we want to solve

Biggest

* Quicker modeling times
* Easier integration with the DB
* Faster unit testing

Nice to haves

* Global exception handlers

# Tooling

Core

* Java version 21 (LTS)
* Spring 3.2.2 ([latest stable](https://spring.io/projects/spring-boot#support))
* [Spring Web Services](https://spring.io/projects/spring-ws#overview)
* [Lombok](https://projectlombok.org/)

Other notable libraries

* [Quarkus](https://github.com/quarkiverse/quarkus-github-app): For working with GH
* [Flappdoodle](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo): Embedded Mongo DB for testing
* [Agora Principal Library](https://gitlab.laputa.veracode.io/agora/agora-principal-library): Handle Veracocde Principal

## Set up

### SDK
Try using [SDK man](https://sdkman.io/) to swap Java versions easily.

```shell
# Post install
# List versions of Java you can install
sdk list java

# Select one to install. Opt to use it as default.
sdk install java 21.0.2-amzn

# Swap back to different version of Java 
sdk use  java 8.0.402-amzn
```
### Code Style

Google Code Style Setup
* IntelliJ: https://medium.com/swlh/configuring-google-style-guide-for-java-for-intellij-c727af4ef248
* VS Code: https://code.visualstudio.com/docs/java/java-linting

## IntelliJ Users

Enable annotation processing for Lombok
![Screenshot 2024-01-29 at 10.45.11 PM.png](images%2FScreenshot%202024-01-29%20at%2010.45.11%E2%80%AFPM.png)

Set up Gradle to utilize the IDE instead of the command line (dev preference).
![Screenshot 2024-01-30 at 8.13.00 AM.png](images%2FScreenshot%202024-01-30%20at%208.13.00%E2%80%AFAM.png)

Set up Gradle to auto import each dependency you past into the [build.gradle](build.gradle).
![Screenshot 2024-01-30 at 8.20.32 AM.png](images%2FScreenshot%202024-01-30%20at%208.20.32%E2%80%AFAM.png)

## Fire up the engine

First build the project.

```shell
./gradlew clean build
```

Then run it!

```shell
./gradlew bootRun
```
