FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-doctor-service-1.0.0-SNAPSHOT.jar doctor-service.jar
EXPOSE 9033
RUN bash -c 'touch /doctor-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/doctor-service.jar"]