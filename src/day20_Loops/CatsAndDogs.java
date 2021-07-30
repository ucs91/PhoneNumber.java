package day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {

        String sentence="Cat Dog Dog Cat";

        int numberofcat=0; //"Cat"
        int numberofdog=0;
        for (int i = 0; i <= sentence.length()-3; i++) { //i:0 1 2 3 4 5 6 7 8 9 10 11 12  13 14
            String each=sentence.substring(i,i+3);
            if(each.equals("Cat")){
                numberofcat++;
            }

            if(each.equals("Dog")){

                numberofdog++;
            }

        }
        System.out.println("numberofcat=" +numberofcat);
        System.out.println("numberofdog="+numberofdog);











    }
}
