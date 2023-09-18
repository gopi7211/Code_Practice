
-- having claus must have group by clause
-- select name, min(salary) as min_sala from faculty group by name having min_sala > 500

-- select name, experience, sum(salary) as tota_salary from faculty group by name, experience having tota_salary > 5000 

select * from faculty