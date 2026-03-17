import java.util.Scanner;

public class bmi2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3]; // [i][0]=weight, [i][1]=height, [i][2]=bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height: ");
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            double bmi = data[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) +
                    ": Weight=" + data[i][0] +
                    " Height=" + data[i][1] +
                    " BMI=" + data[i][2] +
                    " Status=" + status[i]);
        }
    }
}