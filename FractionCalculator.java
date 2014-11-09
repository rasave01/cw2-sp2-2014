package myCW2;

public class FractionCalculator {

	public Fraction evaluate(Fraction frac, String inputString){
		String op = "";
		Fraction result = frac;
		//loop through the string
		for (int i = 0; i < inputString.length(); i++){
		    //current char
			char current = inputString.charAt(i);        
		    	if (current=='A') op = "abs";
		}
		if (op.equals("abs")){
			result = frac.absValue(); 
	    }
		return result;
	}

}
