select a.Id
from Weather a
left join Weather b
on a.Date=date_add(b.Date,interval 1 day)
where a.Temperature>b.Temperature