-- 코드를 입력하세요
SELECT concat('/home/grep/src/', F.board_id,'/',file_id,file_name,file_ext) as file_path
FROM USED_GOODS_FILE F
join USED_GOODS_BOARD B on F.board_id = B.board_id
where views = (
    select max(views)
    from USED_GOODS_BOARD
)
order by file_id desc