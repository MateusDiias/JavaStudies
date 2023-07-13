package Inheritance_polymorphism;

import Inheritance_polymorphism.Entities.CompanyPayer;
import Inheritance_polymorphism.Entities.IndividualPayer;
import Inheritance_polymorphism.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTax {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new IndividualPayer(name, anualIncome, health));
            } else {
                System.out.print("Number of Employees: ");
                int number = sc.nextInt();
                list.add(new CompanyPayer(name, anualIncome, number));
            }
        }
        System.out.println("");
        System.out.println("TAXES PAID:");

        int sum = 0;
        for (TaxPayer tax : list) {
            System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.taxCalc()));
            sum += tax.taxCalc();
        }

        System.out.println("TOTAL TAXES: $" + sum);
        sc.close();
    }
}
