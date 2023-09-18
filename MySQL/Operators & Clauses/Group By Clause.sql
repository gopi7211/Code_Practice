-- select name, max(salary) from faculty group by name

-- select name, count(name) from student group by name

-- select name, avg(salary) as avg_sala from faculty group by name

-- select name, sum(salary) as avg_sala from faculty group by name

select name, min(salary) as avg_sala from faculty group by name order by avg_sala desc