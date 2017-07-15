use mysql;

select host, user from user;

create user muqi identified by '123456';

grant all on muqi.* to muqi@'%' identified by '123456' with grant option;

flush privileges;

-- privileges.sql