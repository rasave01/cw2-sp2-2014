package myCW2;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		String operation = "";
		Fraction result = frac;
		//loop through the string
		for (int i = 0; i < inputString.length(); i++){
		    //current char
			char current = inputString.charAt(i);        
		    	if (current=='A' || current =='a') operation = "abs";
		    	if (current=='N' || current =='n') operation = "neg";
		    	if (current=='C' || current =='c') operation = "clear";
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
		return result;
	}

}
