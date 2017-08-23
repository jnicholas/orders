INSERT INTO items(item_name, item_cost) VALUES('Blaster', 15.99);
INSERT INTO items(item_name, item_cost) VALUES('Microphone', 109.99);
INSERT INTO items(item_name, item_cost) VALUES('Lightsaber', 138928.21);
INSERT INTO items(item_name, item_cost) VALUES('Gumballs', 0.05);

INSERT INTO orders(customer_name) VALUES('Luke');
INSERT INTO orders(customer_name) VALUES('Leia');
INSERT INTO orders(customer_name) VALUES('Han');

// Luke's stuff
INSERT INTO order_items(order_id, item_id, item_count) VALUES(1, 3, 2);
INSERT INTO order_items(order_id, item_id, item_count) VALUES(1, 4, 13);

// Leia's stuff
INSERT INTO order_items(order_id, item_id, item_count) VALUES(2, 1, 1);
INSERT INTO order_items(order_id, item_id, item_count) VALUES(2, 2, 1);
INSERT INTO order_items(order_id, item_id, item_count) VALUES(2, 4, 5);

// Han's stuff
INSERT INTO order_items(order_id, item_id, item_count) VALUES(3, 1, 3);
INSERT INTO order_items(order_id, item_id, item_count) VALUES(3, 4, 2);