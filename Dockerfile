FROM openjdk:11-jdk
ARG WAR_FILE=day16_spring_mvc.war
COPY ${WAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]





