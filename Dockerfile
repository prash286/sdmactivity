FROM openjdk11
EXPOSE 8080
ADD target/spring_deploy_aws.jar spring_deploy_aws.jar
ENTRYPOINT ["java", "-jar", "/spring_deploy_aws.jar"]