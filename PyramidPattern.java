package com.mazhar;

public class PyramidPattern
{
    public static void main(String[] args) {
        int n=5;
        int space =n;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            space--;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
