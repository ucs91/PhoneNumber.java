package day35_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        int[] nums=new int [10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);

        ArrayList<Integer> numbers=new ArrayList<>(); // size is 0
        numbers.add(10);// autoboxing 0
        numbers.add(20);// 1
        numbers.add(30);// 2
        numbers.add(40);// 3
        numbers.add(1,15);
// [10, 15, 20, 30, 40]
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        for(Integer each:numbers){
            System.out.println(each);
        }







    }


}
