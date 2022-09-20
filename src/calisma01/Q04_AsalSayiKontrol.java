package calisma01;

import java.util.Scanner;

public class Q04_AsalSayiKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int number = scan.nextInt();
        primeCalculator(number);
    }

    private static void primeCalculator(int number) {

        int count = 0;
        if (number > 0) {

            if (number == 1) {System.out.println("1 is a prime number");}
            else {

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {count++;}
                }

                if (count == 0) {System.out.println(number + " is a prime number");}
                else System.out.println(number + " is not a prime number");

            }

        } else System.out.println("It's not a positive integer.");
    }
}
