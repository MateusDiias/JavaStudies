package SetMap;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.*;

public class MapExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> products = new TreeMap<>();

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                int idade = Integer.parseInt(fields[1]);
                products.put(nome, products.getOrDefault(nome, 0) + idade);
                line = br.readLine();
            }

            for (String key : products.keySet()) {
                System.out.println(key + ": " + products.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
