
CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255));

CREATE TABLE IF NOT EXISTS product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    price NUMERIC(15,2));

CREATE TABLE IF NOT EXISTS sales(
    product_id int,
    customer_id int,
    PRIMARY KEY(product_id, customer_id),
    FOREIGN KEY ( product_id ) REFERENCES product ( id ) ON DELETE CASCADE,
    FOREIGN KEY ( customer_id ) REFERENCES customer ( id ) ON DELETE CASCADE);











