package day29_ReturnMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        // find max number between 10&20, then multiply it by 2

        int[] numbers = {10, 5, 0, -1, 20, 8, 7};
        int max = numbers[0];
        int min = numbers[0];
        for (int each : numbers) {
            max = max(each, max);
            min = min(each, min);

        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("---------------------------------");

        int[] nums={100,200,500,5,-2,0,-100,-200,-300,2000};
        int maxnumber=maxNumberIntArray(nums);
        int minnumber=minNumberIntArray(nums);

        System.out.println("min number " +minnumber);
        System.out.println("max number "+maxnumber);
    }


    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;

    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }


    public static int maxNumberIntArray(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
         max=   max(max, number);

        }
        return max;
    }

    public static int minNumberIntArray(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
          min=  min(min, number);

        }
        return min;


    }
}