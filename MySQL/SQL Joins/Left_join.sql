-- select CUSTOMER_ID,orders.DATE,employee.employee_name
-- from employee
-- left join orders
-- on orders.OID = employee.EID

-- left join orders
-- on customers.id = orders.CUSTOMER_ID

select employee.EMPLOYEE_NAME,employee.SALES_MADE,orders.CUSTOMER_ID,orders.AMOUNT,orders.DATE
from employee
right join orders
on employee.EID = orders.OID