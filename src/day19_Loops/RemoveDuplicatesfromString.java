package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {

        String word="aasfasfdfdfdfsgdsdsdsd";
        String result="";//"asfdg"

        for (int i = 0; i <=word.length()-1 ; i++) {
if(!result.contains(""+word.charAt(i))) {
    result += word.charAt(i);
}
        }


        System.out.println("result= "+result);


    }
}
