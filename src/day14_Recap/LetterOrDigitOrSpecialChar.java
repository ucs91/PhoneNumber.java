package day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {

        char ch='+';

        boolean isdigit=ch>='0' && ch<='9';
        boolean isletter=(ch>='A' && ch<'Z') || (ch>='a' && ch<='z');

if(isdigit){
    System.out.println(ch+" is digit");
}else if(isletter){
    System.out.println(ch+" is letter");
}else{
    System.out.println("special character");
}


    }
}
