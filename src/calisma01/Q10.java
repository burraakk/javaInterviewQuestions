package calisma01;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */

        String str = "Ali came to school and Ayse came to school";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        List<String> wordList = new ArrayList<String>();
        for (String w : words) {
            wordList.add(w.replaceAll("\\W", ""));
        }
        System.out.println(wordList);

        Map<String, Integer> numOfWords = new HashMap<>();

        for(String w : wordList) {
            if (numOfWords.containsKey(w)){
                numOfWords.put(w, numOfWords.get(w)+1);
            }else{
                numOfWords.put(w,1);
            }
        }
        System.out.println(numOfWords);
    }
}
