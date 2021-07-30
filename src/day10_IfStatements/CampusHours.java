package day10_IfStatements;

public class CampusHours {


    public static void main(String[] args) {
        int time = 9;
        String result = (time >= 8 && time <= 23) ? "Open" : "Closed";
        System.out.println(result);
    }




}
