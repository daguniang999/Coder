create table if not exists database_config (
    config_id int not null,
    name varchar(50) not null,
    ip varchar(50) default null,
    port int default null,
    schema varchar(50) default null,
    database varchar(50) default null,
    username varchar(50) default null,
    password varchar(50) default null,
    version tinyint(4) default 1
)