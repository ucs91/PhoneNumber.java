package day24_Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4};

        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==element){
                    count++;
                }

            }

            if(count==1){
                System.out.println(element+" ");
            }
        }










    }
}
   /* write a program that can print out the unique numbers from an array of integers
        Ex:
        int[] arr ={1,1,2,3,3,4}

        output:
        2 4

    */