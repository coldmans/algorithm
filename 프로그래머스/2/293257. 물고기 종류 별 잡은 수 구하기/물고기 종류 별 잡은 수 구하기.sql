SELECT count(*) as fish_count, fish_name
FROM FISH_INFO F
JOIN FISH_NAME_INFO N ON F.fish_type = N.fish_type
group by N.fish_name
order by fish_count desc


