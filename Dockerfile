# Stage 0, "build-stage", based on maven jdk 11, to build and compile the backend
FROM maven:3.6.0-jdk-11-slim
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
COPY ojdbc8.jar /usr/src/app
RUN mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=18.3.0.0 -Dpackaging=jar -Dfile=/usr/src/app/ojdbc8.jar -DgeneratePom=true
RUN mvn -f /usr/src/app/pom.xml clean package

# Stage 1, based on tomcat, with deployed war
FROM tomcat:9.0.13-jre11-slim
# Copies create file to tomcat installation directory with evaluations.war name
# The name is very important as it is used by the frontend to access the app
COPY --from=0 /usr/src/app/target/*.war /usr/local/tomcat/webapps/masterthesis.war
EXPOSE 8080