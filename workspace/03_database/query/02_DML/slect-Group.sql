-- 각 회원별로 작성한 게시글 개수를 조회
SELECT member_id, COUNT(*)
FROM post
GROUP BY member_id;


-- 각 게시글 댓글수 조회(댓글수로내림차순정렬)
SELECT post_id, COUNT(*) AS reply_count
FROM reply
GROUP BY post_id
ORDER BY COUNT(*) DESC;

SELECT member_id, COUNT(*) AS post_count, SUM(view_count) AS total_views
FROM post
GROUP BY member_id
ORDER BY post_count, total_views DESC;

SELECT DATE_FORMAT(created_at, '%Y') AS join_year, COUNT(*) join_count
FROM member
GROUP BY DATE_FORMAT(created_at, '%Y');

SELECT member_id, COUNT(*) AS post_count, SUM(view_count) AS total_views
FROM post
GROUP BY member_id
HAVING post_count >= 5;

-- 에러 발생: title이 GROUP BY 기준에 존재하지 않음
SELECT member_id, title, COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 1: 집계 함수를 적용하여 단일 결과값으로 보장
SELECT member_id, MAX(title), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 2: group_concat을 사용해 여러 개의 title을 하나의 텍스트로 합침
SELECT member_id, GROUP_CONCAT(title), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 3:해당 컬럼도 GROUP BY 기준에 추가하여 공동 그룹으로 묶음
SELECT member_id, title, COUNT(*) AS post_count
    FROM post
    GROUP BY member_id, title;



-- 게시글을 2개 이상 작성한 회원의 id와 게시글 수 조회
-- 에러 발생: 아직 그룹화되지 않은 상태인 WHERE 절에서 집계 함수 COUNT(*)를 사용하려 함
SELECT member_id, COUNT(*)
    FROM post
    WHERE COUNT(*) >= 2
    GROUP BY member_id;
