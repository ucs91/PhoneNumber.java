package day13_scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter miles");
        double miles= scan.nextDouble();
        double Km=miles*1.609;
        System.out.println(Km+" kilometers");






    }


}/*
2. Write a program thta can convert Miles to KM
        Ex:
        Enter miles:
        10.0

        output:
        16.09 kilometers
*/