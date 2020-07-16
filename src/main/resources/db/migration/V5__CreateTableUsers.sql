CREATE TABLE users (
    id INT PRIMARY KEY auto_increment,
    username varchar(32),
    password varchar(32),
    displayname varchar(32),
    active boolean,
    roles varchar(255),
    deleted boolean default false
);