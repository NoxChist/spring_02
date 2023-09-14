FROM openjdk:11
EXPOSE 8080
ADD target/spring_02-0.0.1-SNAPSHOT.jar netoHW.jar
CMD ["java", "-jar", "netoHW.jar"]