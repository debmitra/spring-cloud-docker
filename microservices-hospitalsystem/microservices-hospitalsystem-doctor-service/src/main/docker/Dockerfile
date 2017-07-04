FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-doctor-service-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 9033
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
