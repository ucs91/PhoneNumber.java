package day02_PrintStatement;

public class test1 {
    public static void main(String[] args) {
        String a="the game was tied at 2-2";
        String b=a.substring(5);

        int in1=a.indexOf("game");
        int in2=b.indexOf("game");

        if(in1==in2){
            System.out.println(in1);
        }else{
            System.out.println(in2);
        }



    }
}
