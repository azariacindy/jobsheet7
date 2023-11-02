import java.util.Scanner; // Import Scanner library

public class WhileMultiples07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        int multiple;
        int sum = 0; // Initialize sum to 0
        int counter = 0; // Initialize counter to 0
        double average = 0.0; // Initialize average to 0.0

        System.out.println("Input the multiple : ");
        multiple = input.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
            i++;
        }

        // for (int i = 1; i <= 50; i++) { // this loop will perform iterations from 1-50
        //     if (i % multiple == 0) { // check whether the value i is a multiple of multiple using modulo
        //         sum += i; // check whether the value i is a multiple of multiple using modulo
        //         counter++;
        //         // System.out.println(i + "-");
        //     }
        // }

        if (counter > 0) {
            average = ((double)sum / counter); // calculate the average by dividing the sum with the count
        }

        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d.\n", multiple, sum);
        System.out.printf("The average of the multiples is %.2f.\n", average);

        input.close(); // Close the Scanner to release resources
    }
}
