package myCW2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); 
	    // this should use exceptions
            return;
        }
        int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
    }

    @Override
    public String toString() {
    	if(this.getDenominator() == 1) {
    		return "" + getNumerator();
    	}
        return "" + getNumerator() + '/' + getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public Fraction multiply(Fraction other) {
        int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
    }

    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

	public Fraction absValue() {
		 int num = this.getNumerator();
	     int denom = this.getDenominator();
		if(num<0) {
			num = num*-1;
			}
		if(denom<0) {
			denom = denom*-1;
			}
		return new Fraction(num, denom);
	}

	public Fraction negate() {
		int num = this.getNumerator();
		int denom = this.getDenominator();
		if (num < 0){
			if (denom <0){
				denom = denom *-1;
				return new Fraction(num, denom);
			}
			num = num * -1;
			return new Fraction(num, denom);
		}
		if (denom < 0){
			num = num * -1;
			denom = denom * -1;
			return new Fraction(num, denom);
		}
		num = num * -1;
		return new Fraction(num, denom);
	}

	public Fraction inverse() {
		int num = this.getNumerator();
		int denom = this.getDenominator();
		return new Fraction(denom, num);
	}

	public Fraction divide(Fraction other) {
		Fraction div = this.multiply(other.inverse());
		return div;
	}

	public Fraction add(Fraction other) {
		int newNum = this.getNumerator()*other.getDenominator()+other.getNumerator()*this.getDenominator();
		int newDenom = this.getDenominator()*other.getDenominator();
		return new Fraction(newNum, newDenom);
	}

//	public Fraction add(Fraction other) {
//		int num = this.getNumerator()
//		return new Fraction(num, denom);
//	}
}
