package day20_Loops;

public class branchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if(i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------");

        for (int i = 0; i <=5; i++) {
            if(i==3){
                continue; //skip
            }
            System.out.println(i);
        }
        System.out.println("---------------------------");
        // print the odd numbers btw 1~10. MUST use continue !!
        for (int i = 0; i < 11; i++) {
             if(i%2==0){
                 continue;
             }
            System.out.print(i);

        }
        System.out.println("-------------------");

        for (int i = 0; i < 100; i++) {
            if(i%15==0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println("--------------------------");

        //print all letters except D,T, X


        for (char i = 'A'; i <='Z' ; i++) {
            if (i=='D'|| i=='T'|| i=='X'){
                continue;
            }
            System.out.print(i);
        }






    }
}
