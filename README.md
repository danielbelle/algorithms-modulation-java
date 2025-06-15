# Algoritmos - Lista de Modularização

Este projeto contém a resolução da lista de exercícios de modularização de
algoritmos, conforme o arquivo
[`ListaModulacaoAlgoritmos.pdf`](ListaModulacaoAlgoritmos.pdf). O objetivo é
demonstrar boas práticas de organização, modularização e reutilização de código
em Java.

## Estrutura do Projeto

- **conversor/EscreveNumero.java**  
  Classe responsável por converter números inteiros em sua forma por extenso em
  português.

- **util/NumeroUtils.java**  
  Classe utilitária com métodos para:

  - Converter números em extenso (diferentes faixas de valores)
  - Verificar se um número é par
  - Imprimir linhas decorativas com caracteres

- **ui/InterfaceUsuario.java**  
  Responsável pela interação com o usuário via terminal, apresentando o menu de
  questões e recebendo as entradas.

- **Main.java**  
  Classe principal que inicializa a interface do usuário.

- **test/NumeroUtilsTest.java**  
  Testes unitários dos métodos utilitários.

- **test/InterfaceUsuarioE2ETest.java**  
  Testes end-to-end (E2E) simulando o uso completo da interface do usuário.

- **ListaModulacaoAlgoritmos.pdf**  
  Documento com o enunciado dos exercícios resolvidos neste projeto.

## Como clonar o projeto

Para obter uma cópia local deste repositório, execute no terminal:

```sh
git clone https://github.com/danielbelle/algoritmos-trabalho.git
cd algoritmos-trabalho
```

## Como executar

1. **Pré-requisitos:**

   - Java 8 ou superior instalado
   - Recomenda-se o uso do [VS Code](https://code.visualstudio.com/) ou outro
     IDE Java

2. **Compilação:**  
   Compile todos os arquivos Java:

   ```sh
   javac conversor/EscreveNumero.java util/NumeroUtils.java ui/InterfaceUsuario.java Main.java
   ```

3. **Execução:**  
   Execute a classe principal:

   ```sh
   java Main
   ```

## Como executar os testes unitários e E2E

### 1. Pré-requisitos

- As bibliotecas JUnit e Hamcrest já estão incluídas na pasta `lib` do projeto.

### 2. Compilando os testes

Execute o comando abaixo na raiz do projeto para compilar os testes e as
dependências:

```sh
javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" -d . test/NumeroUtilsTest.java test/InterfaceUsuarioE2ETest.java ui/InterfaceUsuario.java util/NumeroUtils.java conversor/EscreveNumero.java
```

### 3. Executando os testes unitários

Para rodar os testes unitários da classe utilitária:

```sh
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore test.NumeroUtilsTest
```

### 4. Executando os testes E2E

Para rodar os testes end-to-end (E2E) que simulam o uso completo da interface:

```sh
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore test.InterfaceUsuarioE2ETest
```

### O que os testes cobrem

- **Testes unitários (`NumeroUtilsTest`)**:  
  Garantem que todos os métodos públicos da classe `NumeroUtils` funcionam
  corretamente, incluindo:

  - Conversão de números para extenso em diferentes faixas
  - Verificação de paridade (par/ímpar)
  - Impressão de linhas decorativas

- **Testes E2E (`InterfaceUsuarioE2ETest`)**:  
  Simulam a interação do usuário com o programa, cobrindo todos os fluxos das
  questões propostas:
  - Questões de conversão por extenso (válidas e inválidas)
  - Verificação de número par/ímpar
  - Impressão de linhas decorativas com diferentes caracteres
  - Tratamento de entradas inválidas e fluxos de saída

Esses testes garantem que tanto a lógica interna quanto a experiência do usuário
estão corretas e robustas.

## Modularização

O projeto está organizado em pacotes, separando lógica de conversão, utilidades
matemáticas e interface do usuário. Isso facilita a manutenção, testes e futuras
expansões.

## Observações

- O código foi desenvolvido para fins didáticos, focando em clareza,
  modularização e boas práticas.
- Para dúvidas ou sugestões, entre em contato.

## Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

---

**Autor:** Daniel Henrique Bellé  
**Propósito:** Demonstração de habilidades em Java, Testes unitários e E2E e
boas práticas
