package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter item name");
        String productname= scan.nextLine();

        System.out.println("enter price");
        double price= scan.nextDouble();

        System.out.println("quantity");
        int quantity= scan.nextInt();
double totalprice=price*quantity;
        System.out.println("enter name");
        String name= scan.next();

        System.out.println(name+" your order for "+quantity+" "+productname+" has been places.Your total is $"+totalprice);








    }
}
