package mazhar;

import java.util.Scanner;

import static java.lang.Integer.sum;


public class ScannerProblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The nums");

        int a= sc.nextInt();
        int b= sc.nextInt();
     int c=aggregate(a,b);
     int d=mul(a,b);
        System.out.println("sum="+c);
        System.out.println("mul="+d);

    }

    private static int aggregate(int a, int b)
    {
        return a+b;
    }

    private static int mul(int a, int b) {
        return a*b;
    }
}
