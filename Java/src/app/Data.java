package src.app;

public class Data {
    private int dia, mes, ano;

    public Data(int i, int j, int k) {
        this.dia = i;
        this.mes = j;
        this.ano = k;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

}

// Path: src\app\Main.java
// Compare this snippet from src\app\helloWorld.java:
