package day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("enter a word");
        String word=new Scanner(System.in).next();
        String reverseWord=""; //Level==>leveL
        for (int i = word.length()-1;i>=0; i--) {
            reverseWord+=word.charAt(i);

        }

        boolean isPolindrome=word.equals(reverseWord);
        System.out.println("isPolindrome= "+isPolindrome);




    }
}
