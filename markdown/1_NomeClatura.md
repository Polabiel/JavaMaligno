# Resumo Java Maligno

Java é uma linguagem orientada a Objeto, ou seja, tudo é um objeto, e para que possamos manipular esses objetos, precisamos de uma referência para eles, e é aí que entra o conceito de variáveis.

## Variáveis

Variáveis são espaços na memória que armazenam valores, e para que possamos manipular esses valores, precisamos de uma referência para eles, e para isso temos os tipos de variáveis.

### Tipos de Variáveis

- **Primitivos**: São variáveis que armazenam valores primitivos, ou seja, valores que não são objetos, como por exemplo:
- int - Armazena valores inteiros (números inteiros)
- double - Armazena valores decimais de 64 bits (ex: 1.5, 2.0, 3.14)
- boolean - Armazena valores booleanos (true ou false)
- char - Armazena caracteres (letras, números, símbolos)
- byte - Armazena valores inteiros de 8 bits (ex: 1, 2, 3)
- short - Armazena valores inteiros de 16 bits (ex: 1, 2, 3)
- long - Armazena valores inteiros de 64 bits (ex: 1, 2, 3)
- float - Armazena valores decimais de 32 bits (ex: 1.5, 2.0, 3.14)
- string - Armazena cadeias de caracteres (ex: "Olá Mundo")

### Declaração de Variáveis

Primeiro lugar devemos lembrar que Java é uma linguagem Case Sentive, ou seja, diferencia maiúsculas de minúsculas, então devemos tomar cuidado ao declarar nossas variáveis.

Para declarar uma variável, devemos informar o tipo dela, seguido do nome da variável, e opcionalmente, podemos atribuir um valor a ela.

```java
int idade = 10;
```

A maneira incorreta para declarar uma variável é:

```java
int idade;
idade = 10;
```

O exemplo acima é ruim pois estamos declarando a variável idade duas vezes, e isso não é necessário.

### Regras do Case Sentive

1. As palavras que formam o nome de uma **CLASSE**, **INTERFACE** ou **PROJETO** devem ser justapostas, com inicias maisculas e as demais letras minusculas; exemplo:

- Programa, Data, BufferedReader;

  ```java
  public class Pessoa {
    // ...
  }
  ```

2. As palavras que formam o nome de um **PACOTE** (biblioteca) devem ser separadas por ponto (.) e escritas totalmente em minusculo; exemplo:

- java.lang;
- java.util;

  ```java
  import rafa.combado.na.1.20.do.minecraft;
  ```

3. As palavras que foram o nome de uma **VARIAVEL** ou método seguem a regra 1, com a unica diferença de ter a letra inicial da primeira palavra minuscula; exemplo:

- nome
- idade
- dataNascimento

  ```java
  public class Pessoa {
    private String nome;
    private int idade;
    private Date dataNascimento;
  }
  ```

4. as palavras que formam o nome de uma **CONSTANTE** devem ser separadas por sublinhado (_) e escritas totalmente em maiusculo; exemplo:

- MAX_VALUE
- MIN_VALUE

(que são constantes da classe Integer);
  
  ```java
  public class Pessoa {
    private static final int MAX_VALUE = 10;
    private static final int MIN_VALUE = 0;
  }
  ```

5. A primeira palavra do nome de um **METODO** que altera valores armazenados num objeto deve ser "set" e o resto deve expressar o que é alterado; tais metodos são conhecidos como "SETTERs"; exemplo:

> Obs: Métodos são funções que executam uma ação.

- setDia
- setMes
- setNome

```java
public class Pessoa {
  private String nome;
  private int idade;
  private Date dataNascimento;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}
```

6. a primeira palavra do nome de um **METODO** que recupera um valor armazenado num objeto deve ser "get" e o resto deve expressar o que é recuperado/alterado; tais metodos são conhecidos como "GETTERs"; exemplo:

- getDia
- getMes
- getNome

```java
public class Pessoa {
  private String nome;
  private int idade;
  private Date dataNascimento;

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }
}
```

> Obs: se o valor recuperado for do tipo boolean, o nome do metodo deve ser "is" e o resto deve expressar o que é recuperado; exemplo:

- isAtivo
- isMaiorDeIdade

```java
public class Pessoa {
  private String nome;
  private int idade;
  private Date dataNascimento;
  private boolean ativo;

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public boolean isAtivo() {
    return ativo;
  }
}
```
