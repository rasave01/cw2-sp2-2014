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
		String str = "  a  ";
		FractionCalculator frCalc = new FractionCalculator();
		Fraction actualOutput = frCalc.evaluate(f,str);
		Fraction expectedOutput = new Fraction(2,15);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}

}
