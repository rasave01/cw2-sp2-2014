package myCW2;

import java.util.StringTokenizer;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		String operation = "";
		Fraction result = frac;
		StringTokenizer st = new StringTokenizer(inputString, " "); 
		while(st.hasMoreTokens()) { 
			String next = st.nextToken(); 
			if (next.equals("a")||next.equals("A")||next.equals("abs")){operation = "abs";}
			if (next.equals("n")||next.equals("N")||next.equals("neg")){operation = "neg";}
			if (next.equals("c")||next.equals("C")||next.equals("clear")){operation = "clear";}
			if (next.equals("q")||next.equals("Q")||next.equals("quit")){operation = "quit";}

		}
		
		if (operation.equals("abs")){
			result = frac.absValue(); 
	    }
		if (operation.equals("neg")){
			result = frac.negate(); 
	    }
		if (operation.equals("clear")){
			result = new Fraction (0,1); 
	    }
		if (operation.equals("quit")){
			System.out.println("The program has stopped");
			result = new Fraction (0,1);
			//throw here;  
	    }
		return result;
	
	}
	
}
