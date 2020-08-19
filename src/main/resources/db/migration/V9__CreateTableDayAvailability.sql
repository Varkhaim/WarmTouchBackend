CREATE TABLE day_availability (
    id INT PRIMARY KEY auto_increment,
    day_name varchar(16),
    is_available boolean default false,
    time_from time,
    time_to time
);