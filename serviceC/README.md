
settings.gradle
build.gradle

# How to build
./gradlew build

# Built application
> ls build/libs
> serviceC-plain.jar // jar without main manifest attribute 
>                                   // so doesn't know main class to start application
> serviceC.jar       // runnable jar

# How to run
java -jar build/libs/serviceC.jar 


# OpenApi Page
http://localhost:8080/swagger-ui/index.html