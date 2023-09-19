# Boxing and Unboxing

## Boxing

O termo Boxing na linguagem java é utilizado para definir o processo de conversão de um tipo primitivo para um objeto.

```java
int i = 10;
Integer integer = new Integer(i); // Boxing
```

Nesse exemplo acima o tipo primitivo int é convertido para um objeto Integer, esse processo é chamado de Boxing.

## Unboxing

O termo Unboxing na linguagem java é utilizado para definir o processo de conversão de um objeto para um tipo primitivo.

```java
Integer integer = new Integer(10);
int i = integer.intValue(); // Unboxing
```

Nesse exemplo acima o objeto Integer é convertido para um tipo primitivo int, esse processo é chamado de Unboxing.

# Tipos e Classes Wrapper

Como a gente viu na seção anterior, os tipos primitivos não são objetos, mas em alguns casos precisamos de objetos que representem esses tipos primitivos. Para isso, a linguagem Java fornece as classes Wrapper, que são classes que representam os tipos primitivos.

- **byte** - Byte
- **short** - Short
- **int** - Integer
  assim por diante...

# Exemplo de Cenário

```java
Integer a = new Integer(7);
Integer b = new Integer(7);

System.out.println(a==b); // false
System.out.println(a.equals(b)); // true
```

O método equals() da classe Integer compara o **valor** dos objetos, já o operador ```==``` compara as referências dos objetos.

```java
Integer a = 7;
Integer b = 7;

System.out.println(a==b); // true
System.out.println(a.equals(b)); // true
```
