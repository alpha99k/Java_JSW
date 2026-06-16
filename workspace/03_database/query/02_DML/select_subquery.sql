-- 가장 오래된 회원의 가입일
SELECT MIN(created_at) FROM member;

-- 회원 정보조회
SELECT * FROM member;

-- 가장 오래전에 가입한 회원의 정보 조회
SELECT *
FROM member
WHERE created_at = (SELECT MIN(created_at) FROM member);


-- 게시글을 하나라도 작성한 회원의 id 조회
SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL;

-- id가 1,2인 회원 조
SELECT *
FROM member
WHERE id IN (1,2)

-- 게시글을 하나라도 작성한 회원의 정보 조회

SELECT *
FROM member
WHERE id IN (SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL)


-- 게시글 조회
SELECT * FROM post p;

-- 1번 게시글의 정보와 댓글수 조회
SELECT COUNT(*) FROM reply WHERE post_id = 1;

-- 각 게시글과 함께 해당 게시글의 댓글 수 조회(서브쿼)
SELECT 
		id, 
		title,
		(SELECT COUNT(*) FROM reply WHERE post_id = post.id) AS reply_count
FROM post;


-- 각 게시글과 함께 해당 게시글의 댓글 수 조회(조인)
SELECT p.id,p.title,COUNT(r.id)
FROM post p
LEFT JOIN reply r ON p.id = r.post_id
GROUP BY p.id, p.title;



-- 게시글을 한건이라도 작성한 회원 정보 조회
SELECT *
FROM member
WHERE id IN (SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL)

-- 게시글을 하나라도 작성한 회원의 게시글 수 조회
SELECT member_id, COUNT(*) AS cnt
FROM post
WHERE member_id IS NOT NULL
GROUP BY member_id;

-- 게시글을 하나라도 작성한 회원의 평균 게시글 수 조회
SELECT AVG(cnt)
FROM (SELECT member_id, COUNT(*) AS cnt
FROM post
WHERE member_id IS NOT NULL
GROUP BY member_id
) AS sub;

-- 게시글을 한 건이라도 작성한 회원의 평균 게시글 수보다 많은 글을 작성한 회원의 게시글 조회
SELECT p.member_id, COUNT(*) AS post_count
FROM post p
WHERE p.member_id IS NOT NULL
GROUP BY member_id 
HAVING COUNT(*) > (SELECT AVG(cnt)
	FROM (SELECT member_id, COUNT(*) AS cnt
	FROM post
	WHERE member_id IS NOT NULL
	GROUP BY member_id
	) AS sub);



