package day13_scanner;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("you are full time employee: ");
        boolean isfulltime=scan.hasNextBoolean();

        System.out.println("you are an adult: ");
        boolean isadult=scan.hasNextBoolean();

        System.out.println("you are maried: ");
        boolean ismarried=scan.hasNextBoolean();

        System.out.println("isfulltime "+isfulltime);
        System.out.println("isadult "+isadult);
        System.out.println("ismarried "+ismarried);





    }








}
