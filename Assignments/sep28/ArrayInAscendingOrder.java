package mazhar;

import java.util.Scanner;

public class ArrayInAscendingOrder
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        boolean ans=check(arr);
        System.out.println(ans);
    }

    private static boolean check(int[] arr) {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(i>0&&(arr[i-1]>arr[i]))
            {
                flag=false;
            }

        }
        return flag;

    }
}
