-- 코드를 입력하세요
SELECT I.animal_id, I.name
From animal_outs as O
join animal_ins as I on I.animal_id = O.animal_id
where O.datetime < I.datetime
order by I.datetime