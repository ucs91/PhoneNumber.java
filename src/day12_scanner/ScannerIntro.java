package day12_scanner;
import java.util.Scanner;
public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        int addition= num1+num2;
        int subtraction=num1-num2;
        int multiplication=num1*num2;
        int division= num1%num2;
        System.out.println("addition= "+addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);


    }






}
