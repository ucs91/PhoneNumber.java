package day19_Loops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word="aabbc";

        String result="";

if(word.length()==5) {
    if (!result.contains("" + word.charAt(0))) {
        result += word.charAt(0);
    }

    if (!result.contains("" + word.charAt(1))) {
        result += word.charAt(1);
    }
    if (!result.contains("" + word.charAt(2))) {
        result += word.charAt(2);
    }
    if (!result.contains("" + word.charAt(3))) {
        result += word.charAt(3);
    }
    if (!result.contains("" + word.charAt(4))) {
        result += word.charAt(4);
    }
}else if(word.length()>5){
    result="Too long";
}else {
    result="Too Short";
}
        System.out.println(result);

    }













}
