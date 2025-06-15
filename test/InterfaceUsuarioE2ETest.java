package test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
import ui.InterfaceUsuario;

public class InterfaceUsuarioE2ETest {

    @Test
    public void testQuestao1_ValidaEInvalida() {
        String input = "1\n10\n1\n21\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("dez")); // 10 por extenso
        assertTrue(out.contains("inválido")); // 21 é inválido para questao 1
    }

    @Test
    public void testQuestao2_ValidaEInvalida() {
        String input = "2\n99\n2\n100\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("noventa e nove")); // 99 por extenso
        assertTrue(out.contains("inválido")); // 100 é inválido para questao 2
    }

    @Test
    public void testQuestao3_ValidaEInvalida() {
        String input = "3\n999\n3\n1000\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("novecentos e noventa e nove")); // 999 por extenso
        assertTrue(out.contains("inválido")); // 1000 é inválido para questao 3
    }

    @Test
    public void testQuestao4_ValidaEInvalida() {
        String input = "4\n10000\n4\n100000\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("dez mil")); // 10000 por extenso
        assertTrue(out.contains("inválido")); // 100000 é inválido para questao 4
    }

    @Test
    public void testQuestao5_ParEImpar() {
        String input = "5\n2\n5\n3\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("true")); // 2 é par
        assertTrue(out.contains("false")); // 3 é ímpar
    }

    @Test
    public void testQuestao6_LinhaDecorativa() {
        String input = "6\n5\n*\n6\n3\n#\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("*****")); // 5 asteriscos
        assertTrue(out.contains("###")); // 3 cerquilhas
    }

    @Test
    public void testQuestao6_CaractereInvalido() {
        String input = "6\n4\nab\n$\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("Por favor, digite apenas um caractere:"));
        assertTrue(out.contains("$$$$"));
    }

    @Test
    public void testQuestaoInvalida() {
        String input = "9\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        InterfaceUsuario iu = new InterfaceUsuario();
        iu.iniciar();

        String out = saida.toString();
        assertTrue(out.contains("Questão não reconhecida."));
    }
}