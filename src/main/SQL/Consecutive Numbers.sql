select a.Num
from Logs a,b,c
where a.Id=b.Id-1 and b.Id=c.Id-1 and a.Num=b.Num and b.Num=c.Num