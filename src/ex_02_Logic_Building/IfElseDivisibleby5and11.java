package ex_02_Logic_Building;

import java.util.Scanner;

public class IfElseDivisibleby5and11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if(number%5==0&&number%11==0){
            System.out.println("Number is divisible by 5 and 11 both");
        }
        else if(number%5==0){
            System.out.println("Number is divisible by 5");
        }
        else if (number%11==0) {
            System.out.println("Number is divisible by 11");
        }
        else {
            System.out.println("Wrong Input");
        }

    }
}
