-- CREATE DATABASE store;
USE store;

-- uncomment these if you need to run query more than once
DROP TABLE orders;
DROP TABLE products;
DROP TABLE users;

CREATE TABLE users(
	user_id INTEGER,
	user_name VARCHAR(30) NOT NULL,
    salt VARCHAR(255) NOT NULL,
	user_password VARCHAR(40) NOT NULL,
    
    PRIMARY KEY(user_id)
);
insert into users values(1, "John Doe", "salty", "abc");
insert into users values(2, "Jane Doe", "notsalty", "123");

   CREATE TABLE products(
    product_id INTEGER,
    product_name VARCHAR(20) NOT NULL,
    product_price DECIMAL(4,2) NOT NULL,  
    product_desc VARCHAR(50),
    stock_count INT NOT NULL,
    image_link VARCHAR (100),
    
    PRIMARY KEY(product_id)    
);
insert into products values(1, "Hoodie_Black", 10.99, "A cool black hoodie. Looks comfy!", 999, "");
insert into products values(2, "Hoodie_Grey", 09.99, "A nice grey hoodie. Looks comfy!", 999, ""); 

CREATE TABLE orders(
	purchase_id INTEGER,
	cid INTEGER NOT NULL,
    pid INTEGER NOT NULL,
    
	PRIMARY KEY(purchase_id),
	FOREIGN KEY (cid) REFERENCES users(user_id),
	FOREIGN KEY (pid) REFERENCES products(product_id)
);
insert into orders values(1, 1, 2);
insert into orders values(2, 2, 1);