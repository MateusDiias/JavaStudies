package WorkingWithArchives;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"Hello, my name is Mateus", "I have 20 years old"};
        String path = "/home/mat/Documents/oi.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/mat/Documents/oi.txt"))) {
            for (String line :
                    lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
