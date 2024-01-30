# Mongo Java POC
This project was generated with [Spring Initializer](https://start.spring.io/)

# Tooling
* Java version 21 (LTS)
* Spring 3.2.2 ([latest stable](https://spring.io/projects/spring-boot#support))
* [Spring Web Services](https://spring.io/projects/spring-ws#overview)
* [Lombok](https://projectlombok.org/)

## Set up
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

If you are using IntelliJ, you will want to enable annotation processing to use Lombok. 
![Screenshot 2024-01-29 at 10.45.11 PM.png](images%2FScreenshot%202024-01-29%20at%2010.45.11%E2%80%AFPM.png)

## Fire up the engine
First build the project.
```shell
./gradlew clean build
```

Then run it!
```shell
./gradlew bootRun
```
