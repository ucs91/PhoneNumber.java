package day12_scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your hourly rate?");
        double hourlyrate= scan.nextDouble();

        System.out.println("how many hours are you working in a week?");
        int weeklyhour= scan.nextInt();

        System.out.println("how many weeks are you working in a year?");
        int weeks= scan.nextInt();

        double salary= hourlyrate*weeklyhour*weeks;
        System.out.println("YOUR SALARY = $"+salary);
    }





}
