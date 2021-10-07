package com.mazhar.Assignments;

//import com.mazhar.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
        int arr1[]={1,2,4,6,8};
        int arr2[]={3,5,7};
        mergeSortedArrays(arr1,arr2);

        removeElement(arr1,2);

    }
    static void removeElement(int arr[],int k)
    {
        int ar[] = new int[arr.length-1];
        for(int i=0,j=0;i<arr.length;i++,j++)
        {
            if(i==k)
            {
                j--;
                continue;
            }
            else
                ar[j]=arr[i];
        }
        for(int x : ar)
        {
            System.out.println(x);
        }
    }
    static void mergeSortedArrays(int arr1[],int arr2[])
    {
        int arr3[] = new int[arr1.length+arr2.length];
          int i=0;
        for( i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            arr3[i]=arr2[j];
            i++;
        }
        Arrays.sort(arr3);
        for(int x : arr3)
        {
            System.out.println(x);
        }
    }

}
