create table sales(
    product_id  int8,
    customer_id int8,
    amount numeric(19, 2),
    primary key (product_id, customer_id)
);