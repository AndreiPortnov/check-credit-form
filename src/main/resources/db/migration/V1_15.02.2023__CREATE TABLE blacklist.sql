-- CREATE SEQUENCE blacklist_sequence//найти поля в другом проекте

CREATE TABLE IF NOT EXISTS blacklist (
    id INT8 PRIMARY KEY,
    first_name VARCHAR,//задать лимиты
    second_name VARCHAR,
    date_of_birth VARCHAR,
    passport_serial VARCHAR,
    passport_number VARCHAR
);

