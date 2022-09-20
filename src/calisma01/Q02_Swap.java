package calisma01;

public class Q02_Swap {
    //Write a Java Program to swap two numbers
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("*************temp kullanmadan*************");
        System.out.println("Swap oncesi a = " + a);
        System.out.println("Swap oncesi b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swap sonrasi a = " + a);
        System.out.println("Swap sonrasi b = " + b);


        a = 10;
        b = 5;
        System.out.println("\n*************temp kullanarak*************");
        System.out.println("Swap oncesi a = " + a);
        System.out.println("Swap oncesi b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swap sonrasi a = " + a);
        System.out.println("Swap sonrasi b = " + b);
    }
}
