package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {

        char grade='P';

        switch (grade){
            case'A':
            case'B':
            case'C':
            case'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid grade");

        }







    }

}
