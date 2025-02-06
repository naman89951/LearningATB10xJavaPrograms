package ex_02_Logic_Building;

import java.util.Scanner;

public class ConvertDaysIntoYear {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of days");
        int total_days = scanner.nextInt();

        int years = total_days/365;
        int remaining_days = total_days%365;
        int months = remaining_days/30;
        int days = remaining_days%30;

        System.out.println(total_days + "Days equivalent to: ");
        System.out.println(years + "Years,"+ months +"Months,"+ days +"Days");
    }
}
