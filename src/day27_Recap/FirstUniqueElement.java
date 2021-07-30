package day27_Recap;

public class FirstUniqueElement {
    public static void main(String[] args) {

        int []nums={1,1,2,3,3,4};
        int firstuniqueelement=0;


        for (int j = 0; j < nums.length ; j++) {

            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    frequency++;// 2 {1}
                }

            }
            if(frequency==1){ // if element is unique
                firstuniqueelement=nums[j];
                break; // to make sure only the first unique element  is returned from the loop
            }

        }

        System.out.println("firstuniqueelement "+firstuniqueelement);






    }
}
