DROP TABLE BOARD;
DROP TABLE BOARD_CATEGORY;
DROP TABLE COUPON;
DROP TABLE DELIVERY;
DROP TABLE GRADE;
DROP TABLE ITEM;
DROP TABLE ITEM_QNA;
DROP TABLE ITEM_REVIEW;
DROP TABLE MEMBER;
DROP TABLE ORDER;
DROP TABLE POINT;
DROP TABLE POST;
DROP TABLE SHOP;


CREATE TABLE "MEMBER" (
   "MEM_CODE"   NUMBER      NOT NULL,
   "MEM_USERID"   VARCHAR2(20)      NOT NULL,
   "MEM_PASSWD"   VARCHAR2(20)      NOT NULL,
   "MEM_NAME"   VARCHAR2(10)      NOT NULL,
   "MEM_BIRTH"   NUMBER      NOT NULL,
   "MEM_GENDER"   CHAR(1)      NOT NULL,
   "MEM_PHONE"   VARCHAR2(20)      NOT NULL,
   "MEM_EMAIL"   VARCHAR2(30)      NOT NULL,
   "MEM_ADDR1"   VARCHAR2(50)      NOT NULL,
   "MEM_ADDR2"   VARCHAR2(50)      NULL,
   "MEM_ENROLLDATE"   DATE      DEFAULT SYSDATE,
   "MEM_POINT"   NUMBER      NULL,
   "MEM_COUPON"   NUMBER      NULL,
   "GRADE_CODE"   VARCHAR2(10)      DEFAULT '3'
);

CREATE TABLE "GRADE" (
   "GRADE_CODE"   VARCHAR2(10)      NOT NULL,
   "GRADE_NAME"   VARCHAR2(10)      NOT NULL,
   "GRADE_DESC"   VARCHAR2(50)      NOT NULL
);

