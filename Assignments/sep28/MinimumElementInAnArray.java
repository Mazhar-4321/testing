package mazhar;

import java.util.Scanner;

public class MinimumElementInAnArray {
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int min=min(arr);
        System.out.println(min);
    }

    private static int min(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        int min=0;
        for(int i=0;i<arr.length;i++)

        {
            arr[i]=sc.nextInt();
            if(i==0)
            {
                min=arr[i];
            }
            else
            {
                if(min>arr[i])
                    min=arr[i];
            }
        }
        return min;
    }

}
