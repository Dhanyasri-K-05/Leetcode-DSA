# Write your MySQL query statement below

select p.project_id,Round(avg( experience_years),2) as average_years from Project as p join Employee as e on p.employee_id=e.employee_id
group by p.project_id
