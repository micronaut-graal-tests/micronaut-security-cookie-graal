./gradlew assemble
native-image --no-server --static --no-fallback --class-path build/libs/micronaut-security-cookie-graal-*-all.jar
