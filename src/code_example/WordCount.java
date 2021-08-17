package code_example;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scn.nextLine();
        WordCount wc = new WordCount();
        int count = wc.count(sentence);
        System.out.println("total words in sentence: "+count);
    }

    public int count(String sentence){
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        return words.length;
    }
}
