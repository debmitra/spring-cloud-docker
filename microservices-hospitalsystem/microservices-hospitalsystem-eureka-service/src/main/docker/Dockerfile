FROM java:8
VOLUME /tmp
ADD microservices-hospitalsystem-eureka-service-1.0.0-SNAPSHOT.jar eureka-service.jar
EXPOSE 8761
RUN bash -c 'touch /eureka-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-service.jar"]