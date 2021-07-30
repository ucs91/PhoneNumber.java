package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {

    public static void main(String[] args) {
        short s=10;
        int num=s;
        Integer num2=(int)s; //Autoboxing: converting primitive value to wrapper class value

        char ch='@';
        Character ch2=(Character) ch; //Autoboxing

        Byte b1=10;
        byte b2=b1;//unboxing
        short b3=b1;//unboxing
        int b4=b1; //unboxing
        long b5=b1;//unboxing
        float b6=b1;//unboxing
        double b7=b1;//unboxing

        System.out.println("-----------------------------------------------------------------------------------");

        byte c1=10;
        Byte c2=c1;//Autoboxing, wrapper class only accepts it's own primitive





    }
}
