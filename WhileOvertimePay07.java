import java.util.Scanner; // Import Scanner library

public class WhileOvertimePay07 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare and initialize variables
        int numEmployee = 0;
        int overtimeHours = 0;
        double overtimePay = 0.0;
        double totalOvertimePay = 0.0;
        String position;

        System.out.print("Employee number : ");
        numEmployee = input.nextInt();

        int i = 0;
        while (i < numEmployee) {
            System.out.print("Position of employee " + (i + 1) + " (director, manager, staff) = ");
            position = input.next();
            System.out.print("Employee " + (i + 1) + " overtime hours : ");
            overtimeHours = input.nextInt();
            i++;

            if (position.equalsIgnoreCase("director")) {
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours * 75000;
            }

            totalOvertimePay += overtimePay;
        }

        System.out.println("Total of Overtime Pay : " + totalOvertimePay);

        // Close the Scanner to release resources
        input.close();
    }
}
