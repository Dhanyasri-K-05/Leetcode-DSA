# Write your MySQL query statement below
select s.student_id , s.student_name,sb.subject_name , count(ex.subject_name)as attended_exams
from Students as s  cross join Subjects as sb 
left join Examinations as ex on sb.subject_name=ex.subject_name and s.student_id =ex.student_id
group by s.student_id , s.student_name,sb.subject_name
order by s.student_id , sb.subject_name