FROM openjdk:8-jdk-alpine

#maintainer
MAINTAINER ruben.rajan@handzap.com

#expose port 8080
EXPOSE 80

#default command
CMD java -jar /target/frontend-1.0.0.jar

#copy hello world to docker image
ADD ./target/frontend-1.0.0.jar /target/frontend-1.0.0.jar
