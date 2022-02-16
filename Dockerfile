FROM openjdk:11
EXPOSE 8080
ADD day16_spring_mvc2.war /sdmactivity/
ENTRYPOINT ["java","-jar","day16_spring_mvc2.war"]
