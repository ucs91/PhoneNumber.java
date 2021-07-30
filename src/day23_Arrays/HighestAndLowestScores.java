package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] scores={85,75,95,90,100};

        String[]names={"Mike","Adam","Tonny","John","Ammy"};

        int maxScore=scores[0];
        String maxName="";


        for (int i = 0; i <= names.length-1 ; i++) {
            String eachName=names[i];
            int eachScore=scores[i];
            if(eachScore>maxScore){
                maxScore=eachScore;
                maxName=eachName;
            }
        }
        System.out.println(maxName +"="+maxScore);









    }
}
