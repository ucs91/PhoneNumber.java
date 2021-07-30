package day13_scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter first name");
        String firstname= scan.next();

        System.out.println("enter last name");
        String lastname= scan.next();

        String fullname=firstname+" "+lastname;

        System.out.println("fullname = "+fullname);



    }



}
