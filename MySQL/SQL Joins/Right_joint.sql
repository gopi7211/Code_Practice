select customers.NAME,customers.AGE,employee.SALES_MADE,employee.EID
from employee
left join customers
on employee.EID = customers.ID
