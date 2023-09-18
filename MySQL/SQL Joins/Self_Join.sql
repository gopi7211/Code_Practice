select orders.AMOUNT,customers.NAME
from orders,customers
where orders.AMOUNT=customers.SALARY
order by customers.SALARY