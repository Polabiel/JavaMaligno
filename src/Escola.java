package Simulado2;

import java.util.Arrays;

public class Escola implements Cloneable,Comparable<Escola> {
    private Classe[] classes;

    public Escola(int quantidadeClasses) throws Exception {
        if (quantidadeClasses <= 0) throw new Exception("Número de classes inválido");
        classes = new Classe[quantidadeClasses];

        int indice = 0;

        // 5% de cada nivel de classe do ensino fundamental I (25% ao todo) todas com 20
        // alunos
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                classes[indice++] = new Classe('1', i, (char) ('A' + j), 20, 'A');
            }
        }

        // 10% de cada nível de classe do ensino fundamental II (40% ao todo) todas com
        // 30 alunos
        for (int i = 6; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                classes[indice++] = new Classe('2', i, (char) ('A' + j), 30, 'A');
            }
        }

        // 10% de classes do 1o e 2o ano do ensino médio, todas com 40 alunos
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < 10; j++) {
                classes[indice++] = new Classe('M', i, (char) ('A' + j), 40, 'A');
            }
        }

        // as demais com classes de 3o ano do ensino médio, todas com 40 alunos
        for (int j = 0; j < 5; j++) {
            classes[indice++] = new Classe('M', 3, (char) ('A' + j), 40, 'A');
        }
    }

    public void setOnde(char nivel, int ano, char turma, char onde) {
        for (Classe classe : classes) {
            if (classe.getNivel() == nivel && classe.getAno() == ano && classe.getTurma() == turma) {
                classe.setOnde(onde);
                break;
            }
        }
    }

    public char getOnde(char nivel, int ano, char turma) {
        for (Classe classe : classes) {
            if (classe.getNivel() == nivel && classe.getAno() == ano && classe.getTurma() == turma) {
                return classe.getOnde();
            }
        }
        return ' ';
    }

    public int capacidade() {
        int capacidade = 0;
        for (Classe classe : classes) {
            capacidade += classe.getTamanho();
        }
        return capacidade;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "classes=" + Arrays.toString(classes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Escola escola = (Escola) o;
       return Arrays.equals(classes, escola.classes);
    }

    @Override
    public int hashCode() {
        int ret = 666;
        for (Classe classe : classes) {
            ret = 7 * ret + classe.hashCode();
        }
        return ret;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Escola clone = null;
        try {
            clone = new Escola(classes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < classes.length; i++) {
            clone.classes[i] = (Classe) classes[i].clone();
        }
        return clone;
    }

    public Escola(Escola modelo) throws Exception {
        if (modelo == null) {
            throw new Exception("modelo ausente");
        }
        classes = new Classe[modelo.classes.length];
        for (int i = 0; i < modelo.classes.length; i++) {
            classes[i] = new Classe(modelo.classes[i]);
        }
    }

    @Override
    public int compareTo(Escola outraEscola) {
        if (outraEscola == null) {
            return 1;
        }
        if (this.capacidade() < outraEscola.capacidade()) {
            return -1;
        }
        if (this.capacidade() > outraEscola.capacidade()) {
            return 1;
        }
        return 0;
    }
}