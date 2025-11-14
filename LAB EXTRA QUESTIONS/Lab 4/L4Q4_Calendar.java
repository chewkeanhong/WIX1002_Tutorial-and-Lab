package l4q4_calendar;
import java.util.Scanner;

public class L4Q4_Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Input first day of the year
        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int firstDay = input.nextInt();

        // Validate starting day
        if (firstDay < 0 || firstDay > 6) {
            System.out.println("Invalid starting day!");
            return; // stop the program
        }

        // Input month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return; // stop the program
        }

        // Names of months
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Days in each month
        int[] daysInMonth = {
            31,
            isLeapYear(year) ? 29 : 28, // February
            31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Calculate starting day of the selected month
        int startingDay = firstDay;
        for (int i = 1; i < month; i++) {
            startingDay = (startingDay + daysInMonth[i - 1]) % 7;
        }

        // Print calendar header
        System.out.println("\n      " + monthNames[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 0; i < startingDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        int totalDays = daysInMonth[month - 1];
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            // New line after each Saturday
            if ((day + startingDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Leap year helper method
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
