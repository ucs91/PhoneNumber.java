package day29_ReturnMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

        grade(110);


    }

  /*  public static void grade(int score){

        if(score>100||score<0){// if the score is invalid
            System.out.println("invalid");
            return; //exit the method
        }
        if(score>=90){
            System.out.println("A");
        }else if(score>=80) {
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if (score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
    */

public static String grade(int score){
    String result="";

    if(score>=0&&score<=100){
        result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

    }else{
        result="Invalid";
    }

    System.out.println(result);
    return result;

}















}
