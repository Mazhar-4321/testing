package com.mazhar;

public class Main
{
    public static void main(String[] args) {
        Student [] students= new  Student[5];
        students[0]= new Student();
        students[1]= new Student();
        students[2]= new Student();
        students[3]= new Student();
        students[4]= new Student();
        students[0].setId(1);
        students[0].setStudent_name("MAzhar");
        students[0].setMobile_number(8125629427l);
        students[1].setId(2);
        students[1].setStudent_name("Azhar");
        students[1].setMobile_number(9999999999l);
        students[2].setId(3);
        students[2].setStudent_name("Nazeer");
        students[2].setMobile_number(8888888888l);
        students[3].setId(4);
        students[3].setStudent_name("Sumair");
        students[3].setMobile_number(7777777777l);
        students[4].setId(5);
        students[4].setStudent_name("Shakir");
        students[4].setMobile_number(6666666666l);
        for(int i=0;i< students.length;i++)
        {
            System.out.println(students[i].getId()+" "+students[i].getMobile_number()+" "+students[i].getStudent_name());
        }
    }
}
