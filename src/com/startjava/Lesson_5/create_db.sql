-- create database

CREATE TABLE Robot (
  	id SERIAL PRIMARY KEY,
 	modelName TEXT,
  	mark CHAR(6),
  	height INTEGER,
  	weight DOUBLE PRECISION,
  	status TEXT,
  	origin TEXT,
  	launch INTEGER,
  	kaijuKill INTEGER
);