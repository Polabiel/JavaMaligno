# Digitação de Dados

Para começar a digitar dados em um programa Java, precisamos de um objeto da classe Teclado. Para isso, precisamos importar a classe Teclado, que está no pacote java.io.BufferedReader;

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import IOExpection;
public class Teclado{
    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static String getUmString() {
      String ret=null;
      try{
        ret = teclado.readLine(); // Obter uma linha do teclado
      }
      catch(IOException erro){
        System.out.println("Deu erro...");
      }
    }

}
```

O BufferedReader é uma classe que representa um objeto que pode ser usado para ler dados de um fluxo de entrada, como o teclado. O fluxo de entrada padrão é representado pelo objeto System.in, que é um objeto da classe InputStream. O objeto System.in é passado como parâmetro para o construtor da classe InputStreamReader, que é uma classe que representa um objeto que pode ser usado para ler caracteres de um fluxo de entrada. O objeto InputStreamReader é passado como parâmetro para o construtor da classe BufferedReader, que é uma classe que representa um objeto que pode ser usado para ler linhas de um fluxo de entrada. O objeto BufferedReader é atribuído ao atributo estático teclado da classe Teclado.

Agora, podemos usar o método getUmString() para obter uma linha do teclado. O método getUmString() retorna um objeto da classe String, que é a classe que representa uma sequência de caracteres.

```java
public class Teste{
    public static void main(String[] args){
        String nome;
        System.out.println("Digite seu nome: ");
        nome = Teclado.getUmString();
        System.out.println("Seu nome é: " + nome);
    }
}
```