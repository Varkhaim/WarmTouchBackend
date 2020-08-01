CREATE TABLE pricelist_items (
    id INT PRIMARY KEY auto_increment,
    description text,
    image_link varchar(64),
    type varchar(32),
    deleted boolean default false
);

CREATE TABLE shopitems (
    id INT PRIMARY KEY auto_increment,
    name varchar(128),
    price int,
    duration int,
    pricelist_item_id int,
    deleted boolean default false
);

--FOREIGN KEY REFERENCES pricelist_items(id)