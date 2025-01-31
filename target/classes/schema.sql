CREATE TABLE IF NOT EXISTS students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    session INTEGER,
    birth_year INTEGER,
    level VARCHAR(50),
    time_slot_1 VARCHAR(50),
    time_slot_2 VARCHAR(50),
    class_id BIGINT NULL,
    FOREIGN KEY (class_id) REFERENCES classes(id)
);

CREATE TABLE IF NOT EXISTS classes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    session INTEGER,
    level VARCHAR(50),
    time VARCHAR(50)
);
