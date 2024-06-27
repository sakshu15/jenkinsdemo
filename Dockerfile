FROM openjdk:17
EXPOSE 8083
ADD target/demo.jar demo.jar
ENTRYPOINT ["Java,"-jar","/demo.jar"]