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
	
	public static void main(String[] args){
		testEquals(new Fraction(1, 2),new Fraction(1, 2),"1/2 worked fine");
		testEquals(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
		testEquals(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
		testEquals(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
		testEquals(new Fraction(4, -8),new Fraction(1, 2),"Non equal fraction: ");
	}

	//Test divide by zero - should print and error and exit
	@Test
	static void test() {
		new Fraction (1,0);
		fail("Zero division not possible! Program was stopped.");
	}
	
	@Test
	static void testMultiply(){
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
	}
	
	@Test
	static void testEquals(Fraction f1, Fraction f2, String msg){
		if (!f1.equals(f2)) System.out.println(msg);	
	}

}
