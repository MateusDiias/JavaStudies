package ExceptionHandling;

import ExceptionHandling.Entities.Account;
import ExceptionHandling.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            Account account = new Account(number, holder, balance, limit);

            System.out.println();
            System.out.print("Enter the amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
