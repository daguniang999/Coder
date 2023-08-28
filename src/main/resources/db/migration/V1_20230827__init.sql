create table if not exists `database_config` (
    `config_id` bigint not null comment '配置ID',
    `name` varchar(50) not null comment '配置名称',
    `ip` varchar(50) default null comment 'IP地址',
    `port` int default null comment '端口',
    `database` varchar(50) default null comment '数据库名称',
    `username` varchar(50) default null comment '用户名',
    `password` varchar(50) default null comment '密码',
    `version` tinyint(4) default 1 comment '数据库版本',
    primary key (`config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;