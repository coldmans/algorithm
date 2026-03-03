SELECT food_type, rest_id, rest_name, FAVORITES
FROM rest_info
where (food_type, favorites) in(
    SELECT food_type, MAX(favorites)
    FROM rest_info
    group by food_type
)
order by food_type desc
