DROP TABLE IF EXISTS show;
DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  released_on DATE DEFAULT NULL,
  actors VARCHAR(500) NOT NULL,
  directed_by VARCHAR(250) DEFAULT NULL
);

CREATE TABLE show (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  screen_name VARCHAR(250) NOT NULL,
  movie_id INT NOT NULL,
  show_timing VARCHAR(500) NOT NULL,
  seat_count INT NOT NULL
);


INSERT INTO movie (name, released_on, actors, directed_by) VALUES
  ('Billa',  DATE '2007-01-01', 'Ajith, Nayan', 'Charan'),
  ('Kala',  DATE '2018-01-01','Rajini,smauthrakani', 'Ranjith');


INSERT INTO show (screen_name, movie_id, show_timing, seat_count) VALUES
  ('Scree1',  1, '2:30 - 5:30', 100),
  ('Scree1',  1, '6:30 - 9:30', 100);