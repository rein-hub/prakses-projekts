DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  dob INT(250) NOT NULL,
  age INT(250) NOT NULL
);

INSERT INTO student (id, name, email, dob, age) VALUES
  (1, 'Mario', 'bigdongMario@gmail.com', 2003, 18),
  (2, 'Marc', 'biggerdongMarc@gmail.com', 2004, 17),
  (3, 'James', 'biggestdongJames@gmail.com', 2008, 13);