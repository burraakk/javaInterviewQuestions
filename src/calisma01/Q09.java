package calisma01;

public class Q09 {
    public static void main(String[] args) {
        /*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
	 */
        findArrays(new int[] {3,5,8,12,7,-2,17,32,123}, 15 );
    }

    public static void findArrays(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + num);
                }
            }
        }

    }
}
