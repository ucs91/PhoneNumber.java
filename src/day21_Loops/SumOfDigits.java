package day21_Loops;

public class SumOfDigits {
    public static void main(String[] args) {
        
        String str="A1B2C3";
            int sum=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            char each=str.charAt(i);
            if(each>='0'&& each<='9'){
                sum +=each -48;
            }
        }


        System.out.println("sum= "+sum);
        
        
        
        
        
        
        
        
        
        
    }
}
