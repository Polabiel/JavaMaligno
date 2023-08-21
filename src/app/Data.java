package src.app;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    private static boolean isValide(int i, int j, int k) {
        if (i < 1 || i > 31) {
            return false;
        }
        if (j < 1 || j > 12) {
            return false;
        }
        if (k < 0) {
            return false;
        }
        return true;
    }

    private static boolean isBissexto(int k) {
        if (k % 4 == 0 && k % 100 != 0 && k % 400 == 0) {
            return true;
        }
        return false;
    }

    public Data(int i, int j, int k) {
        if (!isValide(i, j, k)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.dia = i;
        this.ano = j;
        this.mes = k;

    }

}