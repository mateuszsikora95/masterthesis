# Stage 0, "build-stage", based on maven jdk 11, to build and compile the backend
FROM maven:3.6.0-jdk-11-slim
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

# Stage 1, based on tomcat, with deployed war
FROM tomcat:9.0.13-jre11-slim
# Copies create file to tomcat installation directory with evaluations.war name
# The name is very important as it is used by the frontend to access the app
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY --from=0 /usr/src/app/target/*.war /usr/local/tomcat/webapps/masterthesis.war
EXPOSE 8080