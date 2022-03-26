# select parent image
FROM maven:latest

# copy the source tree and the pom.xml to our new container
COPY ./ ./

# package our application code
RUN mvn clean package

EXPOSE 8080

# set the startup command to execute the jar
CMD ["java", "-jar", "target/my_spring_api-0.0.1-SNAPSHOT.jar"]