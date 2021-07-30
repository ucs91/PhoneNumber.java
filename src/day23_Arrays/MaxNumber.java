package day23_Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int[]number={10,5,4,400,50,0,-1};
        int max=number[0];

        for (int i = 0; i < number.length; i++) {
            int each=number[i];
            if(each>max){
                max=each;
                System.out.println("max= "+max);
            }

        }








    }
}
