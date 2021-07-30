package day33_Methods;

import java.util.Arrays;

public class WarmupTask1 {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        numbers =reverse(numbers);
        System.out.println(Arrays.toString(numbers));

    }





public static int[] reverse(int[]array){//{1,2,3,4,5}i:last index~0

    int[]result=new int[array.length];//{5,4,3,2,1} j:0~last index

    for (int i = array.length-1, j=0; i >=0 ; i--,j++) {
        result[j]=array[i];

    }

    return result;
}








}
/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
*/