# O método obrigatório equals

O método equals() da classe Object é utilizado para comparar o conteúdo de dois objetos. Por padrão, o método equals() compara as referências dos objetos, ou seja, se dois objetos possuem a mesma referência, eles são iguais. Porém, em alguns casos, precisamos comparar o conteúdo dos objetos, e não as referências. Para isso, precisamos sobrescrever o método equals() na classe que representa o objeto.

```java
public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Pessoa)) {
      return false;
    }

    Pessoa p = (Pessoa) obj;

    return this.nome.equals(p.nome) && this.idade == p.idade;
  }
}

public class Teste {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("João", 20);
    Pessoa p2 = new Pessoa("João", 20);

    System.out.println(p1.equals(p2)); // true
  }
}
```

O método equals() recebe um objeto como parâmetro e retorna um boolean. O método equals() da classe Pessoa compara o conteúdo dos objetos, ou seja, se o nome e a idade dos objetos são iguais. Se o objeto passado como parâmetro for null, o método equals() retorna false. Se o objeto passado como parâmetro for o próprio objeto, o método equals() retorna true. Se o objeto passado como parâmetro não for uma instância da classe Pessoa, o método equals() retorna false. Se o objeto passado como parâmetro for uma instância da classe Pessoa, o método equals() converte o objeto para um objeto da classe Pessoa e compara o conteúdo dos objetos. Se o conteúdo dos objetos for igual, o método equals() retorna true, caso contrário, retorna false.