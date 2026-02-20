select item_info.item_id, item_name
from item_tree
join item_info on item_tree.item_id = item_info.item_id
where parent_item_id is null
