package day07_ShortHand_Relational;

public class EligibleToBuyAlchocol {

    public static void main(String[] args) {
        String name = "Sabir";
        int age = 23;
        boolean isEligible= age>=21;

        System.out.println(name +" is Eligible to buy alchocol: " +isEligible);

        String weather= "sunny";
        String sky= "Cloudy";
        boolean umberalla= weather =="Raining" && sky =="Cloudy";

        System.out.println("umberalla = " + umberalla);

        String floor="clean";

        String clothes ="folded";
        boolean needToClear= floor=="dirty" || clothes =="unfolded";
        System.out.println("needToClear = " + needToClear);



        String MyCar= "new";

        int money=3000;

        boolean needanewcar= MyCar=="broken" || money>=40000;

        System.out.println("needanewcar = " + needanewcar);











    }





}
