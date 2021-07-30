package day28_CustomMethods;

public class VoidMethodsPractice {

    public static void main(String[] args) {

        printOddNumber(1, 100);

        calculateAge("brown",5.7,"USA",1982);
        calculate(100,200,'-');

    }


    public static void printOddNumber(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
    }

    public static void calculateAge(String eyeColor,double height, String nationality, int birthYear){
        System.out.println("your age is: "+(2021-birthYear));
    }

    public static void calculate(int num1,int num2,char operator){

        switch (operator){
            case'-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case'*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case'/':
                System.out.println("Division: "+(num1/num2));
                break;
            case'%':
                System.out.println("Remainder: "+(num1%num2));
            default:
                System.out.println("invalid");
        }

    }



}