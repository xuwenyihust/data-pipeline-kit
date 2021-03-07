FROM flink:1.12-java11

ENV SERVICE_HOME="opt/service"
ENV SERVICE_NAME="flink_job"
RUN mkdir -p "${SERVICE_HOME}"
COPY build/libs/flink-job-all.jar ${SERVICE_HOME}/${SERVICE_NAME}.jar

ENTRYPOINT ["java", "-jar", "opt/service/flink_job.jar"]