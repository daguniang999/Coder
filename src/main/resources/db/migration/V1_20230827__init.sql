create table if not exists database_config (
    config_id int not null,
    name varchar(50) not null,
    url varchar(200) not null,
    driver varchar(200) not null,
    username varchar(50) default null,
    password varchar(50) default null,
    version tinyint(4) default 1
)