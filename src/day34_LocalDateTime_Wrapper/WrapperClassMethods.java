package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str="123";

        int num=Integer.valueOf(str); //unboxing
        // Integer wrapper class

        Integer num2=Integer.parseInt(str); //autoboxing
        // int primitive


        int num3=Integer.parseInt(str);
        //  int primitive

        Integer num4=Integer.valueOf(str);
        // wrapper class



        System.out.println(num-1);

        String str2="true";

        boolean r1=Boolean.parseBoolean(str2);
        //         primitive


        boolean r2=Boolean.valueOf(str2);// unboxing

        Boolean r3=Boolean.parseBoolean(str2);// autoboxing
        //         wrapper

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("------------------------------------------");


        char ch='4';

        boolean isDigit=Character.isDigit(ch);
        boolean isLetter=Character.isLetter(ch);
        boolean isSpecialChar=!Character.isLetter(ch);

        System.out.println("----------------------------------");

        String s="a1b2c3";
        int sum=0;

        for(char each:s.toCharArray()){
            if(Character.isDigit(each)){
           sum+=Integer.parseInt(""+each);
             //  sum +=each;
            }

        }

        System.out.println(sum);

        System.out.println("----------------------------------------------------");

        String s2="AAABBBCCC!@#$%^&124525345";

        String letters="",
                digits="",
                specialChars="";

        for(char each:s2.toCharArray()){
            if(Character.isDigit(each)){
                digits +=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else{
                specialChars+=each;
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }
}
