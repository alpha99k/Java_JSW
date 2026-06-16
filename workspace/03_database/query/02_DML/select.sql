-- 회원이름 조회
SELECT name, email, CONCAT(name,' (', email, ')') AS member_info
FROM MEMBER;


SELECT email, LENGTH(email) AS email_Length
FROM MEMBER;

SELECT content, REPLACE(content,'안녕하세요', 'HI!') AS replaced_content
FROM POST
WHERE content LIKE '%안녕하세요%';


SELECT title, CONCAT(SUBSTRING(title, 1, 10), '...')  AS preview
FROM post;

SELECT email, LOWER(email) AS email_Lower, UPPER(email) AS email_Upper
FROM MEMBER;

-- 이메일 앞뒤 공백 제거
SELECT email, TRIM(email) AS trimmed_email
FROM MEMBER;

SELECT NOW() AS current_datetime;

SELECT id , title, DATE_FORMAT(created_at, '%Y년 %m월 %d일  %a %H시 %i분 %s초') AS write_date
 FROM post;

SELECT CURDATE() AS curr_date;

SELECT id,title,created_at
FROM post
WHERE created_at >= CURDATE();

SELECT id, name, created_at, CURDATE(),DATE_SUB(NOW(), INTERVAL 7 DAY) AS before_7days
FROM MEMBER
WHERE created_at >= DATE_SUB(NOW(), INTERVAL 7 DAY);


SELECT id, name, created_at, CURDATE(),DATE_SUB(NOW(), INTERVAL 7 DAY) AS before_1month
FROM MEMBER
WHERE created_at <= DATE_SUB(NOW(), INTERVAL 1 MONTH);


SELECT name, created_at, DATEDIFF(CURDATE(),created_at ) AS days_since_join
FROM MEMBER;

-- 모든 회원수 조회
SELECT count(*)
FROM MEMBER;

-- 모든 게시글수 조회
SELECT count(*)
FROM post;

-- id=3인 회원의 모든 게시글 조회수 조회
SELECT member_id, view_count
FROM post 
WHERE member_id = 3;

-- id=3인 회원의 총 게시글 수 조회
SELECT member_id, COUNT(*) AS total_count, SUM(view_count) AS total_views, AVG(view_count) AS avg_views, MIN(view_count) AS min_views, MAX(view_count) AS max_views
FROM post 
WHERE member_id = 3;

-- 전화번호가 NULL인 회원은 '미등록'으로 표시하여 조회
SELECT name, IFNULL(phone,'미등록') AS phone
FROM member;

-- 전화번호가 NULL이면 이메일을, 이메일도 NULL 이면 '연락처 없음' 으로 조회
SELECT name, IFNULL(phone, IFNULL(email,'연락처없음')) AS contact
FROM member;

SELECT name, IF(phone IS NULL ,IF(email IS NULL,'연락처없음',email),phone) AS phone_status
FROM member;

-- 전화번호 등록 여부에 따라서 상태를 다르게 표시
SELECT name, IF(phone IS NULL , '연락처없음','연락처등록') AS phone_status
FROM member;

-- 가입 연도가 1년이 넘었으면 우수회원, 한달~ 일반 회원, -> 신규회원 
SELECT name, created_at,
CASE
	WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN '우수회원'
	WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH) THEN '일반회원'
	ELSE '신규회원'
END AS member_grade
FROM member
























