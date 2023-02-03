
settings.gradle
build.gradle

# How to build
./gradlew build

# Built application
> ls build/libs
> serviceA-plain.jar // jar without main manifest attribute 
>                                   // so doesn't know main class to start application
> serviceA.jar       // runnable jar

# How to run
java -jar build/libs/serviceA.jar 


# OpenApi Page
http://localhost:8080/swagger-ui/index.html