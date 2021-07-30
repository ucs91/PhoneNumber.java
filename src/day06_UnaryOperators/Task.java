package day06_UnaryOperators;

public class Task {

    public static void main(String[] args) {

        int a = 1;

        a= -a-- + a++ / -a-- * --a;
        System.out.println(a);


        int x = 10;
        a= ++x - x-- + x++ + --x;
        System.out.println(a);

        



    }



}
