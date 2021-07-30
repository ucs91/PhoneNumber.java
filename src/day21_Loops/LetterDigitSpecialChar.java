package day21_Loops;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String input="mn@#123Ab";

        String letters="";
        String digits="";
        String SpecialChars="";

        for (int i = 0; i <= input.length()-1; i++) {
            char each=input.charAt(i);
            if (each>='A'&& each<='Z'){
                letters+=each;
            }else if(each>='a' && each<='z' ){
           letters+=each;
            }else if(each>='0'&& each<='9'){
             digits+=each;
            }else{
                SpecialChars+=each;
            }

        }


        System.out.println("letters= "+letters);
        System.out.println("digits= "+digits);
        System.out.println("SpecialChars= "+SpecialChars);








    }
}
