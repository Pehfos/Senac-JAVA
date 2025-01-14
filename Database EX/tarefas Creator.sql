CREATE DATABASE registro_tarefas;

USE registro_tarefas;

CREATE TABLE tarefas(
	id INT AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(30) NOT NULL,
    prazo INT NOT NULL,
    finalizada BOOLEAN,
    PRIMARY KEY(id)
);

SELECT * FROM tarefas;