CREATE TABLE klienti (
  id INT AUTO_INCREMENT NOT NULL,
  epasts VARCHAR(45) NOT NULL,
  parole VARCHAR(15) NOT NULL,
  vards VARCHAR(15) NOT NULL,
  uzvards VARCHAR(45) NOT NULL,
  CONSTRAINT pk_klienti PRIMARY KEY (id)
);

ALTER TABLE klienti ADD CONSTRAINT uc_klienti_epasts UNIQUE (epasts);