import java.util.Scanner; // Import Scanner library

public class ForMultiples07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        int multiple;
        int sum = 0; // Initialize sum to 0
        int counter = 0; // Initialize counter to 0

        System.out.println("Input the multiple : ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
                // System.out.println(i + "-");
            }
        }

        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d.\n", multiple, sum);

        input.close(); // Close the Scanner to release resources
    }
}
