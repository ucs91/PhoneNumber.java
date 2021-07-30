package day02_PrintStatement;


import java.util.Arrays;
import java.util.Scanner;

public class REPLIT2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6};

        for (int i = 0; i < nums.length; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-1];
            nums[nums.length-1]=temp;



        }System.out.println(Arrays.toString(nums));








    }
}
