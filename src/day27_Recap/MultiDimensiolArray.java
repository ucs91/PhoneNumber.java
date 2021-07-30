package day27_Recap;

import java.util.Arrays;

public class MultiDimensiolArray {
    public static void main(String[] args) {

        String [] scrum1={"umut","hazal"};
        String [] scrum2={"zulal","tugba"};
        String [] scrum3={"muhta","onur"};

        String [][] scrumTeam={scrum1,scrum2,scrum3};// lenght:3
       //                         0      1     2

//       umut,hazal
        System.out.println(Arrays.toString(scrumTeam[1]));

        //tugba
        System.out.println(scrumTeam[1][1]);

        System.out.println("---------------------------------------");

        for (String[] eachScrum: scrumTeam) {
            System.out.println(Arrays.toString(eachScrum));

        }


        System.out.println("------------------------");
        for(String[] eachScrum:scrumTeam) {
            for(String eachMember:eachScrum){
                System.out.println(eachMember+" ");
            }

        }


        System.out.println("\n--------------------------------------");

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                System.out.println(scrumTeam[i][j]+" ");

            }


        }
        System.out.println("\n------------------------------------------");
        int[] numbers={1,2,3,4,5}; //{5,2,3,4,1}


        int temp=numbers[0];
        numbers[0]=numbers[4];// [5,2,3,4,5]
         numbers[4]=temp;//{5,2,3,4,1]


        System.out.println(Arrays.toString(numbers));














    }


}
