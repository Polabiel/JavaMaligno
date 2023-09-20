package src.app;

public class Main {
    public static void main(String[] args) throws Exception {
        Data data = new Data((byte) 1, (byte) 1, (short) 2020);
        Data data2 = new Data((byte) 1, (byte) 1, (short) 2021);

        System.out.println(data.equals(data2));
        System.out.println(data.compareTo(data2));
        System.out.println(data.hashCode());
        System.out.println(data2.hashCode());
    }
}