package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("quantos numeros vc irá digitar? ");
        int n = input.nextInt();
        double vect[] = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("digite um número: ");
            vect[i] = input.nextDouble();
        }
        double soma = 0;
        System.out.print("VALORES: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        System.out.println();
        System.out.println("SOMA: " + soma);

        double media = soma / n;
        System.out.println("MÉDIA: " + media);

        input.close();
    }
}