package day20_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence="Java Java";
        int count=0;   //012345678
        /*
        String str1=sentence.substring(0,4);//Java
        String str2=sentence.substring(1,5);//ava
        String str3=sentence.substring(2,6);//va j
        String str4=sentence.substring(3,7);//a Ja
*/

        for (int i = 0; i <= sentence.length()-4; i++) {//i:0,1,2,3,4
            String each = sentence.substring(i, i + 4);
            if (each.equals("Java")) {
                count++;
            } else {
                break;
            }

            System.out.println("count= " + count);
        }




    }
}
