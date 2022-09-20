package calisma01;

import java.util.Scanner;

public class Q06_Palindrome {
    /*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	    For example, "madam" or "nurses run".
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to check if it is palindrome or not");
        String input = scan.nextLine().toLowerCase().replaceAll("\\s","");

        isPalindromeOrNot(input);

    }

    public static void isPalindromeOrNot(String input) {

        String reverseStr = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reverseStr += input.substring(i, i + 1);
        }
        System.out.println("input : " + input);
        System.out.println("reverseStr : " + reverseStr);

        if (input.equals(reverseStr)) {
            System.out.println(input + " is a palindrome");
        }else
            System.out.println(input + " is not a palindrome");

    }
}
