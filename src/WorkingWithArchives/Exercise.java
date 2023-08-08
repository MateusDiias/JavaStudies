package WorkingWithArchives;

import javax.swing.text.StyledEditorKit;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {

        List<ProductExercise> elements = new ArrayList<>();

        String[] sourceFile = new String[]{
                "TV LED,1290.99,1"
                , "Video Game Chair,350.50,3"
                , "Iphone X,900.00,2"
                , "Samsung Galaxy 9,850.00,2"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/mat/Documents/products.csv"))) {
            for (String line :
                    sourceFile) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("/home/mat/Documents/products.csv"))) {
            String line = br.readLine();
            while (line != null) {
                String[] lines = line.split(",");
                String name = lines[0];
                Double price = Double.parseDouble(lines[1]);
                Integer quantity = Integer.parseInt(lines[2]);
                elements.add(new ProductExercise(name, price, quantity));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        boolean path = new File("/home/mat/Documents/out").mkdir();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/mat/Documents/out/summary.csv"))){
            for (var line :
                    elements) {
                bw.write[]
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
