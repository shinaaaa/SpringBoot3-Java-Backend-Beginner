INSERT INTO Article(TITLE, CONTENT) VALUES ('가가가가', '1111');
INSERT INTO Article(TITLE, CONTENT) VALUES ('나나나나', '2222');
INSERT INTO Article(TITLE, CONTENT) VALUES ('다다다다', '3333');
INSERT INTO MEMBER(EMAIL, PASSWORD) VALUES ('aaa@aaa.com', '1111');
INSERT INTO MEMBER(EMAIL, PASSWORD) VALUES ('bbb@bbb.com', '2222');
INSERT INTO MEMBER(EMAIL, PASSWORD) VALUES ('ccc@ccc.com', '3333');
INSERT INTO COFFEE(NAME, PRICE) VALUES ('아메리카노', '4500');
INSERT INTO COFFEE(NAME, PRICE) VALUES ('라뗴', '5000');
INSERT INTO COFFEE(NAME, PRICE) VALUES ('카페 모카', '5500');

-- article 테이블에 데이터 추가
INSERT INTO article(title, content) VALUES('당신의 인생 영화는?', '댓글 고');
INSERT INTO article(title, content) VALUES('당신의 소울 푸드는?', '댓글 고고');
INSERT INTO article(title, content) VALUES('당신의 취미는?', '댓글 고고고');

-- 4번 게시글의 댓글 추가
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Park', '굿 윌 헌팅');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Kim', '아이 엠 샘');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Choi', '쇼생크 탈출');

-- 5번 게시글의 댓글 추가
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Park', '치킨');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Kim', '샤브샤브');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Choi', '초밥');

-- 6번 게시글의 댓글 추가
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Park', '조깅');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Kim', '유튜브 시청');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Choi', '독서');

INSERT INTO pizza(name, price) VALUES('페퍼로니 피자', '25900');
INSERT INTO pizza(name, price) VALUES('불고기 피자', '29900');
INSERT INTO pizza(name, price) VALUES('고구마 피자', '30900');
INSERT INTO pizza(name, price) VALUES('포테이토 피자', '27900');
INSERT INTO pizza(name, price) VALUES('치즈 피자', '23900');
