# Write your MySQL query statement below
select p.product_id, Round(IFNULL(sum(p.price*u.units)/sum(u.units),0),2) as average_price  from Prices as p left join  UnitsSold as u on p.product_id= u.product_id 
and   purchase_date between start_date and end_date 
group by product_id


