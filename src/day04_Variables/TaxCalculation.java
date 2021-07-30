package day04_Variables;

public class TaxCalculation {

    public static void main(String[] args) {

        double salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;


        double totastateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;

        System.out.println("Your salary is"+salary);
        System.out.println("You need to pay $" + totalFederalTax + "of federal tax" );


        // You need to pay amount to stateTax = salary * stateTax;






    }






}
