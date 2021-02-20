FROM openjdk:8-jdk-alpine
VOLUMN \tmp
EXPOSE 8080
ADD target/*.jar aa.jar
ENTRYPOINT ["sh", "-c", "java -jar aa.jar" ]