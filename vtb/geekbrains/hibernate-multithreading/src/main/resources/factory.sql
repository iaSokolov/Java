BEGIN;

DROP TABLE IF EXISTS manufacturers CASCADE;
CREATE TABLE manufacturers (
    id serial PRIMARY KEY,
    title VARCHAR(255));
INSERT INTO manufacturers (title)
    VALUES ('Coca Cola Company'), ('Danone');

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (
    id serial PRIMARY KEY,
    title VARCHAR(255),
    price NUMERIC(8,2),
    manufacturer_id int,
    FOREIGN KEY (manufacturer_id) REFERENCES manufacturers(id));
INSERT INTO products (title, price, manufacturer_id)
    VALUES ('Sprite', 30.00, 1),
           ('Fanta', 45.00, 1),
           ('Актимель', 45.00, 2),
           ('Активиа', 90.00, 2),
           ('Растишка', 15.00, 2),
           ('Смешарики', 28.00, 2),
           ('Даниссимо', 31.00, 2),
           ('Данон', 41.00, 2),
           ('Тема', 49.00, 2),
           ('Простоквашино', 50.00, 2);

DROP TABLE IF EXISTS customer CASCADE;
CREATE TABLE customer (
    id serial PRIMARY KEY,
    name VARCHAR(100));
INSERT INTO customer (name)
    VALUES ('Ilya'), ('Inna');

DROP TABLE IF EXISTS big_items CASCADE;
CREATE TABLE big_items (
    id serial PRIMARY KEY,
    val int,
    junkFiled int,
    version serial);
INSERT INTO big_items (val)
    VALUES (10);
COMMIT;