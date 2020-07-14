CREATE TABLE news (
    id INT PRIMARY KEY auto_increment,
    title varchar(32),
    content varchar(255),
    post_date datetime,
    deleted boolean default false
);