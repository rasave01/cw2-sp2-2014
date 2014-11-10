package myCW2;

import java.util.StringTokenizer;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		//Initialise variables
		Fraction currentValue = frac;
		String operation = "";
		Fraction result = frac;
		
		// use StringTokaniser with the delimiter " "
		StringTokenizer st = new StringTokenizer(inputString, " "); 
		
		// loop through tokens
		while(st.hasMoreTokens()) { 
			// get token
			String next = st.nextToken(); 
			
			// look at the token and see what it is. Consider using switch/case here
			if(next.equals("a")||next.equals("A")||next.equals("abs")){operation = "abs";}
			if(next.equals("n")||next.equals("N")||next.equals("neg")){operation = "neg";}
			if(next.equals("c")||next.equals("C")||next.equals("clear")){operation = "clear";}
			if(next.equals("q")||next.equals("Q")||next.equals("quit")){operation = "quit";}
			if(next.equals("+")){operation = "add";}
			if(next.equals("-")){operation = "sub";}
			if(next.equals("*")){operation = "mply";}
			if(next.equals('/')){operation = "div";}
			if(next.contains("/") && next.length()>2){
				//this is a fraction need to make one here
				//use StringTokeniser with delimiter "/"
				
				//need to check for operation
				if (operation !=""){
					//perform add (unit test) operation with currentValue of the calculator
					currentValue = currentValue.add(frac);
					operation = "";
				}
				//no operation is remembered so set currentValue to the one made above - not frac!
				currentValue = frac;
			}
			
			// see if a number on its own was given
			try {
					int number = Integer.parseInt(next);
					// make a new fraction here
					
			    } catch (NumberFormatException e) {
			         //
			    }

		}
		
		if(operation.equals("abs")){
			result = frac.absValue(); 
	    }
		if(operation.equals("neg")){
			result = frac.negate(); 
	    }
		if(operation.equals("clear")){
			result = new Fraction (0,1); 
	    }
		if(operation.equals("quit")){
			System.out.println("The program has stopped");
			result = new Fraction (0,1);
			//throw here;  
	    }
		return result;
	
	}
	
}
