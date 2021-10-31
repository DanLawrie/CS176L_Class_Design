package labproject5.fraction;

public class TestFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction( 5, 8 ); // fraction 5/8
	    Fraction f2 = new Fraction( 1, 9 );
	    Fraction f3 = new Fraction();
	 // Add f1 and f2 and store result in f3:
	    f3 = f3.add( f1, f2 ); // f3 holds the result of 5/8 + 1/9
	    System.out.println( f1 + " + " + f2 + " = " + f3 ); // uses the toString() method
	    // expected output: 5/8 + 1/9 = 53/72
	 // Subtract f1 and f2 and store result in f3:
	    f3 = f3.subtract( f1, f2 ); // f3 holds the result of 5/8 - 1/9
	    System.out.println( f1 + " - " + f2 + " = " + f3 );
	    // expected output: 5/8 + 1/9 = 37/72
	 // Multiply f1 and f2 and store result in f3:
	    f3 = f3.multiply( f1, f2 ); // f3 holds the result of 5/8 x 1/9
	    System.out.println( f1 + " * " + f2 + " = " + f3 );
	    // expected output: 5/8 + 1/9 = 5/72
	   f3 = f3.divide(f1,  f2);
	   System.out.println(f1 + " / " + f2 + " = " + f3);
	   //expected 45/8
	   
	}

}
