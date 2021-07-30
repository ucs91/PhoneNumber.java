package day13_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter price of the item: ");
        double price=scan.nextDouble();

        System.out.println("are you prime member?");
        boolean isprime= scan.hasNextBoolean();

        double totalprice= (isprime)? price  :(price>=25)? price: price+ 3.99;

        System.out.println("total price= $" +totalprice);







    }
}
