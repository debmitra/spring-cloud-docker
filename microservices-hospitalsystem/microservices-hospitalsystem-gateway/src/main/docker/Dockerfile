FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-gateway-1.0.0-SNAPSHOT.jar gateway.jar
EXPOSE 9023
RUN bash -c 'touch /gateway.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gateway.jar"]