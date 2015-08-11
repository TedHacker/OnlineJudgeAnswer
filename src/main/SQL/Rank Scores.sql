select a.Score,count(ranks.score) as Rank
from Scores a,
(select distinct Score from Scores) ranks
where a.Score<=ranks.Score
group by a.Id
order by a.Score desc