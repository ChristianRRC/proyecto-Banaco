FROM openjdk:11
COPY "./target/Project01_Acount-0.0.1-SNAPSHOT.jar" "api-gateway.jar"
EXPOSE 8088
ENTRYPOINT ["java","-jar","api-gateway.jar"]