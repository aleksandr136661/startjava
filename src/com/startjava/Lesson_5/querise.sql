-- querise database

SELECT * FROM Robot;

SELECT * FROM Robot WHERE status = 'Working';

SELECT * FROM Robot WHERE mark = 'Mark-1' OR mark = 'Mark-5';

SELECT * FROM Robot ORDER BY mark DESC;

SELECT * FROM Robot WHERE launch = (SELECT MIN (launch) FROM Robot);

SELECT * FROM robot WHERE kaijuKill >= SELECT AVG(kaijuKill) FROM Robot;

SELECT * FROM robot WHERE kaijuKill < SELECT AVG(kaijuKill) FROM Robot;

SELECT AVG(weight) FROM Robot;

UPDATE Robot SET kaijuKill = kaijuKill + 1 WHERE status = 'Working';

DELETE FROM Robot WHERE status = 'Destroyed';