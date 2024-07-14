FROM amazoncorretto:17.0.11-alpine

ADD /build/libs/cicdtest-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 7000

ENTRYPOINT ["java","-jar","/app.jar"]

