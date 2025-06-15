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
}
