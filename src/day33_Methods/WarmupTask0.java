package day33_Methods;

import java.util.Arrays;

public class WarmupTask0 {


    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500,600};
       numbers= remove(numbers,3);


        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------");
String[]students={"umut","hazal","tugba","muhtar","dilem"};

students=remove(students,2);

        System.out.println(Arrays.toString(students));
    }




    //remove the element at given index of array
    public static int[] remove(int[] array, int index){

        if(index<0 ||index>array.length-1){
            System.err.println("invalid index");
           System.exit(0);
        }

        int[] result=new int[array.length-1];

        for (int i = 0, j=0; i < array.length; i++) {
            if(i==index){
                continue;
            }else{
               result[j++]= array[i];
            }
        }
        return result;
    }

    public static String[] remove(String[] array, int index){

        if(index<0 ||index>array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }

        String[]result=new String[array.length-1];

        for (int i = 0, j=0; i < array.length; i++) {
            if(i==index){
                continue;
            }else{
                result[j++]= array[i];
            }
        }
        return result;
    }


}
