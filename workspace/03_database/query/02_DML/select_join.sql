-- 게시글 목록을 조회
SELECT * FROM post;


-- 모든 게시글의 id, title, view_count 컬럼 조
SELECT id, member_id,title, view_count FROM post;

-- 모든 게시글의 id, title, view_count, 작성자이름, 작성자 이메일 컬럼 조회
SELECT post.id, member_id, title, view_count, member.id, MEMBER.name, MEMBER.email 
FROM post
INNER JOIN member ON post.member_id = member.id ;

-- 모든 게시글의 id, title, view_count, 작성자이름, 작성자 이메일 컬럼 조회(alias 사용)
SELECT p.id, member_id, title, view_count, m.id, m.name, m.email 
FROM post p
INNER JOIN member m ON p.member_id = m.id ;


-- 모든 댓글의 작성자, 원본 게시글을 조회
SELECT post_id, r.content , r.member_id, r.post_id , m.name, p.title 
FROM reply r
INNER JOIN member m ON r.member_id = m.id
INNER JOIN post p ON r.post_id  = p.id; 


-- 게시글 기준으로 정렬
SELECT p.title 게시글, r.content 댓글, m.name 댓글작성자
FROM reply r
INNER JOIN member m ON r.member_id = m.id
INNER JOIN post p ON r.post_id  = p.id
ORDER BY p.id DESC, r.id ASC;


-- LEFT OUTER JOIN
SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM post p
LEFT OUTER JOIN member AS m ON p.member_id = m.id


-- 전체 회원 목록과 각 회원이 작성한 게시글 수를 조회 하세요.(게시글을 작성하지않은 회원도 포함 되어야함)
SELECT * FROM member;


SELECT m.id, m.name, COUNT(p.id )post_count
FROM member m
LEFT JOIN post p ON m.id = p.member_id 
GROUP BY m.id, m.name;

-- RIGHT OUTER JOIN
SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM post p
RIGHT OUTER JOIN member AS m ON p.member_id = m.id


--
SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM member m
LEFT OUTER JOIN post AS p ON p.member_id = m.id


-- FULL OUTER JOIN(MySQL은 지원하지 않으므로 UNION으로 대체 가능)
SELECT m.id AS member_id, m.name, p.title
FROM member m
LEFT JOIN post p ON m.id = p.member_id 
UNION
SELECT m.id AS member_id, m.name, p.title
FROM member m
RIGHT JOIN post p ON m.id = p.member_id ;

SELECT name, recommander_id FROM member

-- SELF JOIN
-- 회원명과 추천인 명을 조회
SELECT m1.name, m1.recommander_id, m2.name, IFNULL(m2.name, '-')
FROM MEMBER m1
LEFT JOIN member m2 ON m1.recommander_id = m2.id 
-- INNER JOIN member m2 ON m1.recommander_id = m2.id --추천인이 있는 회원과 추천인명을 조회












