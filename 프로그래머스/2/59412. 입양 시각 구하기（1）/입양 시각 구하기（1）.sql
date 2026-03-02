SELECT substring(DATETIME,12, 2) as HOUR, count(*) as count
from animal_outs
group by HOUR
having HOUR >= 9 and HOUR <= 19 
order by hour