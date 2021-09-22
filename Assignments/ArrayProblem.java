package com.mazhar;

public class ArrayProblem
{
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,12,76,23,64};
        int n=76;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                arr[i]=0;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
