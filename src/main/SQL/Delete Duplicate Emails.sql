#在MySQL中，禁止在FROM子句中指定被更新的目标表。
DELETE a FROM Person a INNER JOIN Person b
WHERE a.Email = b.Email AND a.Id > b.Id;