package entities;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double amount;

    public static double conversion() {
        double iof = amount * 1.06;
        return iof * dollarPrice;
    }
}
