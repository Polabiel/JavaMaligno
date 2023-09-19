package src.app;

public class Main {
    public static void main(String[] args) throws Exception {
        Data data = new Data((byte) 20, (byte) 1, (short) 2022);
        System.out.println(data);
        data.setAno((short) 2021);
        System.out.println(data);
        String value = "2021-01-20";
        System.out.println(data.equals(data));
    }
}
