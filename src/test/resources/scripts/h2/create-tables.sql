CREATE SCHEMA TEST;

CREATE TABLE TEST.PERSON_TBL (
		ID BIGINT  PRIMARY KEY  NOT NULL,
		FIRST_NAME VARCHAR(255) NOT NULL,
		LAST_NAME  VARCHAR(255) NOT NULL,
);


CREATE TABLE TEST.USER_TBL (
		ID BIGINT  PRIMARY KEY  NOT NULL,
		USERNAME VARCHAR(255) NOT NULL,
		STATUS  CHAR(1) NOT NULL,
		PERSON_ID BIGINT NOT NULL,
		FOREIGN KEY (PERSON_ID) REFERENCES TEST.PERSON_TBL(ID)
);

