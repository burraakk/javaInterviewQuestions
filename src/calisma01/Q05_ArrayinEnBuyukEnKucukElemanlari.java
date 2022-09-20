package calisma01;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_ArrayinEnBuyukEnKucukElemanlari {
    /*
	 	Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array kac elemanli olsun : ");
        int elemanSayisi = scanner.nextInt();

        int[] arr = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(i + ". index'teki elemani giriniz : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("En buyuk eleman : " + arr[arr.length - 1] + "\nEn kucuk eleman : " + arr[0]);
        System.out.println("En buyuk eleman ve en kucuk eleman arasindaki fark : " + (arr[arr.length - 1] - arr[0]));

    }
}
