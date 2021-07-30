package day16_String;

public class EmailDomain {

    public static void main(String[] args) {

        String email="Cybertek@gmail.com";


        int beginningIndex=email.indexOf("@") +1;
        int endeingIndex=email.lastIndexOf(".");
        String domain=email.substring(beginningIndex,endeingIndex);

        System.out.println("domain= "+domain);




    }








}
