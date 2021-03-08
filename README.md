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

## Data Summary 数据简介

### Tables - 表结构

#### Order - 订单
| Column      | Description |
| ----------- | ----------- |
| order_id | int  |
| user_id | int |
| product_id | int |
| product_count | int |
| status | text (open / pending / paid / delivering / delivered) |
| creation_timestamp | time |

#### Behavior - 行为
| Column      | Description |
| ----------- | ----------- |
| id | int |
| user_id | int |
| order_id | int |
| product_id | int |
| product_count | int |
| behavior_type | text (point / favorite / cart_add / cart_remove / buy / cancel / pay) |
| timestamp | time |

#### Product - 商品
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |
| type_id | int |
| price | int |

#### Product Type - 商品类型
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |

#### User - 用户
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |
| creation_time | time |

### Events - 事件


## Deployment - 部署
### Local - 单机

### Azure [TODO]

## Load Test - 负载测试

