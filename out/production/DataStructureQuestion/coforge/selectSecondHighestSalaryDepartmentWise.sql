select t.depatno, max(t.salary) from Emp t
where t.salary < (select max(salary) from Emp t2 where t2.depatno = t.depatno ) group by t.depatno;