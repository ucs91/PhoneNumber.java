package day19_Loops;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str="aabcc"; //b
        String result="";

        for (int i = 0; i <=str.length()-1 ; i++) {
           char ch=str.charAt(i);
            boolean isUnique= str.indexOf(ch)==str.lastIndexOf(ch);

           if(isUnique){
               result+=ch;
           }
        }


        System.out.println("result= "+result);





    }




}
