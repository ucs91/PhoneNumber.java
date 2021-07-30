package day21_Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter a number");
            int n= sca.nextInt();
            if(n<0){
                break;// exits the loop
            }

            sum+=n;
        }
        System.out.println("sum= "+sum);









    }
}
