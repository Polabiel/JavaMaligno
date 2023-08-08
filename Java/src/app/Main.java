package src.app;

public class Main {
    public static void main(String[] args) {
        Data d = new Data(8, 8, 2023);
        d.setDia(15);
        d.setMes(50);
        System.out.println(d.getDia() + "/" + d.getMes() + "/" + d.getAno());
    }
}
