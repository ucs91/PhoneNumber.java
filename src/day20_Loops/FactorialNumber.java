package day20_Loops;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=5; // 5*4*3*2*1
        int result=1;

        for (int i = num; i>=1; i--) {
           result*=i;
        }
        System.out.println("result= "+result);














    }
}
