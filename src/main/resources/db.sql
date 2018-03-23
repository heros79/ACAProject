/*CREATE DATABASE onlineshop;*/

USE onlineshop;

/*CREATE TABLE products (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  vendorecode VARCHAR(255) NOT NULL,
  productname VARCHAR(255) NOT NULL,
  price DOUBLE NOT NULL,
  description TEXT

)
  ENGINE = InnoDB;

CREATE TABLE productactions (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  product_id INT NOT NULL,
  count INT NOT NULL,
  buydate DATE,
  selldate DATE,

  FOREIGN KEY (product_id) REFERENCES products (id)
)
  ENGINE = InnoDB;

CREATE VIEW totalproducts AS SELECT  productname, vendorecode, product_id , SUM(count)
  FROM products, productactions WHERE product_id = products.id GROUP BY product_id;



INSERT INTO products VALUE (null, '1-1', 'A', 3.5, 'A');
INSERT INTO products VALUE (null, '1-2', 'B', 78.5, 'B');
INSERT INTO products VALUE (null, '1-3', 'C', 17.8, 'C');
INSERT INTO products VALUE (null, '1-4', 'D', 45.0, 'D');



INSERT INTO  productactions VALUE (NULL, 1, 10, CURDATE(), NULL );
INSERT INTO  productactions VALUE (NULL, 1, 30, CURDATE(), NULL);
INSERT INTO  productactions VALUE (NULL, 1, -15, NULL, CURDATE());
INSERT INTO  productactions VALUE (NULL, 2, 30, CURDATE(), NULL);
INSERT INTO  productactions VALUE (NULL, 2, 50, CURDATE(), NULL);
INSERT INTO  productactions VALUE (NULL, 2, -29, NULL, CURDATE());
INSERT INTO  productactions VALUE (NULL, 1, 17, CURDATE(), NULL);
INSERT INTO  productactions VALUE (NULL, 3, 100, CURDATE(), NULL);
INSERT INTO  productactions VALUE (NULL, 4, 150, CURDATE(), NULL);*/

/*CREATE TABLE useratributes (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstname VARCHAR(50) NOT NULL,
  lastname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;*/

CREATE TABLE users (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  useratr_id INT NOT NULL,
  login VARCHAR(50),
  pash VARCHAR(100),
  role ENUM ("ROLE_USER", "ROLE_ADMIN") NOT NULL,

  FOREIGN KEY (useratr_id) REFERENCES useratributes (id)
)
  ENGINE = InnoDB;