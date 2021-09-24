package com.mazhar.Assignments;

public class VarArgsExample
{
    public static void main(String[] args) {
        varargs(1,2,3);
    }

    private static void varargs(int ... varargs)
    {int sum=0;
        for(int i=0;i<varargs.length;i++)
        {
            sum=varargs[i]+sum;
        }
        System.out.println(sum);
    }
}
