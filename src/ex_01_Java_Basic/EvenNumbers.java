package ex_01_Java_Basic;

public class EvenNumbers {
    public static void main(String[] args) {
//        for (int i = 1; i <=20 ; i++) {
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        int i=1;
        while(i<20){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
