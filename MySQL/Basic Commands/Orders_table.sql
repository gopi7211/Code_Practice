create table Orders
(
OrderId int primary key identity(1,1),
OrderDate Datetime,
CustomerId int,
ProductId int

)

select * from Orders
insert into Orders(OrderDate,CustomerId,ProductId) values (GETDATE(),2,2),(GETDATE(),3,3),(GETDATE(),4,4),(GETDATE(),5,5)