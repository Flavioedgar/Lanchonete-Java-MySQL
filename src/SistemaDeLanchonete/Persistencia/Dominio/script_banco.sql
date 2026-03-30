USE lanchonete_db;

CREATE TABLE produtos (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(100) NOT NULL,
                          valor DOUBLE NOT NULL,
                          quantidade INT NOT NULL
);

SHOW TABLES;
