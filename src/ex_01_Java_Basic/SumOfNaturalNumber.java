package ex_01_Java_Basic;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i = 1; i <=10 ; i++) {
//            sum = sum + i;
//        }
//            System.out.println("Sum of First 10 Natural Numbers = "+sum);

        int i=1;
        int sum=0;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
