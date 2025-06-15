package ui;

import java.util.Scanner;
import util.NumeroUtils;

public class InterfaceUsuario {

    public static void metodoComposed(int questao, Scanner scanner) {
        int numero = 0;
        System.out.println("Digite um número inteiro: ");
        switch (questao) {
            case 1:
                numero = scanner.nextInt();
                System.out.println(NumeroUtils.numeroPorExtenso1(numero));
                break;
            case 2:
                numero = scanner.nextInt();
                System.out.println(NumeroUtils.numeroPorExtenso2(numero));
                break;
            case 3:
                numero = scanner.nextInt();
                System.out.println(NumeroUtils.numeroPorExtenso3(numero));
                break;
            case 4:
                numero = scanner.nextInt();
                System.out.println(NumeroUtils.numeroPorExtenso4(numero));
                break;
            case 5:
                numero = scanner.nextInt();
                System.out.println(NumeroUtils.ehPar(numero));
                break;
            case 6:
                numero = scanner.nextInt();
                System.out.println("selecione o caractere decorativo: ");
                String input;
                char caractere;
                while (true) {
                    input = scanner.next();
                    if (input.length() == 1) {
                        caractere = input.charAt(0);
                        break;
                    } else {
                        System.out.println("Por favor, digite apenas um caractere:");
                    }
                }
                NumeroUtils.imprimirLinhaDecor(numero, caractere);
                break;
            default:
                System.out.println("Questão não reconhecida.");
                break;
        }
    }

    public void iniciar() {
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

            } while (true);
        }
    }

}
