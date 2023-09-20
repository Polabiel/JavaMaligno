package src.Horario;

public class Horario implements Cloneable, Comparable<Horario> {

    private byte hora;
    private byte minuto;
    private byte segundo;

    public Horario(byte hora, byte minuto, byte segundo) throws Exception {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        if (hora < 0 || hora > 23)
            throw new Exception("Valor Inválido!");
        if (minuto < 0 || minuto > 59)
            throw new Exception("Valor Inválido!");
        if (segundo < 0 || segundo > 59)
            throw new Exception("Valor Inválido!");

    }

    public void avance(short qtdSegundos) throws Exception {
        if (qtdSegundos <= 0)
            throw new Exception("Quantidade de segundos inválida");

        this.segundo += qtdSegundos;

        if (this.segundo < 1) {
            this.minuto += this.segundo / 60;
            this.segundo = (byte) (this.segundo % 60 + 60);
        }
        if (this.segundo > 59) {
            this.minuto += this.segundo / 60;
            this.segundo = (byte) (this.segundo % 60);
        }
        if (this.minuto < 0) {
            this.hora += this.minuto / 60 - 1;
            this.minuto = (byte) (this.minuto % 60 + 60);
        }
        if (this.minuto > 59) {
            this.hora += this.minuto / 60;
            this.minuto = (byte) (this.minuto % 60);
        }
        if (this.hora < 0) {
            this.hora = (byte) (this.hora % 24 + 24);
        }
        if (this.hora > 23) {
            this.hora = (byte) (this.hora % 24);
        }

    }

    public void retroceda(short qtdSegundos) throws Exception {
        if (qtdSegundos <= 0)
            throw new Exception("Quantidade de segundos inválida");

        this.segundo -= qtdSegundos;

        if (this.segundo < 0) {
            this.minuto -= (this.segundo / 60) + 1;
            this.segundo = (byte) (this.segundo % 60 + 60);
        }

        if (this.minuto < 0) {
            this.hora -= (this.minuto / 60) + 1;
            this.minuto = (byte) (this.minuto % 60 + 60);
        }

        if (this.hora < 0) {
            this.hora = (byte) (this.hora % 24 + 24);
        }

    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public int setHora(byte hora) throws Exception {
        if (hora < 0 || hora > 23)
            throw new Exception("Valor Inválido!");
        this.hora = hora;
        return this.hora;
    }

    public int setMinuto(byte minuto) throws Exception {
        if (minuto < 0 || minuto > 59)
            throw new Exception("Valor Inválido!");
        this.minuto = minuto;
        return this.minuto;
    }

    public int setSegundo(byte segundo) throws Exception {
        if (segundo < 0 || segundo > 59)
            throw new Exception("Valor Inválido!");
        this.segundo = segundo;
        return this.segundo;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (!(object instanceof Horario))
            return false;
        Horario horario = (Horario) object;
        return this.hora == horario.hora && this.minuto == horario.minuto && this.segundo == horario.segundo;
    }

    public int hashCode() {
        int returnValue = 25;

        returnValue = 7 * returnValue + Byte.valueOf(this.hora).hashCode();
        returnValue = 7 * returnValue + Byte.valueOf(this.minuto).hashCode();
        returnValue = 7 * returnValue + Byte.valueOf(this.segundo).hashCode();

        if (returnValue < 0)
            returnValue = -returnValue;

        return returnValue;
    }

    private Horario(Horario Obj) throws Exception {
        if (Obj == null) throw new Exception("Horario Ausente");

        this.hora = Obj.hora;
        this.minuto = Obj.minuto;
        this.segundo = Obj.segundo;
    }

    public Object clone() {
        Horario ret = null;
        try {
            ret = new Horario(this);
        } catch (Exception erro) {
        }
        return ret;
    }

    @Override
    public int compareTo(Horario o) {
        if (this.hora < o.hora)
            return -1;
        if (this.hora > o.hora)
            return 1;

        if (this.minuto < o.minuto)
            return -1;
        if (this.minuto > o.minuto)
            return 1;

        if (this.segundo < o.segundo)
            return -1;
        if (this.segundo > o.segundo)
            return 1;
        return 0;
    }
}