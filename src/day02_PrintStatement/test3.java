package day02_PrintStatement;

public class test3 {
    public static void main(String[] args) {
       int n=0;
      do{
          n=n++ + --n - (n%3);
      }while(++n<4);
        System.out.println(n);
    }

}
