package util;

import conversor.EscreveNumero;

public class NumeroUtils {

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
        return numero % 2 == 0;
    }

    public static void imprimirLinhaDecor(int quantidade, char caractere) {
        String[] caracteres = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            caracteres[i] = String.valueOf(caractere);
        }
        System.out.println(String.join("", caracteres));
    }

}
