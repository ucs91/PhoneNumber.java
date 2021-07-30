package day11_Switch;

public class OrLogicInSwitchStatement {

    public static void main(String[] args) {
        int num = 13;

        switch (num) {


            case 2:
                System.out.println("28 days");
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 5:
                case 7:
            case 8:
            case 10:
            case 12:
            case 1:
            case 3:
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid number");

        }


    }
}
