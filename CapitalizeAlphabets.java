package com.mazhar;

import java.util.Scanner;

public class CapitalizeAlphabets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        str=capitalize(str);
        System.out.println(str);
    }

    private static String capitalize(String str) {
        return  str.toUpperCase();
    }
}
