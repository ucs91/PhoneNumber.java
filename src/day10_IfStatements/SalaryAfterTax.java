package day10_IfStatements;

public class SalaryAfterTax {

    public static void main(String[] args) {
        double salary=75_000;
        boolean isMarried = false;

        double taxRate=0;
        if(salary >=130000) {
            taxRate = 0.35;
        }else if(salary>=10000) {
                taxRate = 0.30;
            }else if(salary >=80000){
                    taxRate=0.25;
                }else{
                    taxRate=0.20;
                }
                if(isMarried){
                    taxRate-=0.05;
                }
                    double salaryAfterTax= salary - (salary*taxRate);
                System.out.println("Salary After Tax= " +salaryAfterTax);

            }
        }







