CREATE TABLE klienti (
  id INT AUTO_INCREMENT NOT NULL,
  epasts VARCHAR(45) NOT NULL,
  parole VARCHAR(15) NOT NULL,
  vards VARCHAR(15) NOT NULL,
  uzvards VARCHAR(45) NOT NULL,
  CONSTRAINT pk_klienti PRIMARY KEY (id)
);

ALTER TABLE klienti ADD CONSTRAINT uc_klienti_epasts UNIQUE (epasts);



INSERT INTO klienti (id, name, email, dob, age) VALUES
  (1, 'Mario', 'bigdongMario@gmail.com', 2003, 18),
  (2, 'Marc', 'biggerdongMarc@gmail.com', 2004, 17),
  (3, 'James', 'biggestdongJames@gmail.com', 2008, 13);