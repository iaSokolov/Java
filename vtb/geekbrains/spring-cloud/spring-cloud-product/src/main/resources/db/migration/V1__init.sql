create table product (
    id int8 generated by default as identity,
    name varchar(255),
    price numeric(19, 2),
    primary key (id));