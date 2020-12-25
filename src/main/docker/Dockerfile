FROM openjdk:11-jre-slim
RUN apt-get update
RUN apt-get install wget -y
ADD target/template-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8090
