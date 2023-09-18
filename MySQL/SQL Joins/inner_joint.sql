-- select id,name,date from customers
-- inner join orders
-- on customers.id = orders.oid

select eid,EMPLOYEE_NAME,oid,date,SALES_MADE from employee
inner join orders
on employee.eid = orders.oid