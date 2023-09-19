# Qualificador Static

## O que é?

O qualificador static é utilizado para definir um membro de uma classe como sendo um membro da classe, e não um membro de um objeto. Isso significa que, quando um membro é definido como static, ele passa a ser compartilhado por todos os objetos da classe.

## Como usar?

Para definir um membro de uma classe como sendo static, basta colocar a palavra static antes da declaração do membro.

```java
public class Pessoa {
  private static int quantidadePessoas = 0;
}
```

## Exemplo de Cenário

```java
public class Pessoa {
  private static int quantidadePessoas = 0;

  public Pessoa() {
    quantidadePessoas++;
  }

  public static int getQuantidadePessoas() {
    return quantidadePessoas;
  }
}
```

```java
public class Teste {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Pessoa p3 = new Pessoa();

    System.out.println(Pessoa.getQuantidadePessoas()); // 3
  }
}
```
