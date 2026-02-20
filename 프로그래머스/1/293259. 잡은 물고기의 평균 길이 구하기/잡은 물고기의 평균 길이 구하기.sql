-- 코드를 작성해주세요
SELECT ROUND(SUM(IF(length IS NULL, 10, length)) / COUNT(*), 2) AS AVERAGE_LENGTH
FROM fish_info;


