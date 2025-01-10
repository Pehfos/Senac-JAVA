INSERT INTO contato(nome, idade, profissao, telefone, email) VALUES ('Antonio Vicent', 49, 'Eng. Civil', '99498066','estruturasmello@gmail.com');

INSERT INTO contato(nome, idade, profissao, telefone, email) VALUES ('Pedro Henrique', 21, 'Sup. Técnico', '990619384','jquest775@gmail.com');

INSERT INTO contato(nome, idade, profissao, telefone, email) VALUES ('Tatiane Ramos', 39, 'Desenvolvedora', '991554301','contatotatiramos@gmail.com');

UPDATE contato SET idade = 19 WHERE email = 'contatotatiramos@gmail.com';

DELETE FROM contato WHERE idade < 20;

SELECT * FROM contato;

SELECT * FROM contato WHERE nome LIKE 'A%';