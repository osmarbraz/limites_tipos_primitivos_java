# Demonstração dos Limites dos Tipos Primitivos em Java

## Descrição

Este programa apresenta os limites de representação dos tipos primitivos da linguagem Java, utilizando as constantes disponibilizadas pelas classes wrapper correspondentes.

O objetivo é mostrar os valores mínimos e máximos que os tipos numéricos conseguem representar, além de apresentar os valores possíveis do tipo `boolean` e a faixa de valores do tipo `char`.

Conhecer esses limites ajuda a compreender a capacidade de armazenamento das variáveis, os diferentes tipos de dados e a ocorrência de overflow em operações aritméticas.

## Objetivos

- Conhecer os tipos primitivos da linguagem Java.
- Identificar os valores mínimos e máximos dos tipos numéricos.
- Compreender as diferenças entre os tipos inteiros e os tipos de ponto flutuante.
- Conhecer as constantes `MIN_VALUE` e `MAX_VALUE`.
- Entender a representação numérica do tipo `char`.
- Identificar os valores possíveis do tipo `boolean`.

## Tipos primitivos em Java

Java possui oito tipos primitivos:

| Tipo | Tamanho | Finalidade |
|---|---:|---|
| `byte` | 8 bits | Inteiros pequenos |
| `short` | 16 bits | Inteiros de faixa intermediária |
| `int` | 32 bits | Inteiros de uso geral |
| `long` | 64 bits | Inteiros de faixa ampliada |
| `float` | 32 bits | Números de ponto flutuante |
| `double` | 64 bits | Números de ponto flutuante com maior precisão |
| `char` | 16 bits | Unidades de código UTF-16 |
| `boolean` | Não especificado como tamanho fixo pelo Java | Valores lógicos `true` e `false` |

## Funcionamento do programa

O programa apresenta os limites dos tipos primitivos por meio de mensagens organizadas no console.

### 1. Tipo `byte`

```java
System.out.println("Minimo: " + Byte.MIN_VALUE);
System.out.println("Maximo: " + Byte.MAX_VALUE);
```

O tipo `byte` utiliza 8 bits e representa inteiros com sinal no intervalo de `-128` a `127`.

### 2. Tipo `short`

```java
System.out.println("Minimo: " + Short.MIN_VALUE);
System.out.println("Maximo: " + Short.MAX_VALUE);
```

O tipo `short` utiliza 16 bits e representa inteiros entre `-32768` e `32767`.

### 3. Tipo `int`

```java
System.out.println("Minimo: " + Integer.MIN_VALUE);
System.out.println("Maximo: " + Integer.MAX_VALUE);
```

O tipo `int` utiliza 32 bits e representa inteiros entre `-2147483648` e `2147483647`.

### 4. Tipo `long`

```java
System.out.println("Minimo: " + Long.MIN_VALUE);
System.out.println("Maximo: " + Long.MAX_VALUE);
```

O tipo `long` utiliza 64 bits e permite representar inteiros muito maiores e menores que os tipos `int`, `short` e `byte`.

### 5. Tipo `float`

```java
System.out.println("Minimo: " + (-Float.MAX_VALUE));
System.out.println("Maximo: " + Float.MAX_VALUE);
```

O tipo `float` utiliza 32 bits e segue o padrão IEEE 754.

Nesse exemplo, `-Float.MAX_VALUE` representa o maior valor finito negativo em magnitude, enquanto `Float.MAX_VALUE` representa o maior valor finito positivo.

Esses valores não devem ser confundidos com `Float.MIN_VALUE`, que representa o menor valor positivo diferente de zero do tipo `float`.

### 6. Tipo `double`

```java
System.out.println("Minimo: " + (-Double.MAX_VALUE));
System.out.println("Maximo: " + Double.MAX_VALUE);
```

O tipo `double` utiliza 64 bits e possui uma faixa de valores finitos muito maior que a do tipo `float`.

Assim como no exemplo anterior, o programa utiliza `-Double.MAX_VALUE` para apresentar o maior valor negativo em magnitude.

