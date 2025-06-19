# Write your MySQL query statement below

select query_name,   
ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100.0 / COUNT(*), 2) AS quality,
Round(sum(rating/position)/ count(query_name),2)as poor_query_percentage from Queries group by query_name
