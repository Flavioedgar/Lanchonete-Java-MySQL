-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS cadastro;
USE cadastro;

-- Criar a tabela de produtos
CREATE TABLE IF NOT EXISTS produtos (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        nome VARCHAR(100) NOT NULL,
    valor DOUBLE NOT NULL,
    quantidade INT NOT NULL
    );


