package day19_Loops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min=2144445555;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number:");
            int n= scan.nextInt();// 100 300 50 400 5

            if(n<min){
                min=n;
            }

        }

        System.out.println("min= "+min);












    }
}
