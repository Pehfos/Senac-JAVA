CREATE DATABASE agenda_contatos;

USE agenda_contatos;

CREATE TABLE contato(
	nome VARCHAR(50),
    idade INT,
    profissao VARCHAR(50),
    telefone VARCHAR(30),
    email VARCHAR(80),
    PRIMARY KEY(email)
);

DROP TABLE contato;

TRUNCATE TABLE contato;

SELECT * FROM contato