import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] even = new int[num];
        int[] odd = new int[num];

        int e = 0, o = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[e++] = i;
            } else {
                odd[o++] = i;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}