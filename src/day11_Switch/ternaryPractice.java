package day11_Switch;

public class ternaryPractice {
    public static void main(String[] args) {
        double salary=50_000;
        int creditscore=630;
        String loan=(salary>=60000 && creditscore>=650)? "loan approved" : "loan denied";
        System.out.println(loan);
    }
}
