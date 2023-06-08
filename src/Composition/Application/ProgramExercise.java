package Composition.Application;

import Composition.Application.Entities.Exercise.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ProgramExercise {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date data = new Date();


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Bith date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();
        System.out.println("Enter order data: \nStatus: ");
        String orderStatus = sc.nextLine();
        Order order = new Order(data, OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        var n = sc.nextInt();
        sc.nextLine();

        for (var i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println("");
        System.out.println(order);

        sc.close();
    }
}
