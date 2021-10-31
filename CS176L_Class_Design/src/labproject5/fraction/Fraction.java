package labproject5.fraction;

public class Fraction
{
    // data about a Fraction
    private int numerator;
    private int denominator;
    private int sumNumerator;
    private int sumDenominator;

    // constructor #1
    public Fraction(int n, int d)
    {
        // Set numerator and denominator instance variables from n and d
    	numerator = n;
    	denominator = d;
        // Call the reduce method below to reduce the fraction.

    }
  
    // constructor #2 (default constructor)
    public Fraction() // default constructor has no inputs
    {
    	numerator = 0;
    	denominator = 1;
    }

    // methods
    /**
     * Reduce this Fraction
     */
    private void reduce()
    {
        // Set the greatest common factor to the value of numerator.
    	int gcf = 0;
    	for(int i = 1; i<= Math.abs(denominator);i++)
    	{
    		if(numerator%i == 0 && denominator%i == 0)
    		{
    			gcf = i;
    		}
    		
    	}
        // While the greatest common factor is greater than 1:
        //      The greatest common factor is the number that divides evenly into
        //      both the numerator and denominator (use the % operator). Issue a
        //      break when the greatest common factor is found.
        //
        //      Reduce the value of greatest common factor by 1.
        // End While

    	
    	numerator = numerator/gcf;
    	denominator = denominator/gcf;
        // Divide both numerator and denominator by the greatest common factor to 
        // reduce the fraction.
    }

  
    public String toString()
    {
    	reduce();
    	return numerator + "/" + denominator;
        // return a String representation of the fraction, i.e.,
        // numerator / denominator.
        // If numerator is 3 and denominator is 5, the returned String
        // will be "3/5".
    }


    /**
     * Add Fractions and return the resulting sum Fraction
     */
    public Fraction add(Fraction f1, Fraction f2)
    {
        // You will need to get the sum of Fractions f1 and f2, resulting
        // in a sumNumerator and sumDenominator that represents the sum.
    	if(f1.getDenominator() != f2.getDenominator()) {
    		sumDenominator = f1.getDenominator() * f2.getDenominator();
    		sumNumerator = (f1.getNumerator() * f2.getDenominator()) + (f2.getNumerator() * f1.getDenominator());
    	}
    	else {
    	sumDenominator = f1.getDenominator();
    	sumNumerator = f1.getNumerator() + f2.getNumerator();
    	}
    	
        // To access f1's numerator, use f1.numerator. To access f1's denominator,
        // use f1.denominator, and so on.
    	Fraction newFraction = new Fraction(sumNumerator, sumDenominator);
    	
    	return newFraction;
        // Then you will need to construct a Fraction using the resulting
        // sumNumerator and sumDenominator and return that Fraction.
    }

    public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	/**
     * Subtract Fractions and return the resulting difference Fraction
     */
    public Fraction subtract(Fraction f1, Fraction f2)
    {
    	if(f1.getDenominator() != f2.getDenominator()) {
    		sumDenominator = f1.getDenominator() * f2.getDenominator();
    		sumNumerator = (f1.getNumerator() * f2.getDenominator()) - (f2.getNumerator() * f1.getDenominator());
    	}
    	else {
    	sumDenominator = f1.getDenominator();
    	sumNumerator = f1.getNumerator()-f2.getNumerator();
    	}
    	
       
    	Fraction otherFraction = new Fraction(sumNumerator, sumDenominator);
    	
    	return otherFraction;
    }

    /**
     * Multiply Fractions and return the resulting product Fraction
     */
    public Fraction multiply(Fraction f1, Fraction f2)
    {
      
    		sumDenominator = f1.getDenominator() * f2.getDenominator();
  
    	sumNumerator = f2.getNumerator() * f1.getNumerator();
    	
       
    	Fraction otherFraction = new Fraction(sumNumerator, sumDenominator);
    	
    	return otherFraction;
    }

    /**
     * Divide Fractions and return the resulting Fraction
     */
    public Fraction divide(Fraction f1, Fraction f2)
    {
        
      		sumDenominator = f1.getDenominator() * f2.getNumerator();
    
      	sumNumerator = f2.getDenominator() * f1.getNumerator();
      	
         
      	Fraction otherFraction = new Fraction(sumNumerator, sumDenominator);
      	
      	return otherFraction;
    }

  } // end of Fraction class

