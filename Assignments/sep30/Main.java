package com.mazhar.Assignments;

//import com.mazhar.Student;

import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
        int arr[] = {20,10,30,10,30};
    }
    static void method1(int arr[])
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
    static void method2(int arr[])
    {
        int p=-1;
        int ans=-1;
       for(int i=0;i<arr.length;i++)
       {
           p=-1;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                   p=i;
               }
           }
           if(p==-1){ans=arr[i];}
       }
        System.out.println(ans);
    }
}
