FROM openjdk:11
EXPOSE 8080:8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["/bin/bash", "-c", "if [ \"$ENABLE_REMOTE_DEBUG\" = true ]; then java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000 $JAVA_OPTS -jar /app.jar; else java $JAVA_OPTS -jar /app.jar; fi;"]