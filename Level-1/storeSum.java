import java.util.Scanner;

public class storeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || i == 10) {
                break;
            }

            arr[i] = num;
            i++;
        }

        // Print numbers
        System.out.println("Numbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
            sum += arr[j];
        }

        System.out.println("\nSum = " + sum);
    }
}