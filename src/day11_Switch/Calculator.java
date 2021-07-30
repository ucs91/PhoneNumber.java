package day11_Switch;

public class Calculator {

    public static void main(String[] args) {
        double n1=100;
        double n2=2.5f;

        char mathoperator='-';
        switch (mathoperator){
            case'-':
                System.out.println(n1-n2);                break;
            case'+':
                System.out.println(n1+n2);
                break;
            case'*':
                System.out.println(n1*n2);
                break;
            case'/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("invalid");

        }

    }
}
