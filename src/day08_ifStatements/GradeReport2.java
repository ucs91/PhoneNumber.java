package day08_ifStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 95;

        boolean madeA = score >= 90 && score <= 100;

        boolean madeB = !madeA && score >= 80;

        boolean madeC = !madeA && !madeB && score >= 70;

        boolean madeD = !madeA && !madeB && !madeC && score >= 60;

        boolean madeF = !madeA && !madeB && !madeC && !madeD;


        if (score >= 90 && score <= 100) {
            System.out.println("Excellent, You made an A");

        }

        if (score >= 80 && score <= 89) {
            System.out.println("Good job, You made a B");

        }
        if (score >= 70 && score <= 79) {
            System.out.println("You made a C");


        }

    }
}