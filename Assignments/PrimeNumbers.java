package com.mazhar;

public class PrimeNumbers
{
    public static void main(String[] args) {
        primeNumbers();
    }

    private static void primeNumbers() {
        int flag=0;
        for(int n=15;n<=80;n++)
        {
            flag=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;break;
                }
            }
            if(flag==0)
            {
                System.out.print(n+" ");
            }
        }
    }
}
