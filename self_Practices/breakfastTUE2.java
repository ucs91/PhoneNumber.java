import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class breakfastTUE2 {

    public static void main(String[] args) {
        int number = 9;

        switch (number) {
            case 15:
                if (number % 3 == 0 && number % 5 == 0)
                    System.out.println("FizzBuzz");
                break;
            case 10:
                if (number % 5 == 0)
                    System.out.println("Buzz");
                break;
            case 9:
                if (number % 3 == 0)
                    System.out.println("Fizz");
                break;
            default:
                System.out.println("invalid");


        }

    }







}
