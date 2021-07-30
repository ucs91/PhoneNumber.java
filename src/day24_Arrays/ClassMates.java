package day24_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String [] classmates={"hazal","umut","can","muhtar","mehmet","hulya"};


        System.out.println(Arrays.toString(classmates));
        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].substring(0,3));
        }






    }

}
/*
1. create string array, and store the names of your  class mates (6)
            print the first three characters of each name
 */