CREATE TABLE "POINT" (
   "POINT_CODE"   NUMBER      NOT NULL,
   "POINT_PUBLISH"   DATE      DEFAULT SYSDATE NOT NULL,
   "POINT_VALUE"   NUMBER      NOT NULL,
   "POINT_CONTENT"   VARCHAR2(30)      NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "COUPON" (
   "COUPON_CODE"   NUMBER      NOT NULL,
   "COUPON_NAME"   VARCHAR2(20)      NOT NULL,
   "COUPON_PUBLISH"   DATE      DEFAULT SYSDATE NOT NULL,
   "COUPON_EXPIRE"   DATE      DEFAULT ADD_MONTHS(SYSDATE, 6) NOT NULL,
   "COUPON_VALUE"   NUMBER      NOT NULL,
   "COUPON_CONTENT"   VARCHAR2(30)      NULL,
   "MEM_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "POST" (
   "POST_CODE"   NUMBER      NOT NULL,
   "POST_TITLE"   VARCHAR2(30)      NOT NULL,
   "POST_DATE"   DATE      DEFAULT SYSDATE NOT NULL,
   "POST_CONTENT"   VARCHAR2(100)      NOT NULL,
   "POST_IMAGE"   VARCHAR(255)      NULL,
   "POST_REPLY_YN"   CHAR(1)      DEFAULT 'Y' NOT NULL,
   "POST_REPLY_CONTENT"   VARCHAR2(100)      NULL,
   "POST_OFF_YN"   CHAR(1)      DEFAULT 'N' NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL,
   "BOARD_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "BOARD" (
   "BOARD_CODE"   NUMBER      NOT NULL,
   "BOARD_NAME"   VARCHAR2(30)   NOT NULL
);

CREATE TABLE "BOARD_CATEGORY" (
   "BOARD_CATEGORY_CODE"   NUMBER      NOT NULL,
   "BOARD_CATEGORY_NAME"   VARCHAR2(30)   NOT NULL,
   "BOARD_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "ITEM" (
   "ITEM_CODE"   NUMBER      NOT NULL,
   "ITEM_NAME"   VARCHAR2(20)   NOT NULL,
   "ITEM_PRICE"   NUMBER   NOT NULL,
   "ITEM_OPTION1"   VARCHAR2(30) NULL,
   "ITEM_OPTION2"   VARCHAR2(30)      NULL,
   "ITEM_STOCK"   NUMBER      NOT NULL,
   "ITEM_ORIGIN"   VARCHAR2(20)      NOT NULL,
   "ITEM_DESC"   VARCHAR2(50)      NOT NULL,
   "ITEM_DETAIL"   VARCHAR2(100)      NOT NULL,
   "ITEM_IMAGE"   VARCHAR(255)      NOT NULL,
   "ITEM_NUM_OF_REVIEW"   NUMBER   DEFAULT 0   NOT NULL,
   "ITEM_NUM_OF_QNA"   NUMBER   DEFAULT 0   NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL,
   "SHOP_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "SHOP" (
   "SHOP_CODE"   NUMBER      NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL,
   "SHOP_NAME"   VARCHAR2(30)      NOT NULL,
   "SHOP_ADDR"   VARCHAR2(50)      NOT NULL,
   "SHOP_PHONE"   VARCHAR2(20)      NOT NULL,
   "SHOW_DESC"   VARCHAR2(100)      NOT NULL
);

CREATE TABLE "ORDER" (
   "ORDER_CODE"   NUMBER      NOT NULL,
   "ORDER_DATE"   DATE      DEFAULT SYSDATE NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL,
   "DEL_CODE"   NUMBER      NOT NULL,
   "SHOP_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "DELIVERY" (
   "DEL_CODE"   NUMBER      NOT NULL,
   "DEL_STATUS"   CHAR(1)      DEFAULT 3 NOT NULL,
   "DEL_DESTINATION"   VARCHAR2(50)      NOT NULL
);

CREATE TABLE "PARKING" (
   "Key"   PARKING_AREA      NOT NULL,
   "Field"   PARKING_YN   DEFAULT 'N'   NOT NULL
);

CREATE TABLE "ITEM_REVIEW" (
   "ITEM_REVIEW_CODE"   NUMBER      NOT NULL,
   "ITEM_CODE"   NUMBER      NOT NULL,
   "ITEM_REVIEW_TITLE"   VARCHAR2(30)      NOT NULL,
   "ITEM_REVIEW_CONTENT"   VARCHAR2(100)      NOT NULL,
   "MEM_CODE"   NUMBER      NOT NULL
);

CREATE TABLE "ITEM_QNA" (
   "ITEM_QNA_CODE"   NUMBER      NOT NULL,
   "ITEM_QNA_TITLE"   VARCHAR(30)      NOT NULL,
   "ITEM_QNA_CONTENT"   VARCHAR(100)      NOT NULL,
   "ITEM_QNA_REPLY"   VARCHAR(100)      NULL,
   "ITEM_QNA_SECRET"   CHAR(1) DEFAULT 'N'      NOT NULL,
   "MEM_CODE_Q"   NUMBER      NOT NULL,
   "MEM_CODE_R"   NUMBER      NOT NULL
);

ALTER TABLE "MEMBER" ADD CONSTRAINT "PK_MEMBER" PRIMARY KEY (
   "MEM_CODE"
);

ALTER TABLE "GRADE" ADD CONSTRAINT "PK_GRADE" PRIMARY KEY (
   "GRADE_CODE"
);

ALTER TABLE "POINT" ADD CONSTRAINT "PK_POINT" PRIMARY KEY (
   "POINT_CODE"
);

ALTER TABLE "COUPON" ADD CONSTRAINT "PK_COUPON" PRIMARY KEY (
   "COUPON_CODE"
);

ALTER TABLE "POST" ADD CONSTRAINT "PK_POST" PRIMARY KEY (
   "POST_CODE"
);

ALTER TABLE "BOARD" ADD CONSTRAINT "PK_BOARD" PRIMARY KEY (
   "BOARD_CODE"
);

ALTER TABLE "BOARD_CATEGORY" ADD CONSTRAINT "PK_BOARD_CATEGORY" PRIMARY KEY (
   "BOARD_CATEGORY_CODE"
);

ALTER TABLE "ITEM" ADD CONSTRAINT "PK_ITEM" PRIMARY KEY (
   "ITEM_CODE"
);

ALTER TABLE "SHOP" ADD CONSTRAINT "PK_SHOP" PRIMARY KEY (
   "SHOP_CODE",
   "MEM_CODE"
);

ALTER TABLE "ORDER" ADD CONSTRAINT "PK_ORDER" PRIMARY KEY (
   "ORDER_CODE"
);

ALTER TABLE "DELIVERY" ADD CONSTRAINT "PK_DELIVERY" PRIMARY KEY (
   "DEL_CODE"
);

ALTER TABLE "PARKING" ADD CONSTRAINT "PK_PARKING" PRIMARY KEY (
   "Key"
);

ALTER TABLE "ITEM_REVIEW" ADD CONSTRAINT "PK_ITEM_REVIEW" PRIMARY KEY (
   "ITEM_REVIEW_CODE",
   "ITEM_CODE"
);

ALTER TABLE "ITEM_QNA" ADD CONSTRAINT "PK_ITEM_QNA" PRIMARY KEY (
   "ITEM_QNA_CODE"
);

ALTER TABLE "SHOP" ADD CONSTRAINT "FK_MEMBER_TO_SHOP_1" FOREIGN KEY (
   "MEM_CODE"
)
REFERENCES "MEMBER" (
   "MEM_CODE"
);

ALTER TABLE "ITEM_REVIEW" ADD CONSTRAINT "FK_ITEM_TO_ITEM_REVIEW_1" FOREIGN KEY (
   "ITEM_CODE"
)
REFERENCES "ITEM" (
   "ITEM_CODE"
);

CREATE SEQUENCE SEQ_MEMCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_BOARDCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_COUPONCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_DELCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_ITEMCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_DELCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_ITEMQNACODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_ITEMREVIEWCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_ORDERCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_POSTCODE
INCREMENT BY 1
START WITH 20190000000;

CREATE SEQUENCE SEQ_SHOPCODE
INCREMENT BY 1
START WITH 20190000000;

INSERT INTO GRADE
VALUES (1, 'ADMIN', '������');

COMMIT;

