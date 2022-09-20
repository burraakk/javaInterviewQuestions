package calisma01;

import java.util.Scanner;

public class Q01 {
    //Write a Java Program to reverse a string
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String str = scanner.nextLine();

        System.out.println(new StringBuilder().append(str));
        System.out.println(new StringBuilder().append(str).reverse());

        StringBuilder reverseStr = new StringBuilder().append(str);
        System.out.println(reverseStr);
        reverseStr = reverseStr.reverse();
        System.out.println(reverseStr);
    }
}
