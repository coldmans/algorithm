-- 코드를 입력하세요
SELECT O.animal_id, O.name
from animal_outs as O
left join animal_ins as I on I.animal_id = O.animal_id
where I.animal_id is null
order by O.animal_id;
