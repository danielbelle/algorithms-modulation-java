import java.util.Scanner;
import logica.EscreveNumero;

public class AulaEad {

  public static String numeroPorExtenso1(int numero) {
    if (numero >= 1 && numero <= 20) {
      return EscreveNumero.get(numero);
    }
    return "inválido";
  }

  public static String numeroPorExtenso2(int numero) {
    if (numero >= 1 && numero <= 99) {
      return EscreveNumero.get(numero);
    }
    return "inválido";
  }

  public static String numeroPorExtenso3(int numero) {
    if (numero >= 1 && numero <= 999) {
      return EscreveNumero.get(numero);
    }
    return "inválido";
  }

  public static String numeroPorExtenso4(int numero) {
    if (numero >= 1 && numero <= 99999) {
      return EscreveNumero.get(numero);
    }
    return "inválido";
  }

  public static boolean ehPar(int numero) {
    if (numero % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void imprimirLinhaDecor(int quantidade, char caractere) {
    String[] caracteres = new String[quantidade];
    for (int i = 0; i < quantidade; i++) {
      caracteres[i] = String.valueOf(caractere);
    }
    System.out.println(String.join("", caracteres));
  }

  public static void metodoComposed(int questao, Scanner scanner) {
    int numero = 0;
    System.out.println("Digite um número inteiro: ");
    switch (questao) {

      case 1:
        numero = scanner.nextInt();
        System.out.println(numeroPorExtenso1(numero));
        break;
      case 2:
        numero = scanner.nextInt();
        System.out.println(numeroPorExtenso2(numero));
        break;
      case 3:
        numero = scanner.nextInt();
        System.out.println(numeroPorExtenso3(numero));
        break;
      case 4:
        numero = scanner.nextInt();
        System.out.println(numeroPorExtenso4(numero));
        break;
      case 5:
        numero = scanner.nextInt();
        System.out.println(ehPar(numero));
        break;
      case 6:
        numero = scanner.nextInt();
        System.out.println("selecione o caractere decorativo: ");
        char caractere = scanner.next().charAt(0);
        imprimirLinhaDecor(numero, caractere);
        break;
      default:
        System.out.println("Questão não reconhecida.");
        break;
    }
  }

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int questao;
      do {
        System.out.print("Digite o número da questão (ou '0' para sair): ");
        questao = scanner.nextInt();

        if (questao == 0) {
          break;
        }
        try {
          metodoComposed(questao, scanner);
        } catch (NumberFormatException e) {
          System.out.println("Número inválido.");
          continue;
        }

      } while (!"".equals(questao));

    }
  }
}
