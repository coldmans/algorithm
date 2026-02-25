SELECT rest_info.rest_id, rest_name,food_type, favorites ,address, ROUND(avg(review_score),2) as score
from rest_info, rest_review
where rest_info.rest_id = rest_review.rest_id and address like '서울%'
group by rest_info.rest_id, rest_name, food_type, favorites, address
order by score desc, favorites desc