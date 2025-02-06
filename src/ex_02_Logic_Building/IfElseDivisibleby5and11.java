package ex_02_Logic_Building;

public class IfElseDivisibleby5and11 {
    public static void main(String[] args) {
        int number = 95;
        if(number%5==0){
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
