-- CLASSES --

INSERT INTO classes (id, session, level, time)
SELECT 1,
       1,
       'Minnows',
       '9-10am' WHERE NOT EXISTS (SELECT 1 FROM classes WHERE id = 1);

INSERT INTO classes (id, session, level, time)
SELECT 2,
       2,
       'Minnows',
       '9-10am' WHERE NOT EXISTS (SELECT 1 FROM classes WHERE id = 2);

-- STUDENTS --

INSERT INTO students (id, name, session, birth_year, level, time_slot1, time_slot2, class_id)
SELECT 1,
       'Josh',
       1,
       2017,
       'Minnows',
       '9-10am',
       '10-11am',
       1 WHERE NOT EXISTS (SELECT 1 FROM students WHERE id = 1);

INSERT INTO students (id, name, session, birth_year, level, time_slot1, time_slot2, class_id)
SELECT 2,
       'Eva',
       1,
       2016,
       'Minnows',
       '9-10am',
       '10-11am',
       1 WHERE NOT EXISTS (SELECT 1 FROM students WHERE id = 2);

INSERT INTO students (id, name, session, birth_year, level, time_slot1, time_slot2, class_id)
SELECT 3,
       'Lucy',
       1,
       2013,
       'Minnows',
       '9-10am',
       '10-11am',
       1 WHERE NOT EXISTS (SELECT 1 FROM students WHERE id = 3);

INSERT INTO students (id, name, session, birth_year, level, time_slot1, time_slot2, class_id)
SELECT 4,
       'Matt',
       2,
       2018,
       'Minnows',
       '9-10am',
       '10-11am',
       2 WHERE NOT EXISTS (SELECT 1 FROM students WHERE id = 4);