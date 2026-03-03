SELECT I.animal_id, I.name
FROM ANIMAL_INS I
JOIN ANIMAL_OUTS O on I.animal_id = O.animal_id
order by O.datetime - I.datetime desc
limit 2