package src.app;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0 || this.ano % 400 == 0);
    }

    public static boolean isValida(byte dia, byte mes, short ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }
        if (mes == 2) {
            if (dia > 29) {
                return false;
            }
            if (dia == 29 && ano % 4 != 0) {
                return false;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 &&  (dia > 30)) {
                return false;
            
        }
        return true;
    }

}