O valor `Double.MIN_VALUE` também não representa o menor número negativo: ele corresponde ao menor valor positivo diferente de zero do tipo `double`.

### 7. Tipo `char`

```java
System.out.println("Minimo: " + (int) Character.MIN_VALUE);
System.out.println("Maximo: " + (int) Character.MAX_VALUE);
```

O tipo `char` utiliza 16 bits e representa unidades de código UTF-16, com valores entre `0` e `65535`.

O programa converte os limites para `int` para exibir seus valores numéricos, em vez de imprimir os caracteres correspondentes.

### 8. Tipo `boolean`

```java
System.out.println("Valores possiveis: true e false");
```

O tipo `boolean` representa valores lógicos e admite apenas `true` ou `false`.

Diferentemente dos tipos numéricos, ele não possui constantes `MIN_VALUE` e `MAX_VALUE` para representar uma faixa numérica.

## Código-fonte

O arquivo `Principal.java` contém a implementação completa do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

**1. Compile o programa:**

```bash
javac Principal.java
```

**2. Execute o programa:**

```bash
java Principal
```

## Saída esperada

```text
LIMITES DOS TIPOS PRIMITIVOS DO JAVA
byte:
  Minimo: -128
  Maximo: 127

short:
  Minimo: -32768
  Maximo: 32767

int:
  Minimo: -2147483648
  Maximo: 2147483647

long:
  Minimo: -9223372036854775808
  Maximo: 9223372036854775807

float:
  Minimo: -3.4028235E38
  Maximo: 3.4028235E38

double:
  Minimo: -1.7976931348623157E308
  Maximo: 1.7976931348623157E308

char:
  Minimo: 0
  Maximo: 65535

boolean:
  Valores possiveis: true e false
```

Os valores de `float` e `double` são exibidos em notação científica porque suas magnitudes são muito grandes.

## Conceitos fundamentais

### Constantes `MIN_VALUE` e `MAX_VALUE`

As classes wrapper do Java disponibilizam constantes que permitem consultar limites importantes dos tipos primitivos correspondentes.

Exemplos:

- `Byte.MIN_VALUE` e `Byte.MAX_VALUE`
- `Short.MIN_VALUE` e `Short.MAX_VALUE`
- `Integer.MIN_VALUE` e `Integer.MAX_VALUE`
- `Long.MIN_VALUE` e `Long.MAX_VALUE`
- `Float.MAX_VALUE`
- `Double.MAX_VALUE`
- `Character.MIN_VALUE` e `Character.MAX_VALUE`

### Inteiros e complemento de dois

Os tipos `byte`, `short`, `int` e `long` representam inteiros com sinal utilizando complemento de dois.

Para um inteiro com sinal de `n` bits, o intervalo representável é:

\[
-2^{n-1} \text{ até } 2^{n-1}-1
\]

Essa fórmula explica por que existe um valor negativo a mais do que valores positivos para esses tipos.

### Números de ponto flutuante e IEEE 754

Os tipos `float` e `double` utilizam o padrão IEEE 754, que define a representação de números de ponto flutuante.

Eles permitem representar números muito grandes e muito pequenos, mas possuem precisão finita. Por isso, nem todos os números reais podem ser representados exatamente.

O padrão também define valores especiais, como `Infinity`, `-Infinity` e `NaN`.

### Diferença entre `Float.MIN_VALUE` e `-Float.MAX_VALUE`

Uma observação importante é que `MIN_VALUE` não tem o mesmo significado em todos os tipos numéricos.

Nos tipos inteiros, `MIN_VALUE` representa o menor inteiro com sinal.

Já em `Float` e `Double`, `MIN_VALUE` representa o menor valor positivo diferente de zero. Para consultar o maior valor negativo finito, utiliza-se o sinal negativo aplicado a `MAX_VALUE`.

## Conclusão

O programa demonstra os limites e as características dos tipos primitivos de Java.

Conhecer esses limites ajuda a selecionar o tipo adequado para cada situação e a compreender fenômenos como overflow de inteiros, precisão limitada de números de ponto flutuante e representação de caracteres.

Esses conceitos constituem uma base importante para entender como os dados são representados e processados pelos programas.