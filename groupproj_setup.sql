-- CREATE DATABASE store;
USE store;

-- uncomment these if you need to run query more than once
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;

CREATE TABLE users(
	user_id INTEGER,
	user_name VARCHAR(30) NOT NULL,
    salt VARCHAR(255) NOT NULL,
	user_password VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(user_id)
);
insert into users values(1, "John Doe", "salty", "-70, 120, 22, -65, -113, 1, -49, -22, 65, 65, 64, -34, 93, -82, 34, 35, -80, 3, 97, -93, -106, 23, 122, -100, -76, 16, -1, 97, -14, 0, 21, -83");
insert into users values(2, "Jane Doe", "notsalty", "-90, 101, -92, 89, 32, 66, 47, -99, 65, 126, 72, 103, -17, -36, 79, -72, -96, 74, 31, 63, -1, 31, -96, 126, -103, -114, -122, -9, -9, -94, 122, -29");

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
	purchase_id INTEGER auto_increment,
	cid INTEGER NOT NULL,
    pid INTEGER NOT NULL,
    
	PRIMARY KEY(purchase_id),
	FOREIGN KEY (cid) REFERENCES users(user_id),
	FOREIGN KEY (pid) REFERENCES products(product_id)
);
insert into orders (cid, pid) values(1, 2);
insert into orders (cid, pid) values(2, 1);
SELECT * FROM products;