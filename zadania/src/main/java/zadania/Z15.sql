SELECT COUNT(*) AS "Number of employees without menagers"
FROM employees
WHERE manager_id IS NULL;