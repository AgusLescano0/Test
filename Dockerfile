FROM amazoncorretto:20
MAINTAINER Lescano
COPY target/Portfolio-0.0.1-SNAPSHOT.jar portfolio-arg.jar
ENTRYPOINT ["java","-jar","/portfolio-arg.jar"]
