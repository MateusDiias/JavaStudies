package Application;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("maria");
        list.add("marcos");
        list.add("jose");
        list.add(2, "joao");
        list.remove(1);
        for (String x : list) {
            System.out.println(x);
        }
    }
}