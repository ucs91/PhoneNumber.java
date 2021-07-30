package day02_PrintStatement;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
     int[]a={1,3,12,5,24,7,9,10};
     boolean[]b= new boolean[a.length];
        for (int i =a.length-1; i >-1 ; i--) {
            if(a[i]%2==0){
                b[a.length-1-i]=true;

            }

        }
        System.out.println(Arrays.toString(b));
    }
}
