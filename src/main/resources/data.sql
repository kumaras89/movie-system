DROP TABLE IF EXISTS show;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS seat_allocation;

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
  seat_count INT NOT NULL,
  AVILABLE_SEAT INT NOT NULL
);

CREATE TABLE seat_allocation (
  movie_id INT NOT NULL,
  show_id INT NOT NULL,
  seat_no INT NOT NULL,
  allocated_to VARCHAR(500) NOT NULL,
  PRIMARY KEY(movie_id,show_id, seat_no)
);




INSERT INTO movie (name, released_on, actors, directed_by) VALUES
  ('Billa',  DATE '2007-01-01', 'Ajith, Nayan', 'Charan'),
  ('Kala',  DATE '2018-01-01','Rajini,smauthrakani', 'Ranjith');


INSERT INTO show (id,screen_name, movie_id, show_timing, seat_count,avilable_seat) VALUES
  (1, 'Scree1',  1, '2:30 - 5:30', 100,2),
  (2, 'Scree1',  1, '6:30 - 9:30', 100,0);


INSERT INTO seat_allocation ( movie_id,show_id, seat_no, allocated_to) VALUES
  (1,  1, 1, '1'),
  (1,  1, 2, '2');