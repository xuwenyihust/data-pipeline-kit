FROM openjdk:11-jre-slim

ENV SERVICE_HOME="opt/service"
ENV SERVICE_NAME="data_generator"
RUN mkdir -p "${SERVICE_HOME}"
COPY build/libs/data-generator-all.jar ${SERVICE_HOME}/${SERVICE_NAME}.jar

ENTRYPOINT ["java", "-jar", "opt/service/data_generator.jar"]