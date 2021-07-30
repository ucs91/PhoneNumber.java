package day20_Loops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence="Phyton Phyton Phyton";
                       //012345
        int count=0;

        for (int i = 0; i <=sentence.length()-6 ; i++) {
            String each=sentence.substring(i,i+6);
            //                             0, 6
            if(each.equals("Phyton")){
                count++; //increase the count by 1
            }
        }

        System.out.println("count= "+count);





    }
}
