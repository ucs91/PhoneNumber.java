package day13_scanner;

import java.util.Scanner;

public class NextMethod2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter age");
        int age = scan.nextInt();
scan.nextLine();
        System.out.println("job title");
        String jobtitle= scan.nextLine();

        System.out.println("age= "+age);
        System.out.println("jobtitle= "+jobtitle);
    }





}
