package day08_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {
        int number=100;

        boolean positive=number>0,
                negative=number<0,
                zero=!positive && !negative;

        if(positive){
            System.out.println(number+ " is positive");
        }
        if(negative){
            System.out.println(number+" is negative");

        }
        if(zero){
            System.out.println(number+" is zero");
        }




    }






}
