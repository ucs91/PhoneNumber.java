package day23_Arrays;

public class MyClassMates {
    public static void main(String[] args) {

        String[] friends={"Umut", "Can", "Hazal", "Ahmet", "Muhtar"};//size 5
        System.out.println("size: "+friends.length);
        for (int i = 0; i < 5; i++) {
            System.out.println(friends[i]);

        }

        System.out.println("-----------------------------------");

        String[]friends2=new String[5]; //size 5
        System.out.println("size: "+friends2.length);
        friends2[4]="Umut";
        friends2[3]="Zulal";

        for (int i = 0; i < friends2.length; i++) {
            System.out.println(friends2[i]);

        }





    }
}
