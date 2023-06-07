package Basic.Application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemNegatives {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int n = input.nextInt();
        double vect[] = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = input.nextDouble();
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.print(vect[i] + ", ");
            }
        }

        input.close();
    }
}
