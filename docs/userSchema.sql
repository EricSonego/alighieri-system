/* user table */
create schema if not exists usr;

drop table if exists usr.Users;
create table usr.Users (
	idUser int generated always as identity primary key,
	name varchar(50) not null,
	lastName varchar(150) not null,
	email varchar(200) not null,
	role varchar(20) not null
);