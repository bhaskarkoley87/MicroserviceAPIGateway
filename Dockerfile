# Starting with Docker base image containing Java runtime
FROM openjdk:8-jdk-alpine
# Added Maintainer Info here. Details of Bhaskar Koley
LABEL maintainer="bhaskarkoley87@gmail.com"
# Added a volume pointing to /tmp
VOLUME /tmp/giveawaygatewayzuul
# This application will be accessible from port 4081 outside the container.
EXPOSE 4081
# Copying the jar file to workdir
WORKDIR /usr/app
COPY ./target/GiveawayGateway.jar /usr/app
# Defined WORKDIR
# executing the jar file here...
ENTRYPOINT ["java","-jar","GiveawayGateway.jar"]