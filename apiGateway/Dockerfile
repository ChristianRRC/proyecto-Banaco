FROM openjdk:11
COPY "./target/apiGateway-0.0.1-SNAPSHOT.jar" "api_gateway.jar"
EXPOSE 8088
ENTRYPOINT ["java","-jar","api_gateway.jar"]