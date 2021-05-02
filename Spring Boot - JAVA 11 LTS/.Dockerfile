FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
EXPOSE 8080
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "/target/demo-0.0.1-SNAPSHOT.jar"]
