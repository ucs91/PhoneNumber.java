package day15_String;

import java.util.Locale;
import java.util.Scanner;

public class NameFormatting {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("first name");

        String firstname= scan.nextLine().trim();
        firstname =firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        System.out.println(firstname);






    }










}
