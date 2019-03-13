--CREATE USER SEMI IDENTIFIED BY SEMI;
--
--GRANT CONNECT, RESOURCE, CREATE VIEW TO SEMI;

-- 여기까지 관리자 계정에서 실행

CREATE TABLE "MEMBER" (
	"MEM_USERID"	VARCHAR2(20)	NOT NULL,
	"MEM_PASSWD"	VARCHAR2(20)	NOT NULL,
	"MEM_NAME"	VARCHAR2(10)		NOT NULL,
	"MEM_BIRTH"	Date		NOT NULL,
	"MEM_GENDER"	CHAR(1)	NOT NULL,
	"MEM_TEL"	VARCHAR2(20)		UNIQUE NOT NULL,
	"MEM_EMAIL"	VARCHAR2(30)		UNIQUE NOT NULL,
	"MEM_ADDR1"	VARCHAR2(100)		NOT NULL,
	"MEM_ADDR2"	VARCHAR2(100)		NULL,
	"MEM_ENROLLDATE"	DATE	DEFAULT SYSDATE NOT	NULL,
	"MEM_POINTNUM"	NUMBER		DEFAULT 0 NOT NULL,
	"MEM_COUPONNUM"	NUMBER		DEFAULT 0 NOT NULL,
	"GRADE"	VARCHAR2(20)		NOT NULL
);

CREATE TABLE "POINT" (
	"POINT_NO"	VARCHAR2(50)		NOT NULL,
	"POINT_PUBLISH"	DATE		DEFAULT SYSDATE NOT NULL,
	"POINT_EXPIRE"	DATE		DEFAULT ADD_MONTHS(SYSDATE, 3) NOT NULL,
	"POINT_VALUE"	NUMBER		NOT NULL,
	"POINT_CONTENT"	VARCHAR2(500)		NULL,
	"MEM_USERID"	VARCHAR2(20)		NOT NULL
);

CREATE TABLE "COUPON" (
	"COUPON_NO"	VARCHAR2(50)		NOT NULL,
	"COUPON_NAME"	VARCHAR2(50)		NOT NULL,
	"COUPON_PUBLISH"	DATE		DEFAULT SYSDATE NOT NULL,
	"COUPON_EXPIRE"	DATE		DEFAULT  ADD_MONTHS(SYSDATE, 3) NOT NULL,
	"COUPON_VALUE"	NUMBER		NOT NULL,
	"COUPON_CONTENT"	VARCHAR2(500)		NULL,
	"MEM_USERID"	VARCHAR2(50)		NOT NULL
);

CREATE TABLE "NOTICE" (
    "NOTICE_NO" VARCHAR2(50) NOT NULL,
    "NOTICE_TITLE" VARCHAR2(50) NOT NULL,
    "NOTICE_DATE" DATE DEFAULT SYSDATE NOT NULL,
    "NOTICE_CONTENT" VARCHAR2(1000) NOT NULL,
    "NOTICE_IMG" VARCHAR2(300) NULL,
    "MEM_USERID" VARCHAR2(50) NOT NULL
);

CREATE TABLE "FAQ" (
    "FAQ_NO" VARCHAR2(50) NOT NULL,
    "FAQ_TITLE" VARCHAR2(50) NOT NULL,
    "FAQ_DATE" DATE DEFAULT SYSDATE NOT NULL,
    "FAQ_CONTENT" VARCHAR2(1000) NOT NULL,
    "FAQ_REPLY_CONTENT" VARCHAR2(1000) NOT NULL,
    "MEM_USERID" VARCHAR2(50) NOT NULL
);

CREATE TABLE "EVENT" (
    "EVENT_NO" VARCHAR2(50) NOT NULL,
    "EVENT_TITLE" VARCHAR2(50) NOT NULL,
    "EVENT_DATE" DATE DEFAULT SYSDATE NOT NULL,
    "EVENT_CONTENT" VARCHAR2(1000) NOT NULL,
    "EVENT_IMG" VARCHAR2(300) NULL,
    "MEM_USERID" VARCHAR2(50) NOT NULL
);

CREATE TABLE "QNA" (
    "QNA_NO" VARCHAR2(50) NOT NULL,
    "QNA_TITLE" VARCHAR2(50) NOT NULL,
    "QNA_DATE" DATE DEFAULT SYSDATE NOT NULL,
    "QNA_QCONTENT" VARCHAR2(1000) NOT NULL,
    "QNA_ANS_YN" CHAR(1) DEFAULT 'N' NOT NULL,
    "QNA_ACONTENT" VARCHAR2(1000) NULL,
    "QNA_QID" VARCHAR2(50) NOT NULL,
    "QNA_AID" VARCHAR2(50) NULL
);

CREATE TABLE "PRODUCT_REVIEW" (
	"PRODUCT_REVIEW_NO"	VARCHAR2(50)		NOT NULL,
	"PRODUCT_NO"	VARCHAR2(50)	UNIQUE	NOT NULL,
	"PRODUCT_REVIEW_TITLE"	VARCHAR2(70)		NOT NULL,
	"PRODUCT_REVIEW_CONTENT"	VARCHAR2(1000)		NOT NULL,
	"MEM_USERID"	VARCHAR2(50)		NOT NULL
);

