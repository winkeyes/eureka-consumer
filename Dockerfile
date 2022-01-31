FROM openjdk:11
ADD ./target/eureka-consumer-0.0.1-SNAPSHOT.jar eureka-consumer-0.0.1-SNAPSHOT.jar
EXPOSE 9098
ENTRYPOINT ["java", "-jar", "eureka-consumerd.-0.0.1-SNAPSHOT.jar"]