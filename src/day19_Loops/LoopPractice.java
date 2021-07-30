package day19_Loops;

public class LoopPractice {
    public static void main(String[] args) {

        for(int i=0; i<=1000; i++){//i:0,1,2,3,4,5,6.....1000
            System.out.print(i+" ");

        }


        System.out.println("hello");

        System.out.println("-----------------------------------------------");

        for(int i=1; i<=100; i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
for(int i=1; i<=100;i+=2)//1,3,5,7...
    System.out.print(i+" ");


        System.out.println("-----------------------------------------------------");

        for (int i = 1; i <101 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

            System.out.println("---------------------------------------------");
            String odds="";
            String evens="";

            for (int i1= 1; i <101 ; i++) {
                if(i%2==0){
                    odds+=i+" ";

                }else{
                    evens+=i+" ";
                }
            }
            System.out.println("odds= "+odds);
            System.out.println("evens= "+evens);

        }




    }
}
