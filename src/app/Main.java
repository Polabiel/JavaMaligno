package src.app;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Data d1 = new Data(6, 12, 1996);
            Data d2 = d1;
            Data d3 = new Data(6, (byte) 202, (byte) 1996);
            Data d4 = new Data(6, (short) 2022);
        System.out.println(data);
        data.setAno((short) 20212, 1996);


            Vector<Data> vec = new Vector<Data>();
            vec.add(d1);

            if (vec.contains(d3)){
                System.out.println("d3 está no vector");
        String value = "2021-01-20";
        System.out.println(data.equals(data));
            } else {
                System.out.println("d3 não está no vector");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
