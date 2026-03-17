import java.util.Scanner;

public class tableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] result = new int[4]; // for 6,7,8,9

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index] = num * i;
            index++;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + result[index]);
            index++;
        }
    }
}