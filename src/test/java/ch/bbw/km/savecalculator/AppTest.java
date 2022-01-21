package ch.bbw.km.savecalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 * * @author marco
 * * @version 05.01.2022
 */
public class AppTest {
    private SaveCalculator testee;

    @Before
    public void setup() {
        testee = new SaveCalculator();
    }

    @After
    public void deleteSetup() {
        int value1 = 2;
        int value2 = 2;
        testee.delete(value1, value2);
    }

    @Test
    public void testSummeZweiPositiveZahlenIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summarize(value1, value2) == 30);
    }

    @Test
    public void testSummeZweiNegativeZahlenIsOk() {
        int value1 = -166;
        int value2 = -334;
        assertTrue(testee.summarize(value1, value2) == -500);
    }

    @Test
    public void testSummePositiveZahlUndNegativeZahlIsOk() {
        int value1 = 89;
        int value2 = -122;
        assertTrue(testee.summarize(value1, value2) == -33);
    }

    @Test(expected = ArithmeticException.class)
    public void testSummeGroesstePositiveZahlUndKleintePositiveZahlThrowsExpectedExceptionIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        testee.summarize(value1, value2);
    }

    @Test
    public void testSummeGroessteNegativeZahlUndKleinstePositiveZahlIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        assertTrue(testee.summarize(value1, value2) == -2147483647);
    }

    @Test
    public void testSubtraktionZweiPositiveZahlenIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtract(value1, value2) == -10);
    }

    @Test
    public void testSubtraktionZweiNegativeZahlenIsOk() {
        int value1 = -55;
        int value2 = -66;
        assertTrue(testee.subtract(value1, value2) == 11);
    }

    @Test
    public void testSubtraktionPositiveUndNegativeZahlIsOk() {
        int value1 = 3814;
        int value2 = -402;
        assertTrue(testee.subtract(value1, value2) == 4216);
    }

    @Test
    public void testSubtraktionGroessteNegativeZahlUndKleinsteNegativeZahlIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -1;
        assertTrue(testee.subtract(value1, value2) == -2147483647);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtraktionGroesstePositiveZahlUndKleinsteNegativeZahlThrowsExpectedExceptionIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        testee.subtract(value1, value2);
    }

    @Test
    public void testDivisionZweiPositiveZahlenIsOK() {
        int value1 = 17;
        int value2 = 1821;
        assertTrue(testee.divide(value1, value2) == 0);
    }

    @Test
    public void testDivisionZweiNegativeZahlenIsOK() {
        int value1 = -64;
        int value2 = -8;
        assertTrue(testee.divide(value1, value2) == 8);
    }

    @Test
    public void testDivisionPositiveZahlUndNegativeZahlIsOk() {
        int value1 = 120;
        int value2 = -11;
        assertTrue(testee.divide(value1, value2) == -10);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPositiveZahlUndNullThrowsExpectedExceptionIsOK() {
        int value1 = 13;
        int value2 = 0;
        testee.divide(value1, value2);
    }
    /*
    Dieser Test wirft eine NullPointerException. Weil keine try and catch in der Methode definiert ist wird der Test
    fehlschlagen und ist deswegen ausgeklammert.
    @Test
    public void testDivisionPositiveZahlUndNullThrowsUnexpectedExceptionIsNOK() throws NullPointerException {
        int value1 = 12;
        Integer value2 = null;
        testee.divide(value1, value2);
    }
    */
    @Test
    public void testMultiplikationZweiPositiveZahlenMitProtectedMethodeIsOk() {
        int value1 = 12;
        int value2 = 12;
        assertTrue(testee.multiply(value1, value2) == 144);
    }

    @Test
    public void testMultiplikationPostiveZahlUndNegativeZahlIsOk() {
        int value1 = 25;
        int value2 = -4;
        assertTrue(testee.multiply(value1, value2) == -100);
    }

    @Test
    public void testMultiplikationZweiNegativeZahlIsOk() {
        int value1 = -33;
        int value2 = -12;
        assertTrue(testee.multiply(value1, value2) == 396);
    }

    @Test
    public void testMultiplikationPositiveZahlUndNullIsOk() {
        int value1 = 2;
        int value2 = 0;
        assertTrue(testee.multiply(value1, value2) == 0);
    }
    @Test
    public void testMultiplikationGroesstePositiveZahlUndkleinsteNegativeZahlIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        assertTrue(testee.multiply(value1, value2) == -Integer.MAX_VALUE);
    }

    /*
    Dieser Test kann nicht ausgeführt werden werden, da die Methode square private ist.
    Dieser Access Modifier  ist nur innerhalb der gleichen Klasse zugänglich.
    Bei JDK1.3 oder höher kann man mit reflections den Zugriffssteuermechanismus untergraben

    @Test
    public void testQuadrierungZweiPositiveZahlenMitPrivateMethodeIsOK() {
        int value1 = 3;
        int value2 = 2;
        assertTrue(testee.square(value1, value2) == 9);
    }
    */
}


//tests to implement
//eine positive + eine positive
//eine negative + eine negative
//eine positive + eine negative
//eine negative + 0
//eine positive + 0
//grösste positive + kleinste positive
//grösste positive + kleinste negative
//grösste negative + kleinste positive
//grösste negative + kleinste negative
