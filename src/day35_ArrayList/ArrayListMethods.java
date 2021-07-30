package day35_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("milk");
        groceryList.add("water");
        groceryList.add("viniger");
        groceryList.add("bread");

        System.out.println(groceryList);

        groceryList.set(0,"toilet paper");

        System.out.println(groceryList);

        groceryList.set(3,"soda");

        System.out.println(groceryList);

        System.out.println("------------------------------------------------------");


        groceryList.remove(1);


        System.out.println(groceryList);

        groceryList.remove("water");

        System.out.println(groceryList);

        boolean r2=groceryList.remove("face mask");

        System.out.println("r2 = "+r2);


        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

//Integer a=30;
      //  list1.remove(Integer.valueOf(30));

        list1.remove((Integer) 30);

        System.out.println(list1);

       // groceryList.clear();
        //System.out.println("groceryList= "+groceryList);

        System.out.println("-----------------------------------------");

        ArrayList<Character> list=new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('C');
        list.add('D');
        list.add('A');

        System.out.println(list);

        list.indexOf('A');// 0
        list.lastIndexOf('A');// 6

        ArrayList<Character> uniqueChars=new ArrayList<>();

        for(Character each:list){
            if(list.indexOf(each)== list.lastIndexOf(each)){
                uniqueChars.add(each);
            }
        }
        System.out.println("uniqueChars ="+uniqueChars);

        boolean hastoilepaper=groceryList.contains("toilet paper");


        System.out.println(hastoilepaper);


        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('D');
        characters.add('A');

        System.out.println(characters);

        ArrayList<Character> result=new ArrayList<>();  //[A,B,C,D]

        for (Character each:characters){
            if(!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println("result ="+result);

        System.out.println("---------------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result2= new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {

           result2.add( nums.get(i));// 400,300,200,100
        }
        System.out.println("result2= "+result2);

    }



}
