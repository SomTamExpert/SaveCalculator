package ch.bbw.km.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author marco
 * @version 05.01.2022
 */
public class SaveCalculator {
	public int summarize(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}
	public int subtract(int substrand1, int substrand2) throws  ArithmeticException
	{
		long value = (long) substrand1 - (long) substrand2;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return substrand1 - substrand2;
	}
	public int divide(int divid1, int divid2) throws ArithmeticException {
		long value = (long) divid1 / (long) divid2;
		if (divid2 == 0) {
			throw  new ArithmeticException();
		}
		return divid1 / divid2;
	}
	private int multiply(int multip1, int multip2) throws ArithmeticException{
		long value = (long) multip1 * (long) multip2;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return multip1 * multip2;
	}
	private int square(int quadrant1, int quadrant2) throws ArithmeticException {
		long value = (long) Math.pow((long) quadrant1, (long) quadrant2);
		if((value > Integer.MAX_VALUE) || value <Integer.MIN_VALUE) {
			throw new ArithmeticException();
		}
		return (int) Math.pow(quadrant1, quadrant2);
	}
	private int squareRoot(int base) throws ArithmeticException {
		long value = (long) Math.sqrt((long) base);
		if ((value) > Integer.MAX_VALUE || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return (int) Math.sqrt(base);
	}
	public void delete(int value1, int value2) {
		value1 = 0;
		value2 = 0;
	}
}
