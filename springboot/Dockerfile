FROM maven AS builder
WORKDIR /tmp
COPY ./src ./src
COPY ./pom.xml .
RUN mvn package

FROM openjdk
COPY --from=builder /tmp/target/TravelTango-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080
EXPOSE 5050