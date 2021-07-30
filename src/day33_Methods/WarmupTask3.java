package day33_Methods;

import day27_Recap.ArraysUtility;

import java.util.Arrays;

public class WarmupTask3 {

    public static void main(String[] args) {
        int[] array={1,1,2,3,3};
        int[]result={};

        for (int each:array) {
            if(frequency(array,each)==1){

            }

        }

    }


                                   //{1,1,2,3,3},  1
      public static int frequency(int[]array,int element){
          int count=0;

          for (int each:array) {
              if(each==element){
                  count++;
              }
          }

          return count;
      }












}
/*
Task3:
        1. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

        2. create method that accepts one double array and one double number and returns the frequency of the number


        3. create method that accepts one String array and one String and returns the frequency of the String
                Ex:
                    String[] array = {"Apple", "Apple", "Apple", "Orange"}

                    frequency(array, "Orange") ==> 1

        4. create method that accepts one char array and a char and returns the frequency of the char

 */