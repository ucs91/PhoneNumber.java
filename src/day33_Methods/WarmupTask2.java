package day33_Methods;

public class WarmupTask2 {

    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8};
        boolean r1=contains(array,8);
        System.out.println(r1);

    }
    public static boolean contains(int[]array,int element){
        boolean result=false;
        for(int each:array){
            if(each==element){
                return true;
            }
        }

        return result;
    }
}
