# Write your MySQL query statement below
Select email from Person
group by email
HAVING count(email)>1
