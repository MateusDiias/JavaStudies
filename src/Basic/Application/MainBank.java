package Basic.Application;

import Basic.Application.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char askInitialDeposit = sc.next().charAt(0);
        if (askInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            bank = new Bank(accountNumber, accountHolder, initialDepositValue);
        } else {
            bank = new Bank(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        bank.newDeposite(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println("Enter withdraw value: ");
        bank.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(bank);

        sc.close();
    }
}