package calisma01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08 {

    /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");

        String str = "";
        List<String> list = new ArrayList<>();

        while (!str.equals("*")){
            str = scan.nextLine();

            if (!list.contains(str) && !str.equals("*")){
                list.add(str);
            }
        }

        System.out.println(list);




    }
}
