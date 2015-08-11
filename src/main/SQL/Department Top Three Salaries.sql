select b.name as Department,a.name as Employee,Salary
from Employee a,Department b
where (select count(distinct Salary) from Employee c where c.Salary>a.Salary and c.DepartmentId=a.DepartmentId)<3 and a.DepartmentId= b.Id
order by Department,Salary desc