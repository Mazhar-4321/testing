package com.mazhar.Assignments;

public class Student {
    private String student_name;
    private long mobile_number;
    private int id;

    public int getId() {
        return id;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
