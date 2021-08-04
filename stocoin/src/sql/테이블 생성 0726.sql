-- drop table
drop table admin;
drop table member;
drop table board;
drop table reply;
drop table replyLikes;
drop table qna;
drop table qnaReply;
drop table chat;
drop table coin;
drop table myCoin;
drop table tradeCoin;
drop table favoriteCoin;
drop table stock;
drop table myStock;
drop table tradeStock;
drop table favoriteStock;

-- select table
select * from admin;
select * from member;
select * from board;
select * from reply;
select * from replyLikes;
select * from qna;
select * from qnaReply;
select * from chat;
select * from coin;
select * from myCoin;
select * from tradeCoin;
select * from stock;
select * from myStock;
select * from tradeStock;
select * from favoriteStock;

 -- 회원
CREATE TABLE Member
(
    mno    NUMBER NOT NULL,
    id    VARCHAR2(100) NOT NULL,
    nick    VARCHAR2(40) NOT NULL,
    reg_date    DATE NOT NULL,
    coin_money    NUMBER DEFAULT 3000000 NOT NULL,
    stock_money    NUMBER DEFAULT 3000000 NOT NULL,
    del    CHAR(1) NOT NULL
);

ALTER TABLE Member
 ADD CONSTRAINT member_mno_PK PRIMARY KEY ( mno );
 
select * from member;
update member set stock_money = 3000000;
update member set coin_money = 3000000;
 
-- 관리자
CREATE TABLE admin
(
    id    VARCHAR2(20) NOT NULL,
    pwd    VARCHAR2(20) NOT NULL,
    nick    VARCHAR2(20) DEFAULT '관리자' NOT NULL
);

ALTER TABLE admin
 ADD CONSTRAINT admin_id_PK PRIMARY KEY ( id );
 
insert into admin values ('admin', '1234', '관리자');

-- 게시판 -------------------------------------------------------
CREATE TABLE Board
(
    bno    NUMBER NOT NULL,
    title    VARCHAR2(200) NOT NULL,
    content    CLOB NOT NULL,
    dates    DATE NOT NULL,
    views    NUMBER DEFAULT 0 NOT NULL,
    del    CHAR(1) DEFAULT 'n' NOT NULL,
    types    NUMBER NOT NULL
);

ALTER TABLE Board
 ADD CONSTRAINT board_bno_PK PRIMARY KEY ( bno );

select * from board;

-- 게시판 댓글
 CREATE TABLE Reply
(
    bno    NUMBER NOT NULL,
    rno    NUMBER NOT NULL,
    content    VARCHAR2(500) NOT NULL,
    dates    DATE NOT NULL,
    del    CHAR(1) DEFAULT 'n' NOT NULL,
    mno    NUMBER NOT NULL,
    likes    NUMBER DEFAULT 0 NOT NULL
);

ALTER TABLE Reply
 ADD CONSTRAINT reply_rno_PK PRIMARY KEY ( bno,rno );

select * from reply;

-- 게시판 댓글 좋아요
CREATE TABLE ReplyLikes
(
    mno    NUMBER NOT NULL,
    bno    NUMBER NOT NULL,
    rno    NUMBER NOT NULL
);

select * from replyLikes;

 -- 문의글
 CREATE TABLE Qna
(
    qno    NUMBER NOT NULL,
    title    VARCHAR2(200) NOT NULL,
    content    VARCHAR2(2000) NOT NULL,
    dates    DATE NOT NULL,
    secret    CHAR(1) DEFAULT 'n' NOT NULL,
    mno    NUMBER NOT NULL
);

ALTER TABLE Qna
 ADD CONSTRAINT qna_qno_PK PRIMARY KEY ( qno );

select * from qna;
 
-- 문의답변글
CREATE TABLE QnaReply
(
    qr_no    NUMBER NOT NULL,
    content    VARCHAR2(2000) NOT NULL,
    dates    DATE NOT NULL,
    qno    NUMBER NOT NULL
);

ALTER TABLE QnaReply
 ADD CONSTRAINT qnareply_qr_no_PK PRIMARY KEY ( qr_no );

select * from qnaReply;
 
-- 채팅 -------------------------------------------------------
CREATE TABLE Chat
(
    cno    NUMBER NOT NULL,
    nick    VARCHAR2(40) NOT NULL,
    content    VARCHAR2(500) NOT NULL,
    dates    DATE NOT NULL
);

ALTER TABLE Chat
 ADD CONSTRAINT chat_cno_PK PRIMARY KEY ( cno );

select * from chat;
 
-- 코인 -------------------------------------------------------
-- 코인관심종목
CREATE TABLE FavoriteCoin
(
    mno    NUMBER NOT NULL,
    cname    VARCHAR(20) NOT NULL
);

select * from favoriteCoin;
 
-- 코인보유현황 
CREATE TABLE MyCoin
(
    mno    NUMBER NOT NULL,
    mc_no    NUMBER NOT NULL,
    cname    VARCHAR(20) NOT NULL,
    cname_ko    VARCHAR(70) NOT NULL,
    cnt    FLOAT NOT NULL,
    purchase    NUMBER NOT NULL
);

ALTER TABLE MyCoin
 ADD CONSTRAINT mycoin_mc_no_PK PRIMARY KEY ( mc_no,mno );

select * from MyCoin;
delete from mycoin;

-- 코인거래내역
CREATE TABLE TradeCoin
(
    mno    NUMBER NOT NULL,
    tc_no    NUMBER NOT NULL,
    cname    VARCHAR(20) NOT NULL,
    cname_ko    VARCHAR(70) NOT NULL,
    types    NUMBER NOT NULL,
    dates    DATE NOT NULL,
    cnt    FLOAT NOT NULL,
    contract    FLOAT NOT NULL
);

ALTER TABLE TradeCoin
 ADD CONSTRAINT tradecoin_tc_no_PK PRIMARY KEY ( tc_no,mno );

select * from tradeCoin;
delete from tradecoin;
 
-- 주식 ------------------------------------------------------
-- 주식관심종목
CREATE TABLE FavoriteStock
(
    mno    NUMBER NOT NULL,
    fs_no    NUMBER NOT NULL,
    sname	VARCHAR2(50) NOT NULL,
    code	VARCHAR2(10) NOT NULL
);

ALTER TABLE FavoriteStock
 ADD CONSTRAINT favoritestock_fs_no_PK PRIMARY KEY ( fs_no,mno );

select * from favoriteStock;
 
-- 주식보유현황
CREATE TABLE MyStock
(
    mno    NUMBER NOT NULL,
    ms_no    NUMBER NOT NULL,
    sname    VARCHAR2(50) NOT NULL,
    code    VARCHAR2(10) NOT NULL,
    cnt    NUMBER NOT NULL,
    purchase    NUMBER NOT NULL
);

ALTER TABLE MyStock
 ADD CONSTRAINT mystock_ms_no_PK PRIMARY KEY ( ms_no,mno );

select * from myStock;
delete from myStock;
 
-- 주식거래내역
CREATE TABLE TradeStock
(
    mno    NUMBER NOT NULL,
    ts_no    NUMBER NOT NULL,
    sname    VARCHAR2(50) NOT NULL,
    code    VARCHAR2(10) NOT NULL,
    types    NUMBER NOT NULL,
    dates    DATE NOT NULL,
    cnt    NUMBER NOT NULL,
    contract    NUMBER NOT NULL
);

ALTER TABLE TradeStock
 ADD CONSTRAINT tradestock_ts_no_PK PRIMARY KEY ( ts_no,mno );
 
select * from tradeStock;
