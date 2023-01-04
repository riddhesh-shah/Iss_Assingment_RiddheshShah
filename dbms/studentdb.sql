use student_db;

-- create student table
Create Table student (
    id int Primary Key Auto_Increment,
    first_name varchar(255) Not Null,
    last_name varchar(255) Not Null,
    phone varchar(255) Not Null,
    gpa float Not Null,
    course_id int,
    Foreign Key (course_id) References course(course_id)
);

-- create course table
Create Table course (
    id int Primary Key Auto_Increment,
    title varchar(255) Not Null,
    semester int Not Null,
);

-- insert data into student table
Insert into student(first_name,last_name,phone,gpa,course_id) Values
("Riddhesh","Shah",987654321,"95.09",1),
("Divya","Shah",887954321,"85.19",2),
("Vipul","Shah",775254321,"55.95",3),
("Hirak","Shah",987665526,"75.09",2),
("Ankita","Shah",987654000,"69.18",1);

-- insert data into course table
Insert into course(CourseId,CourseName) Values
("Java", 5),
("C++", 4),
("C", 3),

-- Select queries
Select * from student;
Select first_name, last_name from student;

-- distinct keyword
Select distinct course_id from student;

-- student with gpa greater than 75.00
Select * from student where student.gpa >= 75.00;

-- and operator
Select * from student where student.gpa >= 75.00 and student.course_id = 1;

-- or operator
Select * from student where student.gpa >= 75.00 or student.course_id = 1;

-- order by operator
Select * from student order by student.gpa, student.course_id;

-- in and between operator
Select * from student where student.course_id in (select course.id where course.id between 2 and 4);

-- alias
Select first_name as f_name from student;

-- wildcard operator
Select * from student where student.first_name like "S%";
Select * from student where student.first_name like "S%h";
Select * from student where student.first_name like "S___";

-- limit operator
Select * from student limit 2;

-- update operator
Update student set student.gpa = 52.16 where student.id = 3;

-- delete operator
Delete from student where student.id = 5;

-- inner join
Select student.first_name, student.last_name, course.title from student inner join course on student.course_id = course.id;

-- left join
Select student.first_name, student.last_name, course.title from student left join course on student.course_id = course.id;

-- right join
Select student.first_name, student.last_name, course.title from student right join course on student.course_id = course.id;

-- group by
Select count(student.id), student.course_id from student group by student.course_id;

-- having
Select count(student.id), student.course_id from student group by student.course_id having count(student.id) = 1;

-- alter
Alter table student rename column student.gpa to student.cgpa;
Select * from student;

-- view
Create View student_course as
select student.first_name, student.last_name, course.title from student right join course on student.course_id = course.id
Select * from student;

-- stored procedure
Delimiter //
Create Procedure student_enrolling_course (in courseId int)
Begin
    Select * from student_course where student_course.course_id = courseId
End
// Delimiter

-- prepared statement
Prepare student_enrolling_course from 'Select * from student_course where course_id=?';
Set @course_id=1;
Execute student_enrolling_course using @course_id;

Drop Student;
Drop Course;