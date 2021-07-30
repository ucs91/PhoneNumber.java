package day23_Arrays;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

        int [] array={1,2,3,4,5,6};

        System.out.println(array);
        System.out.println(Arrays.toString(array));


String[] array2=new String[5];

        System.out.println(array2);
        System.out.println(Arrays.toString(array2));
double[]nums=new double[5];

        System.out.println(Arrays.toString(nums));

        String[] student={"umut","hazal","can","deniz"};

        System.out.println(Arrays.toString(student));

        Arrays.sort(student);//the array is sorted inascending order(a to z) //a to z
        System.out.println(Arrays.toString(student));

int[]numbers={9,4,6,3,8,-3};
        System.out.println(Arrays.toString(numbers));
Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("minimum number: "+numbers[0]);
        System.out.println("max number: "+numbers[numbers.length-1]);
        char[]chars={'z','a','d','b'};
Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        int[]num1={1,2,3};
        int[]num2={1,2,3};

      boolean r1 = Arrays.equals(num1,num2);


        System.out.println("r1= "+r1);



    }
}
