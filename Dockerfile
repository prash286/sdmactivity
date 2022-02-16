FROM openjdk:11
EXPOSE 8080
ADD target/day16_spring_mvc.war day16_spring_mvc.war
ENTRYPOINT ["java","-jar","/day16_spring_mvc.war"]
