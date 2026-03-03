SELECT P.product_code, PRICE * SUM(SALES_AMOUNT) as SALES
FROM PRODUCT P
JOIN OFFLINE_SALE O ON P.product_id = O.product_id
GROUP BY P.product_code
ORDER BY SALES desc, P.product_code

