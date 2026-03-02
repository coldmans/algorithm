select animal_id, name, 'O' as 중성화
from animal_ins
where sex_upon_intake like '%Neutered%' or sex_upon_intake like '%Spayed%'
union
select animal_id, name, 'X' as 중성화
from animal_ins
where sex_upon_intake not like '%Neutered%' and sex_upon_intake not like '%Spayed%'
order by animal_id