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
    public void testSummeZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summarize(value1, value2) == 30);
    }
    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtract(value1, value2) == -20);
    }
    @Test
    public void testSummeGroesstePositiveZahlKleintePositiveZahlIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 1;
        int value2 =  2147483647;
        assertTrue(testee.summarize(value1, value2) == -1);
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
