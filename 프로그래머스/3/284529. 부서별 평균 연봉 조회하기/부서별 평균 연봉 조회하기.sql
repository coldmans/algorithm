select D.dept_id, dept_name_en, ROUND(avg(SAL), 0) as AVG_SAL
from HR_DEPARTMENT D
join HR_EMPLOYEES E on D.dept_id = E.dept_id 
group by D.dept_id
order by AVG_SAL desc