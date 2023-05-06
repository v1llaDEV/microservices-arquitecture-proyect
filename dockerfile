FROM openjdk:17.0.2-slim-buster
EXPOSE 8761:8761
COPY target/naming-server-eureka.jar /usr/local/service/naming-server-eureka.jar
ENTRYPOINT ["java","-jar","/usr/local/service/naming-server-eureka.jar"]