package day13_scanner;

import java.util.Scanner;

public class speedLimit {
    public static void main(String[] args) {
int speedlimit=55;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter current speed:");
        int speed= scan.nextInt();
        if((speed-speedlimit)>0){
            System.out.println("you are driving " +(speed-speedlimit)+ "  mph over the limit. Slow down!");
        }


    }
}/*
3. Write a program for the speed check.
        a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything

        Ex:
        speedLimit = 55;
        Enter current speed:
        105

        output:
        You're driving 50 mph over the limit. Slow down!

        Enter current speed:
        45

        output:
*/