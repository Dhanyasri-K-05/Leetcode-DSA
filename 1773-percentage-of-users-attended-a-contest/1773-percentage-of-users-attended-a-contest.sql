

select r.contest_id, Round((count(*)/(SELECT COUNT(*) FROM Users) )*100,2) as percentage from Users as u  join Register as r on u.user_id= r.user_id

group by contest_id
order by percentage desc , r.contest_id asc
