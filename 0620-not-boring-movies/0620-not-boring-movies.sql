# Write your MySQL query statement below
SELECT * from Cinema
where MOD(id,2)=1 AND
description <> 'boring'
order by rating DESC;
