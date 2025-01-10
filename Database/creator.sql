CREATE TABLE professor(
	nome VARCHAR(50),
    genero VARCHAR(20),
    idade INT(2),
    matricula VARCHAR(40),
    email VARCHAR(40),
    celular VARCHAR(20),
    PRIMARY KEY(matricula)    
);

CREATE TABLE escola(
	nome VARCHAR(50),
    CEP VARCHAR(70),
    registro VARCHAR(50),
    PRIMARY KEY(registro)
);

CREATE TABLE material(
	nome VARCHAR(80),
	tipo VARCHAR(50),
    codigo VARCHAR(50),
    PRIMARY KEY(codigo)
);

CREATE TABLE funcionarios(
	nome VARCHAR(50),
    genero VARCHAR(20),
    idade INT(2),
    matricula VARCHAR(40),
    email VARCHAR(40),
    celular VARCHAR(20),
    PRIMARY KEY(matricula) 
);

CREATE TABLE cantina(
	nomeBiscoito VARCHAR(50),
    validade VARCHAR(50),
    registro VARCHAR(50),
    PRIMARY KEY(registro)
);

ALTER TABLE funcionarios ADD cargo VARCHAR(50);