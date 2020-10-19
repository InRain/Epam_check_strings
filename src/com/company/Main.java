package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string 1");
        String s1 = scanner.nextLine();

        System.out.println("Enter string 2");
        String s2 = scanner.nextLine();

        System.out.println(checkStringsBySorting(s1,s2));
    }

    public static boolean checkStringsBySorting(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return sortString(s1).equals(sortString(s2));
    }

    public static String sortString(String inputString){
        char[] input = inputString.toCharArray();
        Arrays.sort(input);
        return new String(input);
    }
}
