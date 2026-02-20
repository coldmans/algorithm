select item_info.item_id, item_name, RARITY
from item_info
left join item_tree on item_tree.parent_item_id = item_info.item_id
where item_tree.item_id is null
order by item_info.item_id desc;