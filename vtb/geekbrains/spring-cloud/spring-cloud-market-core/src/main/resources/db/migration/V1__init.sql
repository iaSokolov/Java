create table roles (
    id varchar(255) not null,
    name varchar(255),
    primary key (id));

create table users (
    username varchar(255) not null,
    enabled boolean,
    password varchar(255),
    primary key (username));

create table authorities (
    authority varchar(255) not null,
    username varchar(255) not null,
    primary key (authority, username),
    constraint authority_fkey foreign key (authority) references roles(id),
    constraint username_fkey foreign key (username) references users(username));

create table customer (
    id int8 generated by default as identity,
    name varchar(255),
    primary key (id));

create table product (
    id int8 generated by default as identity,
    name varchar(255),
    price numeric(19, 2),
    primary key (id));

create table sales (
    customer_id int8 not null,
    product_id int8 not null,
    amount numeric(19, 2),
    primary key (customer_id, product_id),
    constraint customer_fkey foreign key (customer_id) references customer(id),
    constraint product_fkey foreign key (product_id) references product(id));

INSERT INTO roles VALUES ('ROLE_ADMIN', 'Администратор');
INSERT INTO roles VALUES ('ROLE_USER', 'Пользователь');

INSERT INTO users(username, password, enabled) VALUES ('a', 'a', true);
INSERT INTO users(username, password, enabled) VALUES ('u', 'u', true);

INSERT INTO authorities(authority, username) VALUES ('ROLE_ADMIN', 'a');
INSERT INTO authorities(authority, username) VALUES ('ROLE_USER', 'a');
INSERT INTO authorities(authority, username) VALUES ('ROLE_USER', 'u');