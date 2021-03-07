FROM flink:1.12-java11

ENV SERVICE_HOME="opt/service"
ENV SERVICE_NAME="flink_service"
RUN mkdir -p "${SERVICE_HOME}"
COPY build/libs/flink-1.0-SNAPSHOT-all.jar ${SERVICE_HOME}/${SERVICE_NAME}.jar

ENTRYPOINT ["java", "-jar", "opt/service/flink_service.jar"]