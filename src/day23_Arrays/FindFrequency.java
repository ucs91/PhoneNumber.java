package day23_Arrays;

import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String of Letters:");
        String word = scan.next();
        System.out.println("Enter the letter you want to count:");
        char character = scan.next().charAt(0);
        int count = 0;

        for (int i =0; i< word.length(); i++){
            if (character==word.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    }













