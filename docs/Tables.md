# Tables - 表结构

## Order - 订单
| Column      | Description |
| ----------- | ----------- |
| order_id | int  |
| user_id | int |
| product_id | int |
| product_count | int |
| status | text (open / pending / paid / delivering / delivered) |
| creation_timestamp | time |

## Behavior - 行为
| Column      | Description |
| ----------- | ----------- |
| id | int |
| user_id | int |
| order_id | int |
| product_id | int |
| product_count | int |
| behavior_type | text (point / favorite / cart_add / cart_remove / confirm / cancel / pay) |
| timestamp | time |

## Product - 商品
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |
| type_id | int |
| price | int |

## Product Type - 商品类型
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |

## User - 用户
| Column      | Description |
| ----------- | ----------- |
| id | int |
| name | text |
| creation_time | time |