CREATE TABLE "PRODUCT_QNA" (
	"PQNA_NO"	VARCHAR2(50)		NOT NULL,
    "PRODUCT_NO" VARCHAR2(50) NOT NULL,
	"PQNA_TITLE"	VARCHAR(70)		NOT NULL,
	"PQNA_QCONTENT"	VARCHAR(1000)		NOT NULL,
    "PQNA_ANS_YN" CHAR(1) DEFAULT 'N' NOT NULL,
	"PQNA_ACONTENT"	VARCHAR(1000)		NULL,
	"PQNA_SECRET"	CHAR(1)		NOT NULL,
	"PQNA_QID"	VARCHAR2(50)		NOT NULL,
	"PQNA_AID"	VARCHAR2(50)		NULL
);

CREATE TABLE "PRODUCT" (
	"PRODUCT_NO"	VARCHAR2(50)		NOT NULL,
    "PRODUCT_CATEGORY" VARCHAR2(200) NOT NULL,
	"PRODUCT_NAME"	VARCHAR2(50)	NOT NULL,
	"PRODUCT_PRICE"	NUMBER		NOT NULL,
	"PRODUCT_OPTION1"	VARCHAR2(100)		NULL,
	"PRODUCT_OPTION2"	VARCHAR2(100)		NULL,
	"PRODUCT_STOCK"	NUMBER		NOT NULL,
	"PRODUCT_ORIGIN"	VARCHAR2(400)		NOT NULL,
	"PRODUCT_DESC"	VARCHAR2(500)		NOT NULL,
	"PRODUCT_DETAIL"	VARCHAR2(1000)		NOT NULL,
	"PRODUCT_IMG"	VARCHAR2(500)		NULL,
	"PRODUCT_REVIEWNUM"	NUMBER		DEFAULT 0 NULL,
	"PRODUCT_QNANUM"	NUMBER		DEFAULT 0 NULL,
	"STORE_NO"	VARCHAR2(50)		NOT NULL
);

CREATE TABLE "STORE" (
	"STORE_NO"	VARCHAR2(50)		NOT NULL,
	"MEM_USERID"	VARCHAR2(50)		NOT NULL,
	"STORE_NAME"	VARCHAR2(50)	UNIQUE	NOT NULL,
	"STORE_LOC"	VARCHAR2(70)	UNIQUE	NOT NULL,
	"STORE_TEL"	VARCHAR2(20)	UNIQUE	NOT NULL,
	"STORE_DESC"	VARCHAR2(1000)		NULL,
	"PRODUCT_NO"	VARCHAR2(50)		NOT NULL
);

CREATE TABLE "PURCHASE" (
	"PURCHASE_NO"	VARCHAR2(50)		NOT NULL,
	"PURCHASE_DATE"	DATE		DEFAULT SYSDATE NOT NULL,
	"DEL_NO"	VARCHAR2(50)		NOT NULL,
	"PRODUCT_NO"	VARCHAR2(50)		NOT NULL
);

CREATE TABLE "DELIVERY" (
	"DEL_NO"	VARCHAR2(50)		NOT NULL,
	"DEL_STATUS"	CHAR(1)		NOT NULL,
	"DEL_DESTINATION"	VARCHAR2(70)		NOT NULL
);



-- PARKING테이블 보류.

ALTER TABLE "MEMBER" ADD CONSTRAINT "PK_MEMBER" PRIMARY KEY (
	"MEM_USERID"
);

ALTER TABLE "POINT" ADD CONSTRAINT "PK_POINT" PRIMARY KEY (
	"POINT_NO"
);

ALTER TABLE "COUPON" ADD CONSTRAINT "PK_COUPON" PRIMARY KEY (
	"COUPON_NO"
);

ALTER TABLE "PRODUCT" ADD CONSTRAINT "PK_PRODUCT" PRIMARY KEY (
	"PRODUCT_NO"
);

ALTER TABLE "STORE" ADD CONSTRAINT "PK_STORE" PRIMARY KEY (
	"STORE_NO",
	"MEM_USERID"
);

ALTER TABLE "PURCHASE" ADD CONSTRAINT "PK_PURCHASE" PRIMARY KEY (
	"PURCHASE_NO"
);

ALTER TABLE "DELIVERY" ADD CONSTRAINT "PK_DELIVERY" PRIMARY KEY (
	"DEL_NO"
);

ALTER TABLE "PRODUCT_REVIEW" ADD CONSTRAINT "PK_PRODUCT_REVIEW" PRIMARY KEY (
	"PRODUCT_REVIEW_NO",
	"PRODUCT_NO"
);

ALTER TABLE "PRODUCT_QNA" ADD CONSTRAINT "PK_PRODUCT_QNA" PRIMARY KEY (
	"PQNA_NO"
);

ALTER TABLE "STORE" ADD CONSTRAINT "FK_MEMBER_TO_STORE_1" FOREIGN KEY (
	"MEM_USERID"
)
REFERENCES "MEMBER" (
	"MEM_USERID"
);

ALTER TABLE "PRODUCT_REVIEW" ADD CONSTRAINT "FK_PRODUCT_TO_PRODUCT_REVIEW_1" FOREIGN KEY (
	"PRODUCT_NO"
)
REFERENCES "PRODUCT" (
	"PRODUCT_NO"
);

ALTER TABLE "PRODUCT_QNA" ADD CONSTRAINT "FK_PRODUCT_TO_PRODUCT_QNA_1" FOREIGN KEY (
	"PRODUCT_NO"
)
REFERENCES "PRODUCT" (
	"PRODUCT_NO"
);

CREATE SEQUENCE SEQ_NOTICENO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_FAQNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_EVENTNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_QNANO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_PRODUCTQNANO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_PRODUCTREVIEWNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_COUPONNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_DELNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_PRODUCTNO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_PURCHASENO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

CREATE SEQUENCE SEQ_STORENO
MINVALUE 1
INCREMENT BY 1
START WITH 1;

COMMIT;