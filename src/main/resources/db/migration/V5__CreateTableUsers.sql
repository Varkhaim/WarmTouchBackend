CREATE TABLE roles (
    id INT PRIMARY KEY auto_increment,
    name varchar(32)
);

CREATE TABLE user_roles (
    id INT PRIMARY KEY auto_increment,
    user_id INT,
    role_id INT
);

CREATE TABLE users (
    id INT PRIMARY KEY auto_increment,
    username varchar(32),
    password varchar(128),
    email varchar(64),
    name varchar(32),
    active boolean,
    roles varchar(255),
    created_at date,
    updated_at date
);