package day15_String;

public class Reverse {

    public static void main(String[] args) {
        String word="blank";

        String result="";

        if(word.length()>5){
            result="too long";

        }else if(word.length()<5){
            result="too short";
        }else{
            result+=word.charAt(4);
            result+=word.charAt(3);
            result+=word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);
        }

        System.out.println("result= "+result);


    }






}
