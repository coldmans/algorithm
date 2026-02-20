-- 코드를 입력하세요
SELECT f.flavor
from FIRST_HALF as f
order by f.total_order + (select sum(total_order) from july where f.flavor = july.flavor group by flavor) desc
limit 3;