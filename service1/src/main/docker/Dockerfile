FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD service1-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Xmx32m -Xmx128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
