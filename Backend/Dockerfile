# Use Java 21 runtime image
FROM openjdk:21

# Set working directory inside container
WORKDIR /app

# Copy built jar file into container
COPY target/*.jar app.jar

# Expose backend port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]