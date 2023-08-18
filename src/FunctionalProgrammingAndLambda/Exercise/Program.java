package FunctionalProgrammingAndLambda.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salaryBase = sc.nextDouble();
        List<Employee> employee = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                line = br.readLine();
                employee.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
            }

            System.out.println("Email of people whose salary is more than " + salaryBase + ":");
            List<String> emails = employee.stream()
                    .filter(e -> e.getSalary() > salaryBase)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();
            emails.forEach(System.out::println);

            double sum = employee.stream()
                    .filter(employee1 -> employee1.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.print("Sum of salary of people whose name starts with 'M': " + sum);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
