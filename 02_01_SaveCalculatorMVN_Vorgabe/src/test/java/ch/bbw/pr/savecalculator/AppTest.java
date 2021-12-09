package ch.bbw.pr.savecalculator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void summe() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    public void subtraction() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == -20);
    }

    public void summeMax() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 1;
        int value2 = 7;
        assertTrue(testee.summe(value1, value2) ==-8);
    }
}
//tests to implement
//eine positive + eine positive
//eine negative + eine negative
//eine positive + eine negative
//grösste positive + kleinste positive
//grösste positive + kleinste negative
//grösste negative + kleinste positive
//grösste negative + kleinste negative
