FROM eclipse-temurin:11-jre
COPY target/porsche-project*.jar /usr/src/porsche-project.jar
COPY src/main/resources/application.properties /opt/conf/application.properties
CMD ["java", "-jar", "/usr/src/porsche-project.jar", "--spring.config.location=file:/opt/conf/application.properties"]