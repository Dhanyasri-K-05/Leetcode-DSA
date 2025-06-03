# Write your MySQL query statement below

with Process as(
select a.machine_id, (b.timestamp-a.timestamp)as process_time from Activity as a join Activity as b on a.machine_id=b.machine_id and a.process_id=b.process_id and a.activity_type='start' and b.activity_type='end'
)

select machine_id,round(avg(process_time),3) as processing_time from Process group by machine_id