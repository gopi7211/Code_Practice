-- CREATE TABLE relations (
--    ID INT NOT NULL UNIQUE KEY,
--    NAME VARCHAR(20) NOT NULL,
--    AGE INT NOT NULL,
--    ADDRESS CHAR (25),
--    SALARY DECIMAL (18, 2)
-- );

INSERT INTO relations VALUES 
(1, 'Ramesh', 32, 'Ahmedabad', 2000.00 ),
(2, 'Khilan', 25, 'Delhi', 1500.00 );

-- ALTER TABLE relations DROP CONSTRAINT id;