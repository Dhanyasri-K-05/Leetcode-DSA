# Write your MySQL query statement below
select v.customer_id ,count(v.visit_id)as count_no_trans from Visits as v left join Transactions as T on v.visit_id=T.visit_id WHERE 
    t.transaction_id IS NULL
GROUP BY 
    v.customer_id;
