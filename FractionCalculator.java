package myCW2;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		String op = "";
		Fraction result = frac;
		//loop through the string
		for (int i = 0; i < inputString.length(); i++){
		    //current char
			char current = inputString.charAt(i);        
		    	if (current=='A' || current =='a') op = "abs";
		    	if (current=='N' || current =='n') op = "neg";
		    	if (current=='C' || current =='c') op = "clear";
		}
		if (op.equals("abs")){
			result = frac.absValue(); 
	    }
		if (op.equals("neg")){
			result = frac.negate(); 
	    }
		if (op.equals("clear")){
			result = new Fraction (0,1); 
	    }
		return result;
	}

}
