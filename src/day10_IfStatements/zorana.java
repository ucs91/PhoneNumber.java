package day10_IfStatements;

public class zorana {
    public static void main(String[] args) {
        int num1 = 15;
        String output= " ";
        String finra =(num1%3==0 && num1%5==0)? "FINRA" :(num1%5==0)? "RA":(num1%3==0)?
                "FIN" :" " +num1;
        System.out.println(finra);
    }
}
