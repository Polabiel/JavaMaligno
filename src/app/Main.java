package src.app;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        try {
            Data d1 = new Data(6, 12, 1996);
            Data d2 = d1;
            Data d3 = new Data(6, 12, 1996);
            Data d4 = new Data(6, 12, 1996);


            Vector<Data> vec = new Vector<Data>();
            vec.add(d1);

            if (vec.contains(d3)){
                System.out.println("d3 está no vector");
            } else {
                System.out.println("d3 não está no vector");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
