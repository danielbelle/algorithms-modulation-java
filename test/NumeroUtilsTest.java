package test;

import static org.junit.Assert.*;
import org.junit.Test;
import util.NumeroUtils;

public class NumeroUtilsTest {

    @Test
    public void testEhPar() {
        assertTrue(NumeroUtils.ehPar(2)); // 2 é par
        assertTrue(NumeroUtils.ehPar(0)); // 0 é par
        assertFalse(NumeroUtils.ehPar(3)); // 3 é ímpar
        assertFalse(NumeroUtils.ehPar(-1)); // -1 é ímpar
        assertTrue(NumeroUtils.ehPar(-4)); // -4 é par
    }

    @Test
    public void testNumeroPorExtenso1() {
        // Supondo que EscreveNumero.get(1) retorna "um"
        assertEquals("um", NumeroUtils.numeroPorExtenso1(1));
        assertEquals("dez", NumeroUtils.numeroPorExtenso1(10));
        assertEquals("vinte", NumeroUtils.numeroPorExtenso1(20));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso1(0));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso1(21));
    }

    @Test
    public void testNumeroPorExtenso2() {
        // Supondo que EscreveNumero.get(21) retorna "vinte e um"
        assertEquals("um", NumeroUtils.numeroPorExtenso2(1));
        assertEquals("vinte e um", NumeroUtils.numeroPorExtenso2(21));
        assertEquals("noventa e nove", NumeroUtils.numeroPorExtenso2(99));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso2(0));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso2(100));
    }

    @Test
    public void testNumeroPorExtenso3() {
        // Supondo que EscreveNumero.get(100) retorna "cem"
        assertEquals("cem", NumeroUtils.numeroPorExtenso3(100));
        assertEquals("novecentos e noventa e nove", NumeroUtils.numeroPorExtenso3(999));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso3(0));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso3(1000));
    }

    @Test
    public void testNumeroPorExtenso4() {
        // Supondo que EscreveNumero.get(10000) retorna "dez mil"
        assertEquals("dez mil", NumeroUtils.numeroPorExtenso4(10000));
        assertEquals("noventa e nove mil novecentos e noventa e nove", NumeroUtils.numeroPorExtenso4(99999));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso4(0));
        assertEquals("inválido", NumeroUtils.numeroPorExtenso4(100000));
    }

    @Test
    public void testImprimirLinhaDecor() {
        // Testa se imprime corretamente a linha decorativa
        // Aqui apenas garantimos que não lança exceção
        NumeroUtils.imprimirLinhaDecor(5, '*');
        NumeroUtils.imprimirLinhaDecor(0, '#');
        NumeroUtils.imprimirLinhaDecor(10, '-');
    }

}
