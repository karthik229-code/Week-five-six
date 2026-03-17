import java.util.Scanner;

public class friendsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 3;
        int[] age = new int[size];
        double[] height = new double[size];

        int index = 0;

        while (true) {
            System.out.print("Enter age (or -1 to stop): ");
            int a = sc.nextInt();

            if (a == -1) break;

            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            // Resize if full
            if (index == size) {
                size *= 2;

                int[] newAge = new int[size];
                double[] newHeight = new double[size];

                for (int i = 0; i < age.length; i++) {
                    newAge[i] = age[i];
                    newHeight[i] = height[i];
                }

                age = newAge;
                height = newHeight;
            }

            age[index] = a;
            height[index] = h;
            index++;
        }

        // Find youngest & tallest
        int minAge = age[0];
        double maxHeight = height[0];

        for (int i = 1; i < index; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
            }

            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }

        System.out.println("Youngest age = " + minAge);
        System.out.println("Tallest height = " + maxHeight);
    }
}