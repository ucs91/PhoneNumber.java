package day29_ReturnMethods;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {

        removeDuplicates("AAAABBBBCCCC");


    }





    public static String removeDuplicates(String str){
        String result="";
        str.split(""); //{"A", "A"........"C"}
        for (String each:str.split("")){
            if(!result.contains(each)){
                result+=each;
            }
        }

        System.out.println(result);

        return result;
    }


    /*

    "AAABBBBCCCC"
    "ABC'
     */









}
