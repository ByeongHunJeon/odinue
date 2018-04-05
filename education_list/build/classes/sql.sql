CREATE TABLE BOARD(
       SEQ NUMBER PRIMARY KEY,
       NAME VARCHAR2(20) NOT NULL,
       TITLE VARCHAR2(200) NOT NULL,
       CONTENT VARCHAR2(2000) NOT NULL,
       REGDATE DATE NOT NULL,
       MODIDATE DATE,
       CHKABLE VARCHAR2(1) DEFAULT 'N'
)

ALTER TABLE BOARD ADD(MANAGER VARCHAR2(20));

CREATE TABLE MEMBERS(
       M_SEQ NUMBER PRIMARY KEY,
       M_NAME VARCHAR2(20) NOT NULL,
       M_RANK VARCHAR2(200) NOT NULL,
       M_DEPARTMENT VARCHAR2(200) NOT NULL,
       M_REGDATE DATE NOT NULL,
       M_MODIDATE DATE
)

CREATE SEQUENCE MEMBERS_SEQ START WITH 1 INCREMENT BY 1;

DROP TABLE BOARD;


--글전체리스트 조회
SELECT SEQ,NAME,TITLE,CONTENT,REGDATE,MODIDATE,CHKABLE FROM BOARD ORDER BY SEQ DESC;

SELECT ROWNUM,SEQ,NAME,TITLE,CONTENT,REGDATE,MODIDATE,CHKABLE
FROM (SELECT SEQ,NAME,TITLE,CONTENT,REGDATE,MODIDATE,CHKABLE FROM BOARD ORDER BY SEQ DESC) 
WHERE ROWNUM BETWEEN 1 AND 10
ORDER BY SEQ DESC;

--글상세보기 조회
SELECT SEQ,NAME,TITLE,CONTENT,REGDATE,MODIDATE,CHKABLE FROM BOARD WHERE SEQ='1';
--글작성
INSERT INTO BOARD(SEQ,NAME,TITLE,CONTENT,REGDATE,MANAGER)
VALUES(BOARD_SEQ.NEXTVAL,'NAME','제목','내용',SYSDATE,(SELECT M_NAME FROM MEMBERS WHERE M_SEQ='1'));
--글수정
UPDATE BOARD SET TITLE='' , CONTENT='' , MODIDATE=SYSDATE WHERE SEQ='';
--글확인으로 수정
UPDATE BOARD SET CHKABLE='Y' WHERE SEQ='';
--글삭제
DELETE FROM BOARD WHERE SEQ='';

--직원등록
INSERT INTO MEMBERS(M_SEQ,M_NAME,M_DEPARTMENT,M_RANK,M_REGDATE)
VALUES(MEMBERS_SEQ.NEXTVAL,'전병훈','서비스팀','수습직원',SYSDATE);