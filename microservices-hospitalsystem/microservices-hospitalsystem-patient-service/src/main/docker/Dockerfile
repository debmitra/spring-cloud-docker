FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-patient-service-1.0.0-SNAPSHOT.jar patient-service.jar
EXPOSE 9903
RUN bash -c 'touch /patient-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/patient-service.jar"]