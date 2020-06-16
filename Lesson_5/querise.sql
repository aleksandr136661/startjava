-- querise database

SELECT * FROM Robot;

SELECT * FROM Robot WHERE status = 'Working';

SELECT * FROM Robot WHERE mark != 'Mark-2' AND mark != 'Mark-3' AND mark != 'Mark-4';

SELECT * FROM Robot ORDER BY mark DESC;

SELECT * FROM Robot WHERE launch = (SELECT MIN (launch) FROM Robot);

SELECT * FROM robot WHERE kaijuKill >= 5;

SELECT * FROM robot WHERE kaijuKill < 5;

SELECT AVG(weight) FROM Robot;

UPDATE Robot SET kaijuKill = kaijuKill + 1 WHERE status = 'Working';

DELETE FROM Robot WHERE status = 'Destroyed';