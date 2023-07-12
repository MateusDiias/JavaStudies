package Inheritance_polymorphism;

import Inheritance_polymorphism.Entities.Employee;
import Inheritance_polymorphism.Entities.OutsourcedEmployee;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hours: ");
            Double valPerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextInt();
                Employee emp = new OutsourcedEmployee(name, hours, valPerHour, additional);
                list.add(emp);
            }
            else {
                Employee employee = new Employee(name, hours, valPerHour);
                list.add(employee);
            }
        }

        System.out.println("");
        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + emp.payment());
        }
        sc.close();
    }
}
