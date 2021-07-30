package day06_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {


        int a = 100;
        ++a;

        int b = 100;
        --b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");
        int n1=50;
        int n2=n1++;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int a1=100; // 101
        int a2=++a1; // 101

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);


        System.out.println("-----------------");

           int r =200;

        System.out.println(r++);
        System.out.println("r = " + r); // 201

        int p=200;
        System.out.println(++p);
        System.out.println("p = " + p);


        System.out.println("---------------------");
         int y=100;
         int result = y++ +1;

        System.out.println("result = " + result);
        System.out.println("y = " + y);


        int z= 100;
        int result2= ++z + 1;

        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);














    }
}
