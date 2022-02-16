FROM openjdk:11
EXPOSE 8080
ADD day16_spring_mvc.war /sdmactivity/target/
ENTRYPOINT ["java","-jar","day16_spring_mvc.war"]
