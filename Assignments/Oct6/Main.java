package com.mazhar.Assignments;

//import com.mazhar.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int arr[] = new int [26];
       for(int i=0;i<s.length();i++)
       {
           arr[s.charAt(i)-97]=1;
       }
      for(int x : arr)
      {
          if(x==0)
          {
              System.out.println("Not A Panagram");return;
          }
      }
        System.out.println("Panagram");
    }


}
