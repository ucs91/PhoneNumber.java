package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;


public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate eid=LocalDate.of(2021,7,20);

        System.out.println(eid);

        LocalDate today=LocalDate.now();

        System.out.println(today);

        System.out.println("---------------------------------------------------");

        String[] names={"John","Daniel","Josh"};

        LocalDate [] DoB={LocalDate.of(1990,5,25),
                LocalDate.of(1980,6,20),
        LocalDate.of(1985,7,28)};


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s birthday is: "+DoB[i]);

        }
        System.out.println("-------------------------------------------------------");

        LocalDate person1=LocalDate.of(1980,12,11);
        LocalDate person2=LocalDate.of(1980,12,25);


        if(person1.isBefore(person2)){
            System.out.println("person1 is older");
        }else {
            System.out.println("person2 is older");
        }
         if(person1.isAfter(person2)){
             System.out.println("person1 is younger");
         }else{
             System.out.println("person2 is younger ");
         }
        System.out.println("--------------------------------------------------------------");

        boolean r1=person1.isLeapYear();
        System.out.println(r1);

        System.out.println("------------------------------------------------------------");

        LocalDate currentDate=LocalDate.now();

        System.out.println(currentDate);

        LocalDate unitAssessment3=currentDate.plusDays(14);

        System.out.println(unitAssessment3);

        LocalDate unitAssessment4=currentDate.plusMonths(6);

        System.out.println(unitAssessment4);
        LocalDate examDate=currentDate.plusWeeks(5);
        System.out.println(examDate);

    }

}
