import java.util.Scanner;

public class daysmonth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month number (1-12): ");
            int month = scanner.nextInt();

            int daysInMonth = 0;
            switch (month) {
                case 1:
                    daysInMonth = 31;
                    System.out.print("january");
                    break;
                case 2:
                    daysInMonth = 28;
                    System.out.print("febuary");
                    break;
                case 3:
                    daysInMonth = 31;
                    System.out.print("march");
                    break;
                case 4:
                    daysInMonth = 30;
                    System.out.print("april");
                    break;
                case 5:
                    daysInMonth = 31;
                    System.out.print("may");
                    break;
                case 6:
                    daysInMonth = 30;
                    System.out.print("june");
                    break;
                case 7:
                    daysInMonth = 31;
                    System.out.print("july");
                    break;
                case 8:
                    daysInMonth = 31;
                    System.out.print("agust");
                    break;
                case 9:
                    daysInMonth = 30;
                    System.out.print("september");
                    break;
                case 10:
                    daysInMonth = 31;
                    System.out.print("octomber");
                    break;
                case 11:
                    daysInMonth = 30;
                    System.out.print("november");
                    break;
                case 12:
                    daysInMonth = 31;
                    System.out.print("december");
                    break;
                default:
                    System.out.println("Invalid month number.");
                    break;
            }

            if (daysInMonth != 0) {
                System.out.println("Number of days in month " + month + " is: " + daysInMonth);
            }
            scanner.close();
        }
    }