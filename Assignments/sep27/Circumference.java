package mazhar;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
       double circumference= circumference(r);
        System.out.println(circumference);
    }

    private static double circumference(int r) {
        return 3.14*r*r;
    }
}
