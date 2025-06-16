CREATE DATABASE suporte_tech;
USE suporte_tech;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    senha VARCHAR(100)
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    contato VARCHAR(50),
    cpf VARCHAR(14),
    endereco VARCHAR(200)
);

CREATE TABLE chamados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao TEXT,
    entrada TIME,
    saida TIME,
    data DATE,
    tipo VARCHAR(100),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
INSERT INTO usuarios (nome, senha) VALUES ('admin', '123');