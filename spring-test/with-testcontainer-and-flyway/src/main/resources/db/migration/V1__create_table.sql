CREATE TABLE BOOK
(
    BOOK_ID        BIGINT AUTO_INCREMENT PRIMARY KEY,
    TITLE          VARCHAR(255) not null,
    ISBN           VARCHAR(13)  not null unique,
    PUBLISHED_DATE DATE         not null,
    CREATED_AT     DATETIME     not null
);
