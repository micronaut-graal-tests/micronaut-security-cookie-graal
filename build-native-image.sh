./gradlew assemble
native-image --no-fallback --class-path build/libs/micronaut-security-cookie-graal-*-all.jar
