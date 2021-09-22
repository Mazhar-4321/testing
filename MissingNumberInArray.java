package com.mazhar;

public class MissingNumberInArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9,10,11,12,13,14,15};
        int n=15;
        int sum=n*(n+1)/2;
        int arr_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr_sum=arr_sum+arr[i];
        }
        System.out.println(sum-arr_sum);
    }
}
