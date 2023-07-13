package Inheritance_polymorphism;

import Inheritance_polymorphism.Entities.ImportedProduct;
import Inheritance_polymorphism.Entities.Product;
import Inheritance_polymorphism.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Manufacture date: ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("");
        System.out.println("PRICE TAGS: ");

        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
