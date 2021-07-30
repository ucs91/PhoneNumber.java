package day15_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter first number");
        double num1= scan.nextDouble();

        System.out.println("enter a math operator");
        char mathoperator=scan.next().charAt(0);

        System.out.println("enter second number");
        double num2= scan.nextDouble();

        double result =0;
        switch(mathoperator){

            case'-':
                result=num1-num2;
                break;

            case '+':result= num1+num2;
            break;

            case '*':
                result=num1*num2;
                break;
            case'/': result=num1/num2;
                break;
            default:

                System.out.println("invalid");
                break;

        }
        System.out.println("result= "+result);


    }







}
