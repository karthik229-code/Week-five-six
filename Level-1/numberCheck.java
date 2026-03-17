import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Process
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive and ");
                if (arr[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4]) {
            System.out.println("First and last are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }
    }
}