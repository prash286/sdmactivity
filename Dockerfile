FROM openjdk:11
EXPOSE 8080
ADD day16_spring_mvc.war /target/day16_spring_mvc.war
ENTRYPOINT ["java","-jar","day16_spring_mvc.war"]
