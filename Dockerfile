FROM openjdk:8-jre-alpine
ADD target/${JAR_FILE} /usr/share/monitor/monitor-app.jar
EXPOSE ${PORT}
ENTRYPOINT [ "/usr/bin/java", "-jar", "/usr/share/monitor/monitor-app.jar" ]