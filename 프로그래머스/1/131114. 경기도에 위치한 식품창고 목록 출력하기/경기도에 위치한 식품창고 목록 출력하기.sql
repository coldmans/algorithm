-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, coalesce(freezer_yn, 'N') as freezer_yn
FROM FOOD_WAREHOUSE
where warehouse_name like '%경기%'
order by warehouse_id
