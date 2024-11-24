INSERT INTO tb_hospede_list (name) VALUES ('Hóspede VIP');
INSERT INTO tb_hospede_list (name) VALUES ('Hóspede Standard');

INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('12345678901', 'João Silva', 'joao.silva@example.com', '11987654321', '1990-05-15', 'Rua das Flores, 123', 34, TRUE, 'https://example.com/img/joao.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('98765432100', 'Maria Oliveira', 'maria.oliveira@example.com', '21987654321', '1985-10-30', 'Av. Central, 456', 39, TRUE, 'https://example.com/img/maria.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('12312312399', 'Carlos Souza', 'carlos.souza@example.com', '31912345678', '1992-07-20', 'Praça da Liberdade, 789', 32, TRUE, 'https://example.com/img/carlos.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('78978978911', 'Ana Lima', 'ana.lima@example.com', '21999887766', '2000-03-12', 'Rua da Paz, 1234', 24, FALSE, 'https://example.com/img/ana.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('45645645622', 'Pedro Costa', 'pedro.costa@example.com', '31911223344', '1988-11-05', 'Av. Paulista, 567', 35, TRUE, 'https://example.com/img/pedro.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('32132132133', 'Juliana Santos', 'juliana.santos@example.com', '11933445566', '1995-01-25', 'Rua da Esperança, 234', 29, FALSE, 'https://example.com/img/juliana.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('65465465444', 'Roberto Fernandes', 'roberto.fernandes@example.com', '21966554433', '1998-09-14', 'Av. do Comércio, 890', 26, TRUE, 'https://example.com/img/roberto.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('98798798755', 'Patrícia Almeida', 'patricia.almeida@example.com', '11955667788', '1991-06-08', 'Rua das Acácias, 678', 33, TRUE, 'https://example.com/img/patricia.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('78945612366', 'Marcelo Ribeiro', 'marcelo.ribeiro@example.com', '31999887766', '1987-12-01', 'Av. Atlântica, 345', 36, FALSE, 'https://example.com/img/marcelo.jpg');
INSERT INTO tb_hospede (cpf, nome, email, telefone, data_nascimento, endereco, idade, ativo, img_url) VALUES ('32165498777', 'Fernanda Costa', 'fernanda.costa@example.com', '11922334455', '1994-04-17', 'Rua do Sol, 555', 30, TRUE, 'https://example.com/img/fernanda.jpg');

INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (1, 1, 0);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (1, 2, 1);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (1, 3, 2);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (1, 4, 3);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (1, 5, 4);

INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (2, 6, 0);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (2, 7, 1);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (2, 8, 2);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (2, 9, 3);
INSERT INTO tb_prioridade (list_id, hospede_id, position) VALUES (2, 10, 4);