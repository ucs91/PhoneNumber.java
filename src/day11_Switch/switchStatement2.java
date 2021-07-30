package day11_Switch;

public class switchStatement2 {
    public static void main(String[] args) {
        String name="cybertek";
        switch (name){
            case "chrome":
                System.out.println("chrome is selected");
                break;
            case "firefox":
                    System.out.println("firefox is selected");
                    break;

            default:
                System.err.println("invalid browser name");
                break;


        }

    }
}
