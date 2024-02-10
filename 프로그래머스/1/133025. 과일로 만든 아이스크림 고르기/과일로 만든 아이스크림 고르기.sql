-- 코드를 입력하세요
SELECT FLAVOR
FROM FIRST_HALF
WHERE TOTAL_ORDER > 3000 AND FLAVOR IN (SELECT FLAVOR
                                       FROM ICECREAM_INFO
                                       WHERE INGREDIENT_TYPE = 'fruit_based');