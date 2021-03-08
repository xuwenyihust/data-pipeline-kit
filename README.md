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

## Data Schema 数据简介

### Tables - 表结构

#### Transaction - 交易

#### Order - 订单
| Column      | Description |
| ----------- | ----------- |
| order_id | int  |
| user_id | int |

### Events - 事件


## Deployment - 部署
### Local - 单机

### Azure [TODO]

## Load Test - 负载测试

