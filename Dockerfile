FROM registry/wildfly:latest
ENV JAVA_OPTS=""
VOLUME /tmp
VOLUME /var/log
ADD mspoc-prototype-demo-rest-service-0.1.0.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ] 
