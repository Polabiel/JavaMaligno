public class Horario {

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

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}