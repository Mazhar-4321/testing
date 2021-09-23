package com.mazhar;

public class ReverseStringWithWords
{
    public static void main(String[] args) {
        String s= "Geekster is my class room";
        usingSplitMethod(s);
        System.out.println();
        withoutUsingSplitMethod(s);

    }
    static void usingSplitMethod(String s)
    {
        String s_array[] =s.split(" ");
        int l= s_array.length-1;
        for(int i=0;i<=l;i++)
        {
            System.out.print(s_array[l-i]+" ");
        }
    }
    static  void withoutUsingSplitMethod(String s)
    {
        String temp="";
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                temp=s.charAt(i)+temp;
            }
            else
            {
                ans=ans+temp+" ";
                temp="";
            }
        }
        System.out.println(ans+temp);
    }
}
