# 1. Use a lightweight Java 21 runtime environment
FROM eclipse-temurin:21-jre-alpine

# 2. Expose the port your Spring Boot app runs on
EXPOSE 8080

# 3. Copy the compiled .jar file into the container
ADD target/ci-cd-github-actions.jar ci-cd-github-actions.jar

# 4. Command to run the application
ENTRYPOINT ["java", "-jar", "/ci-cd-github-actions.jar"]