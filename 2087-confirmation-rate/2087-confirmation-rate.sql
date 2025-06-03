WITH process AS (
  SELECT 
    user_id,
    SUM(action = 'confirmed') AS confirm_count,
    COUNT(*) AS total_count
  FROM Confirmations
  GROUP BY user_id
)

SELECT 
  s.user_id,
  ROUND(
    IFNULL(p.confirm_count, 0) / IFNULL(p.total_count, 1),
    2
  ) AS confirmation_rate
FROM Signups AS s
LEFT JOIN process AS p 
  ON s.user_id = p.user_id;
