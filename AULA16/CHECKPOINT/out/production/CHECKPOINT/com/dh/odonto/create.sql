DROP TABLE IF EXISTS dentista, endereco, paciente;
CREATE TABLE IF NOT EXISTS endereco(
    id INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(64),
    numero VARCHAR(8),
    bairro VARCHAR(64),
    cidade VARCHAR(64)
);

CREATE TABLE IF NOT EXISTS paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(64),
    sobrenome VARCHAR(64),
    rg VARCHAR(16),
    data_cadastro TIMESTAMP WITHOUT TIME ZONE,
    endereco_id INT
);

CREATE TABLE IF NOT EXISTS dentista(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(64),
    sobrenome VARCHAR(64),
    numero_matricula VARCHAR(16)
);