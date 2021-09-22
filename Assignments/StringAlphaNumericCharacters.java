package com.mazhar;

import java.util.Scanner;

public class StringAlphaNumericCharacters
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        check(str);
    }
    static  void check(String s)
    {
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
            {

            }
            else
            {
                if(s.charAt(i)-97>=0&&s.charAt(i)<=25)
                {

                }
                else
                {
                    if(s.charAt(i)-65>=0&&s.charAt(i)<=25)
                    {

                    }
                    else
                    {
                        flag=1;break;
                    }
                }
            }


        }
        if(flag==1){
            System.out.println("Non alpha numeric characters");
        }
        else
        {
            System.out.println("alpha numeric characters");
        }
    }
}
