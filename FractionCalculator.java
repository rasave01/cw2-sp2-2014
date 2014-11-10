package myCW2;

import java.util.StringTokenizer;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		//Initialise variables
		Fraction currentValue = frac;
		String operation = "";
		//Fraction result = frac;
		
		// use StringTokaniser with the delimiter " "
		StringTokenizer readStr = new StringTokenizer(inputString," "); 
		
		// loop through tokens
		while(readStr.hasMoreTokens()) { 
			// get token
			String token = readStr.nextToken(); 
			
			// look at the token and see what it is. Consider using switch/case here
			if(token.equals("a")||token.equals("A")||token.equals("abs")){operation = "abs";}
			if(token.equals("n")||token.equals("N")||token.equals("neg")){operation = "neg";}
			if(token.equals("c")||token.equals("C")||token.equals("clear")){operation = "clear";}
			if(token.equals("q")||token.equals("Q")||token.equals("quit")){operation = "quit";}
			
			if(token.equals("+")){
				operation = "add";
			}
			
			if(token.equals("-")){
				operation = "sub";
			}
			if(token.equals("*")){
				operation = "mply";
			}
			if(token.equals('/')){
				operation = "div";
			}
			
			if(token.contains("/") && token.length()>2){
				//this is a fraction, need to make one here
				//use StringTokeniser with delimiter "/"
				StringTokenizer fractionFound  = new StringTokenizer(token, "/");
				
				//get numerator
				String numString = fractionFound.nextToken();
				int num = Integer.parseInt(numString);
				
				//get denominator
				String denomString = fractionFound.nextToken();
				int denom = Integer.parseInt(denomString);
				
				Fraction newFraction = new Fraction(num,denom);
				
				//need to check for operation
				
				if (operation.equals("add")){
					//perform add (unit test) operation with currentValue of the calculator
					currentValue = currentValue.add(newFraction);
					operation = "";
				} else currentValue = newFraction;
				
				//no operation is remembered so set currentValue to the one made above
				
				
			}
			
			/* see if a number on its own was given
			try {
					int number = Integer.parseInt(token);
					// make a new fraction here
					
			    } catch (NumberFormatException e) {
			         //
			    }	*/
					
		}
		
		if(operation.equals("abs")){
			currentValue = frac.absValue(); 
	    }
		if(operation.equals("neg")){
			currentValue = frac.negate(); 
	    }
		if(operation.equals("clear")){
			currentValue = new Fraction (0,1); 
	    }
		if(operation.equals("quit")){
			System.out.println("The program has stopped");
			currentValue = new Fraction (0,1);
			//throw here;  
	    }
		return currentValue;
	
	}
	
}
