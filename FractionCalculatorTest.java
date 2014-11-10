/**
 * 
 */
package myCW2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rasave01
 *
 */
public class FractionCalculatorTest {

	@Test
	public void testEvaluateAbs() {
		Fraction f = new Fraction(-2,15);
		String str = "a";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(2,15);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}

	@Test
	public void testEvaluateNeg() {
		Fraction f = new Fraction(2,-5);
		String str = " N ";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(2,5);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testEvaluateClear() {
		Fraction f = new Fraction(-2,15);
		String str = "  C  ";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(0,15);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testEvaluateQuit() {
		Fraction f = new Fraction(-1,3);
		String str = "  Q  ";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(0,2);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testEvaluateNewFraction() {
		Fraction f = new Fraction(1,2);
		String str = "2/16";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(1,8);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testEvaluateAdd() {
		Fraction f = new Fraction(1,2);
		String str = "+ 1/3";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(5,6);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
}
