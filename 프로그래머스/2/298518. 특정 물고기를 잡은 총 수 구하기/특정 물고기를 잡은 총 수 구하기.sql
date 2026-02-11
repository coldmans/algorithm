-- 코드를 작성해주세요
select count(*) as FISH_COUNT
from fish_name_info AS N, fish_info AS F
where N.fish_type = F.fish_type and (N.fish_name = 'BASS' OR N.fish_name = 'SNAPPER')
