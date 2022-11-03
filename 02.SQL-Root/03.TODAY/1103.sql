-- 한줄 주석(마이너스 기호 2개 뒤에 띄어쓰기)
/* 여러줄 주석 */

-- 할 일 테이블 만들기
CREATE TABLE `todolist`(
    -- 1. 레코드 순서 번호 (자동 증가)
	`idx` int not null AUTO_INCREMENT,
    -- 2. 할 일 제목
    `title` varchar(200) NOT null,
    -- 3. 할 일 내용
    `cont` text(1000) not null,
    -- 4. 입력 날짜(자동 입력)
    `sysdate` timestamp,
    
    -- 기본키 설정(idx)
    PRIMARY KEY(idx)
);

-- 할 일 리스트에 권한컬럼 추가하기
-- auth char(1)
ALTER TABLE `todolist` ADD `auth` char(1);


/*
[ 테이블 컬럼 추가하기 ]

ALTER TABLE `테이블명`
ADD `컬럼명` 데이터형;

예시)
ALTER TABLE `friends`
ADD `age` int;
*/


ALTER TABLE `todolist` drop COLUMN `auth`;
/*
[ 테이블 컬럼 지우기 ]

ALTER TABLE `테이블명`
DROP COLUMN `컬럼명`;

예시)
ALTER TABLE `friends`
DROP COLUMN `age`;
*/


-- title컬럼의 테이터형을 기존 varchar(200)에서 varchar(300)으로 변경
ALTER TABLE `todolist` MODIFY COLUMN `title`varchar(300);
/*
[ 테이블 컬럼 수정하기(데이터형) ]

ALTER TABLE `테이블명`
MODIFY COLUMN `컬럼명` 데이터형;

예시)
ALTER TABLE `friends`
MODIFY COLUMN `fname` varchar(100);
*/

-- 기존 auth 컬럼의 기본값을 넣기로 변경
-- 권한값은 A:Admin, U:User
-- 기본값 U가 들어가게 한다
-- 변경 방법 : ALTER TABLE 테이블명 AlTER COLUMN 컬럼명 SET DEFAULT 값
ALTER TABLE `todolist` AlTER COLUMN `auth` SET DEFAULT "U";


-- 데이터를 넣을 때 주의할 점 : 
-- 1. 자동으로 들어가는 컬럼은 업데이트 하지 않는다
-- ex) 자동 증가 번호, 자동 입력 오늘 날짜
-- 2. 데이터형에 맞게 적당한 데이터를 넣는다
-- ex) int형에 varchar형 데이터를 넣으면 에러난다(전체쿼리가 실행롤백된다)
-- 전체 롤백이 되는 것을 데이터의 무결성원칙이라고 한다
-- 3. default값이 설정된 경우, 안넣으면 기본값이 들어가고 넣으면 넣은 값이 들어간다
INSERT INTO `todolist` (`title`, `cont`) VALUES("SQL INSERT", "insert int로 데이터를 넣어라");
-- 기본값이 있는 auth컬럼의 값을 기본값 "U"가 아닌 "A"로 넣어라


-- 문자 데이터 항목에 숫자로 넣어도 문자형 숫자로 입력된다
INSERT INTO `todolist` (`title`, `cont`, `auth`) VALUES(333, "select로 데이터 출력", "A");
-- auth항목의 한글자 데이터인데 두 글자를 넣은 경우 - 입력 성공 하단에 경고메시지가 나온다
INSERT INTO `todolist` (`title`, `cont`, `auth`) VALUES("SQL Select", "select로 데이터 출력", "AA");
-- 메시지 : Warning: #1265 Data truncated for column 'auth' at row 1
-- 해석 : 입력한 데이터가 넘쳐서 잘렸다
/*
1. INSERT INTO : 데이터 넣기

INSERT INTO `테이블명` (컬럼명들) VALUES (값들);

예시)

INSERT INTO `friends` (`fname`,`ftel`,`faddr`,`fmsg`) 
VALUES ("이도","01011112222","서울시 종로구","세종대왕 만만세~!!!");
*/

-- 숫자형 데이터 컬럼 추가
ALTER TABLE `todolist` ADD `mynum` int;
/*
[ 테이블 컬럼 추가하기 ]
ALTER TABLE `테이블명`
ADD `컬럼명` 데이터형;
*/

-- 숫자항목 추가 후 새로 데이터 추가
INSERT INTO `todolist`(`title`, `cont`, `mynum`) VALUES ("금요일준비일정", "금요일엔 불금, 놀자", 10);

-- 숫자항목 추가 후 새로 데이터 하나 더 추가
INSERT INTO `todolist`(`title`, `cont`, `mynum`) VALUES ("목요일준비일정", "목요일엔 불목, 놀자", "놀자");
-- 경고창 메시지 :  Warning: #1366 Incorrect integer value: '놀자' for column `today1103`.`todolist`.`mynum` at row 1
-- 숫자 데이터에 문자 데이터를 입력하면 숫자형 기본 데이터인 0이 들어간다 