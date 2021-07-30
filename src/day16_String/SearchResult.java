package day16_String;

public class SearchResult {
    public static void main(String[] args) {
        String result="About 3,640,000,000 result (0.78 seconds)";
        int startIndex= result.indexOf(" ");
        int endIndex=result.indexOf(" r");

        System.out.println(startIndex);
        System.out.println(endIndex);


        String searchResult=result.substring(startIndex+1,endIndex);
        System.out.println("searchResult = "+searchResult);

        int firstIndex=result.indexOf("(");
        int lastIndex=result.indexOf(")");

        String SearchTime=result.substring(firstIndex+1,lastIndex);
        System.out.println("search time= "+SearchTime);









    }
}
