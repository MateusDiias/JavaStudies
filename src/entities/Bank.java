package entities;

public class Bank {
    private int number;
    private String holder;
    private double deposit;

    public Bank() {
    }
    public Bank(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        newDeposite(initialDeposit);
    }

    public Bank(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return deposit;
    }

    public String toString() {
        return "Account " + number +
                ", holder: " + holder +
                ", Balance: $" + deposit;
    }

    public void newDeposite(double depositValue) {
        deposit += depositValue;
    }

    public void withdraw(double withdraw) {
        deposit -= withdraw + 5;
    }
}
