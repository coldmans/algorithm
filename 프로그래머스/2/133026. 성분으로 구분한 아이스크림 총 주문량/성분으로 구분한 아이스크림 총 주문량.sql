-- 코드를 입력하세요
SELECT ingredient_type, sum(total_order) as total_order
FROM FIRST_HALF F
JOIN ICECREAM_INFO I ON F.flavor = I.flavor 
group by I.ingredient_type