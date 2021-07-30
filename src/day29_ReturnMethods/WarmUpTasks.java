package day29_ReturnMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        posNegZero(-10);

        System.out.println("---------------------");

        int[]numbers={10,20,0,-30,-5};

        for (int number:numbers) {
            posNegZero(number);
        }
        int []array1={1,2,3},array2={4,5,6,7,8};
        mergeToArrays(array1,array2);
        System.out.println("-------------------------------------");

        formatFullName("cYbErtEk","SCHOOL");

        System.out.println("--------------------------");

        printMaxNumber(14,56);

        System.out.println("---------------------------------");

        sortDesc(new int []{4,5,3,8,6,9});

    }



    public static void posNegZero(int number){
        if(number>0){
            System.out.println(number+" is positive");
        }else if(number<0){
            System.out.println(number+" is negative");
        }else{
            System.out.println(number+" is zero");
        }

    }

    public static void mergeToArrays(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
     int i=0;
    for(int each:arr1){
        arr3[i++]=each;
    }
        for(int each:arr2){
            arr3[i++]=each;
        }

    System.out.println(Arrays.toString(arr3));
}

    public static void formatFullName(String firstName, String lastname){
      firstName=  firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
      lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
      String fullname=firstName+" "+lastname;
        System.out.println(fullname);
    }

    public static void printMaxNumber(int num1,int num2){
        System.out.println((num1>num2?num1:num2 )+" is max number");
    }

    public static void sortDesc(int[]arr){
        Arrays.sort(arr);
        int[]result=new int[arr.length];

        for(int i = arr.length-1, j=0; i>=0 ; i--, j++) {
           result[j]=arr[i];
        }
        System.out.println(Arrays.toString(result));
    }



}
