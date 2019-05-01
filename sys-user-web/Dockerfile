FROM openjdk:8-jre
VOLUME /tmp
ADD springcloud-provider.jar sys-user-web.jar
RUN bash -c 'touch /sys-user-web.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms100m","-Xmx100m","-jar","/sys-user-web.jar"]