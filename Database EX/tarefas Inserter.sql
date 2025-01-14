INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Entregar guitarra para João', 10, TRUE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Devolver cadeira de Emerson', 7, FALSE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Depósito da venda pelo aplicativo', 6, FALSE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Comprar cabo de rede', 7, TRUE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Mover PCs do RH', 3, TRUE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Trocar SSD do PC da SEMET', 3, TRUE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Procurar Nemo', 14, FALSE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Lavar a louça', 1, FALSE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Inscrever no concurso', 17, TRUE);
    
INSERT INTO tarefas(descricao, prazo, finalizada)
	VALUES ('Jogar materiais fora', 30, FALSE);
    
SELECT * FROM tarefas;

UPDATE tarefas SET descricao = 'Depósito da venda do App' WHERE id = 3;

