package day09_IfStatements;

public class BrowserName {

    public static void main(String[] args) {
        String browserName = "Chrome";

        if (browserName == "Chrome") {
            System.out.println(browserName +" Browser is selected");
        } else if (browserName == "Firefox") {
            System.out.println(browserName + " Browser is selected");
        } else if (browserName == "Opera") {
            System.out.println(browserName + " Browser is selected");
        } else if (browserName == " Safari") {
            System.out.println(browserName + " Browser is selected");
        } else {
            System.out.println("Invalid Browse Name");
        }


    }
}