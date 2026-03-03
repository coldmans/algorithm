SELECT CATEGORY, PRICE as MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (PRICE, CATEGORY) in (
    select max(price) , category
    from food_product
    group by CATEGORY
) and (category = '과자' or category = '국' or category = '김치' or category = '식용유')
group by CATEGORY
order by MAX_PRICE desc