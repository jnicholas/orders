DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
    order_id BIGINT AUTO_INCREMENT,
    customer_name VARCHAR(255),
    PRIMARY KEY (order_id)
);

CREATE TABLE items (
    item_id BIGINT AUTO_INCREMENT,
    item_name VARCHAR(255),
    item_cost FLOAT DEFAULT 0,
    PRIMARY KEY (item_id)
);

CREATE TABLE order_items (
    order_item_id BIGINT AUTO_INCREMENT,
    order_id INT NOT NULL,
    item_id INT NOT NULL,
    item_count INT NOT NULL DEFAULT 0,
    PRIMARY KEY (order_item_id),
    FOREIGN KEY (order_id) REFERENCES orders (order_id),
    FOREIGN KEY (item_id) REFERENCES items (item_id)
);