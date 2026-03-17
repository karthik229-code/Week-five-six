import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] math = new double[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks: ");
            phy[i] = sc.nextDouble();
            chem[i] = sc.nextDouble();
            math[i] = sc.nextDouble();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) +
                    ": % = " + percent[i] +
                    " Grade = " + grade[i]);
        }
    }
}