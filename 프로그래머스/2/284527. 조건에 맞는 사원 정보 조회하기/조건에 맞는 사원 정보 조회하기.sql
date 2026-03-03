select sum(score) as score, E.emp_no, emp_name, position, email
from HR_EMPLOYEES E
join HR_GRADE G on E.emp_no = G.emp_no
group by E.emp_no
order by score desc
limit 1;


