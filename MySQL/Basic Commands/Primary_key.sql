create table people (

--id is primary key 
id int primary key identity(1,1),
FirstName varchar(20),
LastName varchar(20),
age int,
BloodGroup varchar(20)
)

insert into people (FirstName,LastName,age,BloodGroup)
values ('gopi','krishna',22,'O-ve'),('lachhi','lakshmi',22,'B+ve'),
('Jayashanker','shetty',54,'O+ve'),('lakshmi','devi',48,'O+ve')

select * from people
select * from Customer