FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-patient-service-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 9903
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
