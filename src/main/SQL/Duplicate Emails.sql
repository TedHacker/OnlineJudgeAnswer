select a.Email
from (Person a
left join (
select count(*) as counts,Email
from Person
group by Email) b
on a.Email=b.Email
)
where b.counts>1
group by a.Email