package day19_Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SumOf10Number {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int result=0;

        for (int i = 1; i <=10 ; i++) {
            System.out.println("enter a number:");
            result+=scan.nextInt();
        }


        System.out.println("result= "+result);
scan.close();




    }












}
