SELECT animal_id, name
FROM ANIMAL_INS
WHERE NAME like '%el%' and animal_type = 'Dog'
ORDER BY NAME 