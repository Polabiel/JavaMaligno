package src.app;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static boolean isValide(byte mes, byte dia, short ano) {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 0) {
            return false;
        }
        return true;
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

    @Override
    public String toString() {
        if (ano < 0)
            return String.format("%02d/%02d/%04d a.C.", this.dia, this.mes, -this.ano);
        return String.format("%02d/%02d/%04d d.C.", this.dia, this.mes, this.ano);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass())
            return false;

        Data data = (Data) obj;

        return this.dia == data.dia && this.mes == data.mes && this.ano == data.ano;
    }

    @Override
    public int hashCode() {
        int ret = 666;

        // return ret = 7 * ret + new Byte(this.dia).hashCode();
        ret = 7 * ret + Byte.valueOf(this.dia).hashCode();
        ret = 7 * ret + Byte.valueOf(this.mes).hashCode();
        ret = 7 * ret + Short.valueOf(this.ano).hashCode();
        // if (this.email!=null) ret

        if (ret < 0)
            ret = -ret;
        return ret;
    }

    // @Override
    private Data(Data modelo) throws Exception {
        if (modelo == null)
            throw new Exception("data ausente");

        this.dia = modelo.dia;
        this.mes = modelo.mes;
        this.ano = modelo.ano;
    }

    public Object clone() {
        Data ret = null;
        try {
            ret = new Data(this);
        } catch (Exception erro) {
        }
        return ret;
    }

    @Override
    public int compareTo(Data o) {
        if (this.ano < o.ano)
            return -1;
        if (this.ano > o.ano)
            return 1;

        if (this.mes < o.mes)
            return -1;
        if (this.mes > o.mes)
            return 1;

        if (this.dia < o.dia)
            return -1;
        if (this.dia > o.dia)
            return 1;

        return 0;
    }

}