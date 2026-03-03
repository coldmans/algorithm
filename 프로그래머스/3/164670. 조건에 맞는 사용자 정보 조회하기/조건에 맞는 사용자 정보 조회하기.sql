SELECT U.USER_ID, NICKNAME, concat(city,' ', street_address1,' ', street_address2) as 전체주소, concat(substring(TLNO,1,3),'-', substring(TLNO,4,4), '-', substring(TLNO,8)) as 전화번호
FROM USED_GOODS_USER U 
JOIN USED_GOODS_BOARD B on B.WRITER_ID = U.USER_ID
group by user_id
having count(*) >= 3
order by user_id desc
