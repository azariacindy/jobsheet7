import java.util.Scanner;

public class DoWhileLeaveEntitlement07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.println("Enter your current leave entitlement: ");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("Do you want to take leave (y/t)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Number of days: ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave allowance: " + leaveEntitlement);
                } else {
                    System.out.println("Your remaining leave allowance is insufficient!");
                    // break;
                }
            } 

        } while (leaveEntitlement > 0);

        sc.close();
    }
}
