package day10_IfStatements;

public class browserName {
    public static void main(String[] args) {
        String browserName = "Firefox";
        String whichBrowser = (browserName=="Chrome")? browserName+" Browser is selected" :
                (browserName=="Firefox")? browserName+ " Browser is selected ":
                        (browserName=="Opera")? browserName+ " Browser is selected":
                                (browserName=="Safari")? browserName+ " Browser is selected":
                                        browserName+ " Invalid browser name";
        System.out.println(whichBrowser);

    }






}
