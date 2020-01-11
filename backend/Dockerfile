# Build spring
FROM openjdk:11 as builder

COPY . /spring
WORKDIR /spring
RUN ./gradlew build -x test -x checkstyleMain

# RUN Spring
FROM openjdk:11-jre-slim

COPY --from=builder /spring/build/libs/*.jar /spring/
WORKDIR /spring
RUN mv /spring/*.jar /spring/etf.jar

EXPOSE 8080

CMD ["java", "-jar", "etf.jar"]
