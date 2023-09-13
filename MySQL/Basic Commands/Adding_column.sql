alter table Customer
add city varchar(20)
--adding coloum city to the table

select * from Customer

update Customer
set city = 'londan'
where FirstName = 'joey'