package com.mazhar.Assignments;

//import com.mazhar.Student;

import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOdd(num);
        int num2 = sc.nextInt();
        xorAnd(num,num2);

    }
    static  void evenOrOdd(int  num)
    {
        if((num&1)>0){
            System.out.println("oddd");
        }
        else
            System.out.println("Even");

    }
    static void xorAnd(int a , int b)
    {
        System.out.println(a&b);
        System.out.println(a|b);
    }

}
