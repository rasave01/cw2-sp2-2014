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
public class FractionTest {
	
//	public static void main(String[] args){
//		testEquals(new Fraction(1, 2),new Fraction(1, 2),"1/2 worked fine");
//		testEquals(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
//		testEquals(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
//		testEquals(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
//		testEquals(new Fraction(4, -8),new Fraction(1, 2),"Non equal fraction: ");
//	}

	//Test divide by zero - should print and error and exit
//	@Test
//	public void test() {
//		new Fraction (1,1);
//		fail("Zero division not possible! Program was stopped.");
//	}
	
	@Test
	public void testMultiply(){
		Fraction f = new Fraction(2,10);
		Fraction g = new Fraction(4,2);
		Fraction expectedOutput = new Fraction(4,10);
		Fraction actualOutput = f.multiply(g);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
//	@Test
//	public void testEquals(Fraction f1, Fraction f2, String msg){
//		if (!f1.equals(f2)) System.out.println(msg);	
//	}
	
	@Test
	public void testAbsValue(){
		Fraction f = new Fraction(-3,-10);
		Fraction expectedOutput = new Fraction(3,10);
		Fraction actualOutput = f.absValue();
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testNegate(){
		Fraction f = new Fraction(-3,-10);
		Fraction expectedOutput = new Fraction(-3,10);
		Fraction actualOutput = f.negate();
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testtoString(){
		Fraction f = new Fraction(3,1);
		String expectedOutput = "3";
		String actualOutput = f.toString();
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testInverse(){
		Fraction f = new Fraction(9,3);
		Fraction expectedOutput = new Fraction(3,9);
		Fraction actualOutput = f.inverse();
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testDevide(){
		Fraction f = new Fraction(-8,3);
		Fraction g = new Fraction(7,-5);
		Fraction expectedOutput = new Fraction(40,21);
		Fraction actualOutput = f.divide(g);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testAdd(){
		Fraction f = new Fraction(1,3);
		Fraction g = new Fraction(2,6);
		Fraction expectedOutput = new Fraction(2,3);
		Fraction actualOutput = f.add(g);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testSubtract(){
		Fraction f = new Fraction(8,3);
		Fraction g = new Fraction(2,6);
		Fraction expectedOutput = new Fraction(7,3);
		Fraction actualOutput = f.subtract(g);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
}
