create table user
(
    id int auto_increment primary key not null, #主键
    student_id varchar(30), #学号
    name varchar(50), #姓名
    sex varchar(10),   # 性别
    college varchar(20), #学院
    profession varchar(20), #专业
    create_time date #注册时间
);