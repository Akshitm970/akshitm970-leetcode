# Write your MySQL query statement below
select name ,sum(Transactions.amount)as balance
from Users
join Transactions
on Transactions.account = Users.account
group by name
having balance >10000;