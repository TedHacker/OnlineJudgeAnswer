select c.name as Department,d.name as Employee,d.Salary as Salary
from Department c
inner join
(select a.name,a.Salary,a.DepartmentId
from Employee a
inner join(
select max(Salary) as Salary,DepartmentId
from Employee
group by DepartmentId)b
on a.DepartmentId=b.DepartmentId
where a.Salary=b.Salary) d
on c.Id=d.DepartmentId