
settings.gradle
build.gradle

# How to build
./gradlew build

# Built application
> ls build/libs
> serviceB-plain.jar // jar without main manifest attribute 
>                                   // so doesn't know main class to start application
> serviceB.jar       // runnable jar

# How to run
java -jar build/libs/serviceB.jar 


# OpenApi Page
http://localhost:8080/swagger-ui/index.html