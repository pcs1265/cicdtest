FROM amazoncorretto:17

ADD /build/libs/cicdtest-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 7000

ENTRYPOINT ["java","-jar","/app.jar"]

