FROM openjdk:17

ADD ./build/libs/devops-project-demo-1.0.0.jar /opt/app.jar
COPY docker-entrypoint.sh /opt/docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/bin/sh", "/opt/docker-entrypoint.sh"]
