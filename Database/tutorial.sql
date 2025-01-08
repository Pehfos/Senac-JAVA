CREATE DATABASE tutorial;

USE tutorial;

CREATE TABLE aluno(
	aluno VARCHAR(50),
    genero VARCHAR(20),
    idade INT,
    matricula VARCHAR(5),
    email VARCHAR(40),
    PRIMARY KEY(matricula)
);