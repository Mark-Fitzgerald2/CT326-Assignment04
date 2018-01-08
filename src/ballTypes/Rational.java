package ballTypes;

import java.text.DecimalFormat;

public class Rational implements Comparable<Rational>{
	//create local variable for top of fraction
	//create local variable for bottom of fraction
	double tFraction;
	double bFraction;
	
	//setup up formatting options for output
	DecimalFormat precis = new DecimalFormat("0.00");
	DecimalFormat precis2 = new DecimalFormat("0");
	
	public Rational(double top, double bottom) {
		//set the values of the fraction to local variables
		tFraction = top;
		bFraction = bottom;
	}
	
	public String multiply(Rational first, Rational second) {
		//pass in two rational objects
		//take the two numbers on top and multiply
		//take the two numbers on bottom and multiply
		double top = first.tFraction * second.tFraction;
		double bottom = first.bFraction * second.bFraction;
		
		//return the original objects and the simplified version
		return "(" + precis2.format(first.tFraction) + "/" 
				+ precis2.format(first.bFraction) + ") * (" 
				+ precis2.format(second.tFraction) + "/" + precis2.format(second.bFraction) 
				+ ") = " + simplify(top, bottom);
	}
	
	public String divide(Rational first, Rational second) {
		//pass in two rational objects
		//cross multiply the rational objects
		double top = first.tFraction * second.bFraction;
		double bottom = first.bFraction * second.tFraction;
		
		//return the original objects and the simplified version
		return "(" + precis2.format(first.tFraction) + "/" 
				+ precis2.format(first.bFraction) + ") / (" 
				+ precis2.format(second.tFraction) + "/" + precis2.format(second.bFraction) 
				+ ") = " + simplify(top, bottom);
	}
	
	public String plus(Rational first, Rational second) {
		//pass in two rational objects
		//create common denominator and add the objects
		double top = (second.bFraction * first.tFraction) + (first.bFraction * second.tFraction);
		double bottom = first.bFraction * second.bFraction;
		
		//return the original objects and the simplified version
		return "(" + precis2.format(first.tFraction) + "/" 
				+ precis2.format(first.bFraction) + ") + (" 
				+ precis2.format(second.tFraction) + "/" + precis2.format(second.bFraction) 
				+ ") = " + simplify(top, bottom);
	}
	
	public String minus(Rational first, Rational second) {
		//pass in two rational objects
		//create a common denominator and subtract the objects
		double top =  ((second.bFraction * first.tFraction) - (first.bFraction * second.tFraction));
		double bottom = first.bFraction * second.bFraction;
		
		//return the original objects and the simplified version
		return "(" + precis2.format(first.tFraction) + "/" 
				+ precis2.format(first.bFraction) + ") - (" 
				+ precis2.format(second.tFraction) + "/" + precis2.format(second.bFraction) 
				+ ") = " + simplify(top, bottom);
	}
	
	public String simplify(double tFraction, double bFraction) {
		//pass in the values above and below the line
		double top = tFraction;
		double bottom = bFraction;
		//create a variable for the greatest common denominator
		double gcd = 1;
		
		//check if top or bottom is zero
		while(top!=0 && bottom!=0) {
			//create a new variable
			//store the value of bottom
			double var = bottom;
			//divide top by bottom and get the remainder
			bottom = top%bottom;
			//update top to the original value of bottom
			top = var;
			//eg: top = 4; bottom = 8;
			//var = 8; 
			//bottom = 4%8; 8 goes into 4 zero times with 4 as remainder
			//bottom = 4; top = 8;
			//var = 4; bottom = 8%4 = 0
			//top = 4 which is the gcd
		}
		
		//once the loop ends one of top or bottom is zero
		//the other is the greatest common denominator
		//Therefore the below line is gcd + 0 = gcd
		gcd = top+bottom;
		
		//divide the top and bottom by gcd
		double tFract = tFraction/gcd;
		double bFract = bFraction/gcd;
		//create a new rational object for this
		Rational rat = new Rational(tFract, bFract);
		
		//print out the values before simplifying occurred 
		//call toString to print simplified details
		//use the new rational object to call toString
		return precis2.format(tFraction) + "/" 
		+ precis2.format(bFraction)  + " = " + rat.toString();
	}
	
	public String toString() {
		//print out visual form of rational object
		//print out exact value
		return precis2.format(tFraction) + "/" + precis2.format(bFraction) 
				+ " = " + precis.format(tFraction/bFraction);
	}

	public String add(Rational rat) {
		//pass in two rational objects
		//create common denominator and add the objects
		double top = (rat.bFraction * tFraction) + (bFraction * rat.tFraction);
		double bottom = bFraction * rat.bFraction;
				
		//return the original objects and the simplified version
		return "(" + precis2.format(tFraction) + "/" 
					+ precis2.format(bFraction) + ") + (" 
					+ precis2.format(rat.tFraction) + "/" + precis2.format(rat.bFraction) 
					+ ") = " + simplify(top, bottom);
	}
	
	@Override
	public int compareTo(Rational other) {
		System.out.println(tFraction + "/" + bFraction);
		System.out.println(other.tFraction + "/" + other.bFraction);
		
		int compare = (int) ((tFraction * other.bFraction) - (other.tFraction * bFraction));
		System.out.println(compare);
		return compare;
	}
}
