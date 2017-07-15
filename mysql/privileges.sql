use mysql;

select host, user from user;

grant all on *.* to root@'%' identified by '123456' with grant option;

flush privileges;

-- privileges.sql