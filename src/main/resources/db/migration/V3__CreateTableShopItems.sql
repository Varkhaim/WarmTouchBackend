CREATE TABLE shopitems (
    id INT PRIMARY KEY auto_increment,
    name varchar(32),
    short_description varchar(64),
    description varchar(256),
    price int,
    duration int,
    image_link varchar(64),
    type varchar(32),
    deleted boolean default false
);