package calisma01;

import java.util.Scanner;

public class Q07_ArmstrongNumber {
    /*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number or not");
        int num = scan.nextInt();
        int temp = num;

        int n ;
        int toplam = 0;

        while(temp>0){
            n = temp % 10;
            toplam += n*n*n;
            temp /= 10;
        }

        if (num == toplam){
            System.out.println(num + " is an Armstrong number");
        }else
            System.out.println(num + " is not an Armstrong number");

    }
}
