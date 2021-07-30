package day19_Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ForLoopsPractice2 {
    public static void main(String[] args) {

        for (int i = 65; i <=90 ; i++) {
            System.out.print((char) i+" ");

        }

        System.out.println();
        System.out.println("----------------------------");

        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");

        for (char i = 'Z'; i >='A'; i--) {
            System.out.print(i+" ");


        }
        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 1000; i <=30000 ; i++) {
            System.out.print(i+" ");

        }











    }
}
