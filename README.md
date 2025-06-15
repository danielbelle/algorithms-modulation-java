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
  Estrutura inicial para testes unitários dos métodos utilitários.

- **ListaModulacaoAlgoritmos.pdf**  
  Documento com o enunciado dos exercícios resolvidos neste projeto.

## Como clonar o projeto

Para obter uma cópia local deste repositório, execute no terminal:

```sh
git clone https://github.com/danielbelle/algoritmos-trabalho.git
cd sua-pasta
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

4. **Testes:**  
   (Opcional) Implemente e execute testes unitários em
   `test/NumeroUtilsTest.java`.

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
**Propósito:** Demonstração de habilidades em Java e boas práticas de
modularização
