FROM openjdk:11-jre-slim
LABEL maintainer="jehyn923@gmail.com"
VOLUME /tmp
ARG JAR_FILE=./build/libs/*.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://192.168.0.48/test","-Djava.security.egd=file:/dev/./uradom","-jar","/app.jar"]