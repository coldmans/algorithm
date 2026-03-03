SELECT user_id, nickname ,sum(price) as total_sales
FROM USED_GOODS_USER U
JOIN USED_GOODS_BOARD B ON B.writer_id = U.user_id
where status = 'DONE'
group by U.user_id
having total_sales >= 700000
order by total_sales
