import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        // A year is a leap year if it is divisible by 4 and not divisible by 100, or if it is divisible by 400.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}







