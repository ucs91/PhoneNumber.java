package day12_scanner;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class EligibleToBuyALCHOHOL {


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();

        if(age>=21){
            System.out.println("you are eligible to buy alcohol");



        }else {
            System.out.println("get out!");
        }


    }





}
