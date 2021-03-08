# Data Pipeline Kit - 实时数仓平台实践

## Architecture - 架构
| Layer      | Tools |
| ----------- | ----------- |
| Applications | Dashboard  |
| OLAP Storage   | Druid     |
| Computation   | Flink     |
| Storage   | Kafka     |
| Data Collect   | Mock Data Generator  |

## Quick Start
* Build project
    * `./gradlew clean shadowJar`
* Start docker containers
    * `docker-compose up --build --force-recreate --remove-orphans`

## Dependencies - 依赖
* Java - 11
* Gradle - 6.8.3

## Deployment - 部署
### Local - 单机

### Azure [TODO]

## Load Test - 负载测试

