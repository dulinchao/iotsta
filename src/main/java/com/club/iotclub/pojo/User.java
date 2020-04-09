package com.club.iotclub.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String studentId;
    private String name;
    private String sex;
    private String college;
    private String profession;
    private Date createTime;
}
