package OfficeHours;

public class CoverToCentimeter {
    public static void main(String[] args) {

   double feet=5;
   double inches=12;

        System.out.println("calcFeetANDinchesToCentimeters(5,12)= "+ calcFeetANDinchesToCentimeters(5,12));

        System.out.println("calcFeetANDinchesToCentimeters(72)= "+calcFeetANDinchesToCentimeters(72));


          fibo(8);



    }

/*
Task 1 :   Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
        Feet is the first parameter, inches is the second parameter.

        - You should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12.
        Return -1 from the method if either of the above is not true.

        - If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this           method and return that value.

        - Create a second method of the same name but with only one parameter inches is the parameter and validate it           >=0, return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.

        - Call the other overloaded method passing the correct feet and inches calculated so that it can calculate                 correctly.

        - Hints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches
        */

public static double calcFeetANDinchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12)
        return -1;
    double centimeters = ((feet * 12) + inches) * 2.54;
    return centimeters;
}

    public static double calcFeetANDinchesToCentimeters(double inches){

    if(inches<0)
        return -1;

    double remaininngInches=inches%12;
    double feet=inches/12;
        double centimeters = ((feet * 12) + inches) * 2.54;
        return centimeters;

    }

  /*  Task 2 :  Fibonacci

    Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

    Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

    Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

    Ex:
    Input:
            8
    Output:
            0, 1, 1, 2, 3, 5, 8, 13, 21

            index    value
            0          0

            1          1

            2          1   index0+index1

            3          2    index1+index2  // opposite +

            */


public static void fibo(int number){

    int p2=0;
    int p1=1;
    int rresult=0;
    System.out.println(p2);
    System.out.println(p1);
    for (int i = 2; i < number ; i++) {
        rresult=p1+p2;
        System.out.println(rresult);
        p2=p1;
        p1=rresult;
    }
}








}