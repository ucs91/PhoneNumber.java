package day13_scanner;

import java.util.Scanner;

public class CentToDollar {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Cents");

        int Cents=input.nextInt();
        int dollars=Cents/100;
        int remainder=Cents%100;

        if(Cents>=0){
            if(remainder==0){
                System.out.println(Cents+" cents equal to "+dollars+" dollars");
            }else{
                System.out.println(Cents+" cents to equal to "+dollars+ " dollars and "+remainder+" cents");
            }

        }

    }









}
/*
1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
        Ex:
        Enter cents
        225

        output:
        225 cents equal to: 2 dollars and 25 cents

        Enter cents
        300 cents equal to: 3 dolloars
        */