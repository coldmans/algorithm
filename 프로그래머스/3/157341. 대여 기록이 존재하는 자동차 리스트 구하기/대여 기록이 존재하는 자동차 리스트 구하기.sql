SELECT distinct C.car_id
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H on C.car_id = H.car_id
where C.car_type = '세단' and H.start_date like '%-10-%'
order by C.car_id desc;

