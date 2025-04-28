CREATE DATABASE consulta_medica;
USE consulta_medica;
SHOW TABLES;
CREATE TABLE pessoa(
id_pessoa INT PRIMARY KEY AUTO_INCREMENT,
cpf VARCHAR(18) NOT NULL,
data_nascismento DATE NOT NULL,
email VARCHAR(45) NOT NULL,
telefone VARCHAR(20) NOT NULL);
SELECT * FROM pessoa;
CREATE TABLE medico(
id_medico INT PRIMARY KEY AUTO_INCREMENT,
matricula VARCHAR(20) NOT NULL,
salario DECIMAL(6,2) NOT NULL);
CREATE TABLE paciente(
id_paciente INT PRIMARY KEY AUTO_INCREMENT,
plano_saude VARCHAR(40) NOT NULL,
id_pessoa INT NOT NULL,
FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa));

SELECT * FROM medico;
SELECT * FROM paciente;

INSERT INTO pessoa(cpf,data_nascismento,email,telefone)
VALUES('5454545','1999-02-02','ASAS@GMAIL.COM','45465656'),
('85211355','1995-02-25','ZSDAD@GMAIL.COM','23234235425');

SELECT * FROM pessoa;


 