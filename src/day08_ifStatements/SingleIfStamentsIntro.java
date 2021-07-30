package day08_ifStatements;

public class SingleIfStamentsIntro {


    public static void main(String[] args) {
        String name ="Umut";
        int score=45;
        boolean passed= score>=60;

        if (passed) {  // false
            System.out.println(name+ " Congrats you passed the exam");
        }

        if (!passed){

            System.out.println(name+  " you failed the exam");

        }







    }






}
