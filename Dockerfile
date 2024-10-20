# Stage 1: Build the application
FROM gradle:8.7.0-jdk17 AS build
WORKDIR .
COPY . .

# Run the Gradle build with no daemon to avoid memory issues

# Stage 2: Run the application
FROM openjdk:17-jdk

# Copy the built JAR file from the build stage
COPY --from=build /build/libs/Zy2-0.0.1-SNAPSHOT.jar Zy2-0.0.1-SNAPSHOT.jar

# Set the JAVA_HOME environment variable
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk
ENV PATH="$JAVA_HOME/bin:$PATH"

# Expose the port your Spring Boot app will run on
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java","-jar","/Zy2-0.0.1-SNAPSHOT.jar"]